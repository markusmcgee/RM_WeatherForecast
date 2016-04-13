package com.pnpc.rmd.model;

import android.location.Location;

/**
 * Created by markusmcgee on 4/11/16.
 */
public final class Model {
    private static Model instance = null;
    private WeatherVO weather;
    private Location location;
    private double lng;
    private double lat;

    private Model() {
    }

    public static synchronized Model getInstance() {
        if (instance == null) {
            instance = new Model();
        }
        return instance;
    }

    public WeatherVO getWeather() {
        return weather;
    }

    public void setWeather(WeatherVO weather) {
        this.weather = weather;
    }

    public Location getLocation() {
        if (location == null) {
            location = new Location("");//provider name is unecessary
            location.setLatitude(getLatitude());//your coords of course
            location.setLongitude(getLongitude());

        }
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public void setLongitude(double lng) {
        this.lng = lng;
    }

    public void setLatitude(double lat) {
        this.lat = lat;
    }

    public double getLatitude() {
        return lat;
    }

    public double getLongitude() {
        return lng;
    }
}