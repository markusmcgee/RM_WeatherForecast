package com.pnpc.rmd.service;

import android.content.Context;
import android.location.Location;
import android.util.Log;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.Volley;
import com.google.gson.Gson;
import com.pnpc.rmd.WeatherDataUpdateEvent;
import com.pnpc.rmd.EventBusUtility;
import com.pnpc.rmd.R;
import com.pnpc.rmd.model.Model;
import com.pnpc.rmd.model.WeatherVO;

import org.json.JSONObject;

/**
 * Created by markusmcgee on 4/12/16.
 *
 * Standard Java class that executes a Volley service request.
 *
 */
public class RequestWeatherVolley {

    private Location location;
    private Context context;

    private WeatherVO weather;

    //Constuctor receives current context, location and makes the call.
    public RequestWeatherVolley(Context context, Location location) {
        this.location = location;
        this.context = context;
        makeRequest();
    }

    //function places Volley request into RequestQueue.
    //Volley will send Otto event notification when done in event though RequestWeatherVolley maybe GC.
    //Volley designed to work in background with minimal code as shown below.
    private void makeRequest() {
        String weather_url;
        weather_url = context.getString(R.string.forcast_weather_gov_url);
        weather_url = weather_url.replace("LONGITUDE", Double.toString(location.getLongitude()));
        weather_url = weather_url.replace("LATITUDE", Double.toString(location.getLatitude()));

        RequestQueue requestQueue = Volley.newRequestQueue(context);
        JsonObjectRequest jsonObjectRequest = new JsonObjectRequest(Request.Method.GET, weather_url, null, new Response.Listener<JSONObject>() {
            @Override
            public void onResponse(JSONObject response) {
                Log.d("json", response.toString());
                    weather = new Gson().fromJson(response.toString(), WeatherVO.class);
                    Model.getInstance().setWeather(weather);
                    EventBusUtility.getInstance().post(new WeatherDataUpdateEvent());
                    }
                },
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {
                        Log.d("debug", error.toString());
                    }
                });
        requestQueue.add(jsonObjectRequest);

    }

}
