package com.pnpc.rmd.model;

/**
 * Created by markusmcgee on 4/11/16.
 */
public final class Model {
    private static Model instance = null;
    private WeatherVO weather;
    private Model() { }
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
}