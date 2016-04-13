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
import android.view.View;
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
        LocationListener, View.OnClickListener {

    private RecyclerView mRecyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;

    private GoogleApiClient mGoogleApiClient;
    private WeatherVO weatherVO;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mRecyclerView = (RecyclerView) findViewById(R.id.weather_forecast_recycler);

        // use this setting to improve performance if you know that changes
        // in content do not change the layout size of the RecyclerView
        mRecyclerView.setHasFixedSize(true);

        // use a linear layout manager
        //Make views scroll horizontally.
        mLayoutManager = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);
        mRecyclerView.setLayoutManager(mLayoutManager);

        setDefaultLatLong();
        new RequestWeatherVolley(this, Model.getInstance().getLocation());

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
        EventBusUtility.getInstance().unregister(this);
    }

    @Override
    protected void onResume() {
        super.onResume();
        EventBusUtility.getInstance().register(this);
    }

    protected void onStart() {
        mGoogleApiClient.connect();
        super.onStart();
    }

    protected void onStop() {
        mGoogleApiClient.disconnect();
        super.onStop();
    }

    private void setDefaultLatLong() {
        double lat_point = Double.parseDouble(getString(R.string.default_latitude));
        double lng_point = Double.parseDouble(getString(R.string.default_longitude));

        Model.getInstance().setLongitude(lng_point);
        Model.getInstance().setLatitude(lat_point);
    }

    @Override
    public void onConnected(Bundle bundle) {
        if (ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED && ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_COARSE_LOCATION) != PackageManager.PERMISSION_GRANTED) {
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

    @Subscribe
    public void onRequestReturned(WeatherDataUpdateEvent event) {
        weatherVO = Model.getInstance().getWeather();
        mAdapter = new WeatherForecastRecyclerAdapter(weatherVO);
        mRecyclerView.setAdapter(mAdapter);
        mRecyclerView.getAdapter().notifyDataSetChanged();

        Toast.makeText(this,"Location Updated",Toast.LENGTH_SHORT).show();

    }

    @Override
    public void onClick(View v) {


    }
}
