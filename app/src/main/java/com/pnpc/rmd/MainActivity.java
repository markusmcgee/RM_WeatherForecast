package com.pnpc.rmd;

import android.Manifest;
import android.content.pm.PackageManager;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Bundle;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.Toast;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.location.LocationServices;
import com.pnpc.rmd.model.Model;
import com.pnpc.rmd.model.WeatherVO;
import com.pnpc.rmd.service.RequestWeatherVolley;
import com.squareup.otto.Subscribe;

public class MainActivity extends AppCompatActivity implements GoogleApiClient.ConnectionCallbacks,
        GoogleApiClient.OnConnectionFailedListener,
        LocationListener{

    private RecyclerView mRecyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;

    private GoogleApiClient mGoogleApiClient;
    private WeatherVO weatherVO;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Recycler used to display views
        mRecyclerView = (RecyclerView) findViewById(R.id.weather_forecast_recycler);

        //Since API is returning current weather as well as the next few days
        //fixed size set to false.
        mRecyclerView.setHasFixedSize(false);

        //Enable Horizontal swipe and let Android do all the work for swiping.
        mLayoutManager = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);
        mRecyclerView.setLayoutManager(mLayoutManager);

        //Set the default lat long from our string resources.
        setDefaultLatLong();

        //Request weather data using class containing Volley.
        //Location held in Model singleton.
        new RequestWeatherVolley(this, Model.getInstance().getLocation());

        //Start pinging Location services on device.
        if (mGoogleApiClient == null) {
            mGoogleApiClient = new GoogleApiClient.Builder(getApplicationContext())
                    .addApi(LocationServices.API)
                    .addConnectionCallbacks(this)
                    .addOnConnectionFailedListener(this)
                    .build();
        }
    }

    @Override
    protected void onPause() {
        super.onPause();
        //Otto event bus used to get notification on when service has updated model.
        //Unregister to prevent memory leaks.  App going to background.
        EventBusUtility.getInstance().unregister(this);
    }

    @Override
    protected void onResume() {
        super.onResume();
        //Otto event bus used to get notification on when service has updated model.
        //Register event bus when app comes to foreground.
        EventBusUtility.getInstance().register(this);
    }

    protected void onStart() {
        //When application starts try to connection to location services defined in onCreate.
        mGoogleApiClient.connect();
        super.onStart();
    }

    protected void onStop() {
        //When application stops disconnect from location services.  Try to save battery.
        mGoogleApiClient.disconnect();
        super.onStop();
    }

    //Get default lat long from string.xml
    private void setDefaultLatLong() {
        double lat_point = Double.parseDouble(getString(R.string.default_latitude));
        double lng_point = Double.parseDouble(getString(R.string.default_longitude));

        Model.getInstance().setLongitude(lng_point);
        Model.getInstance().setLatitude(lat_point);
    }

    @Override
    public void onConnected(Bundle bundle) {

        //Once connected to location service check to see if we have permission to use location service and
        //pull location passively every 10 seconds with a check for location change of 5 meters.
        if (ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED && ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_COARSE_LOCATION) != PackageManager.PERMISSION_GRANTED) {

            //If we do not have access then pull default lat long.
            setDefaultLatLong();

        } else {
            LocationManager locationManager = (LocationManager) getSystemService(LOCATION_SERVICE);
            locationManager.requestLocationUpdates(LocationManager.PASSIVE_PROVIDER, 10000, 5, this);
        }
    }

    @Override
    public void onConnectionSuspended(int i) {

    }

    @Override
    public void onConnectionFailed(ConnectionResult connectionResult) {
        setDefaultLatLong();
    }

    @Override
    public void onLocationChanged(Location location) {
        Model.getInstance().setLocation(location);
        new RequestWeatherVolley(this, Model.getInstance().getLocation());
    }

    @Override
    public void onStatusChanged(String provider, int status, Bundle extras) {
    }

    @Override
    public void onProviderEnabled(String provider) {

    }

    @Override
    public void onProviderDisabled(String provider) {

    }

    //When event is dispatched from Otto it is caught here in the main and only running Activity.
    @Subscribe
    public void onRequestReturned(WeatherDataUpdateEvent event) {
        weatherVO = Model.getInstance().getWeather();

        //request new weather forecast recycler adapter
        mAdapter = new WeatherForecastRecyclerAdapter(weatherVO);
        mRecyclerView.setAdapter(mAdapter);

        //NotifiyDataSetChanged will let recycler now it has new data and should update itself when it has a chance too.
        mRecyclerView.getAdapter().notifyDataSetChanged();

        //Toast to see if it's actually updating.
        Toast.makeText(this,"Location Updated",Toast.LENGTH_SHORT).show();

    }

}
