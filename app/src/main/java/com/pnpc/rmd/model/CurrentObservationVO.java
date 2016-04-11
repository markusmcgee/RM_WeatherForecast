package com.pnpc.rmd.model;

import java.util.HashMap;
import java.util.Map;

public class CurrentObservationVO {

    private String id;
    private String name;
    private String elev;
    private String latitude;
    private String longitude;
    private String Date;
    private String Temp;
    private String Dewp;
    private String Relh;
    private String Winds;
    private String Windd;
    private String Gust;
    private String Weather;
    private String Weatherimage;
    private String Visibility;
    private String Altimeter;
    private String SLP;
    private String timezone;
    private String state;
    private String WindChill;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     *
     */
    public CurrentObservationVO() {
    }

    /**
     *
     * @param Altimeter
     * @param Weather
     * @param Gust
     * @param Winds
     * @param elev
     * @param WindChill
     * @param Weatherimage
     * @param state
     * @param Relh
     * @param Dewp
     * @param id
     * @param SLP
     * @param timezone
     * @param Windd
     * @param Date
     * @param name
     * @param Visibility
     * @param longitude
     * @param latitude
     * @param Temp
     */
    public CurrentObservationVO(String id, String name, String elev, String latitude, String longitude, String Date, String Temp, String Dewp, String Relh, String Winds, String Windd, String Gust, String Weather, String Weatherimage, String Visibility, String Altimeter, String SLP, String timezone, String state, String WindChill) {
        this.id = id;
        this.name = name;
        this.elev = elev;
        this.latitude = latitude;
        this.longitude = longitude;
        this.Date = Date;
        this.Temp = Temp;
        this.Dewp = Dewp;
        this.Relh = Relh;
        this.Winds = Winds;
        this.Windd = Windd;
        this.Gust = Gust;
        this.Weather = Weather;
        this.Weatherimage = Weatherimage;
        this.Visibility = Visibility;
        this.Altimeter = Altimeter;
        this.SLP = SLP;
        this.timezone = timezone;
        this.state = state;
        this.WindChill = WindChill;
    }

    /**
     *
     * @return
     * The id
     */
    public String getId() {
        return id;
    }

    /**
     *
     * @param id
     * The id
     */
    public void setId(String id) {
        this.id = id;
    }

    public CurrentObservationVO withId(String id) {
        this.id = id;
        return this;
    }

    /**
     *
     * @return
     * The name
     */
    public String getName() {
        return name;
    }

    /**
     *
     * @param name
     * The name
     */
    public void setName(String name) {
        this.name = name;
    }

    public CurrentObservationVO withName(String name) {
        this.name = name;
        return this;
    }

    /**
     *
     * @return
     * The elev
     */
    public String getElev() {
        return elev;
    }

    /**
     *
     * @param elev
     * The elev
     */
    public void setElev(String elev) {
        this.elev = elev;
    }

    public CurrentObservationVO withElev(String elev) {
        this.elev = elev;
        return this;
    }

    /**
     *
     * @return
     * The latitude
     */
    public String getLatitude() {
        return latitude;
    }

    /**
     *
     * @param latitude
     * The latitude
     */
    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public CurrentObservationVO withLatitude(String latitude) {
        this.latitude = latitude;
        return this;
    }

    /**
     *
     * @return
     * The longitude
     */
    public String getLongitude() {
        return longitude;
    }

    /**
     *
     * @param longitude
     * The longitude
     */
    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public CurrentObservationVO withLongitude(String longitude) {
        this.longitude = longitude;
        return this;
    }

    /**
     *
     * @return
     * The Date
     */
    public String getDate() {
        return Date;
    }

    /**
     *
     * @param Date
     * The Date
     */
    public void setDate(String Date) {
        this.Date = Date;
    }

    public CurrentObservationVO withDate(String Date) {
        this.Date = Date;
        return this;
    }

    /**
     *
     * @return
     * The Temp
     */
    public String getTemp() {
        return Temp;
    }

    /**
     *
     * @param Temp
     * The Temp
     */
    public void setTemp(String Temp) {
        this.Temp = Temp;
    }

    public CurrentObservationVO withTemp(String Temp) {
        this.Temp = Temp;
        return this;
    }

    /**
     *
     * @return
     * The Dewp
     */
    public String getDewp() {
        return Dewp;
    }

    /**
     *
     * @param Dewp
     * The Dewp
     */
    public void setDewp(String Dewp) {
        this.Dewp = Dewp;
    }

    public CurrentObservationVO withDewp(String Dewp) {
        this.Dewp = Dewp;
        return this;
    }

    /**
     *
     * @return
     * The Relh
     */
    public String getRelh() {
        return Relh;
    }

    /**
     *
     * @param Relh
     * The Relh
     */
    public void setRelh(String Relh) {
        this.Relh = Relh;
    }

    public CurrentObservationVO withRelh(String Relh) {
        this.Relh = Relh;
        return this;
    }

    /**
     *
     * @return
     * The Winds
     */
    public String getWinds() {
        return Winds;
    }

    /**
     *
     * @param Winds
     * The Winds
     */
    public void setWinds(String Winds) {
        this.Winds = Winds;
    }

    public CurrentObservationVO withWinds(String Winds) {
        this.Winds = Winds;
        return this;
    }

    /**
     *
     * @return
     * The Windd
     */
    public String getWindd() {
        return Windd;
    }

    /**
     *
     * @param Windd
     * The Windd
     */
    public void setWindd(String Windd) {
        this.Windd = Windd;
    }

    public CurrentObservationVO withWindd(String Windd) {
        this.Windd = Windd;
        return this;
    }

    /**
     *
     * @return
     * The Gust
     */
    public String getGust() {
        return Gust;
    }

    /**
     *
     * @param Gust
     * The Gust
     */
    public void setGust(String Gust) {
        this.Gust = Gust;
    }

    public CurrentObservationVO withGust(String Gust) {
        this.Gust = Gust;
        return this;
    }

    /**
     *
     * @return
     * The WeatherVO
     */
    public String getWeather() {
        return Weather;
    }

    /**
     *
     * @param Weather
     * The WeatherVO
     */
    public void setWeather(String Weather) {
        this.Weather = Weather;
    }

    public CurrentObservationVO withWeather(String Weather) {
        this.Weather = Weather;
        return this;
    }

    /**
     *
     * @return
     * The Weatherimage
     */
    public String getWeatherimage() {
        return Weatherimage;
    }

    /**
     *
     * @param Weatherimage
     * The Weatherimage
     */
    public void setWeatherimage(String Weatherimage) {
        this.Weatherimage = Weatherimage;
    }

    public CurrentObservationVO withWeatherimage(String Weatherimage) {
        this.Weatherimage = Weatherimage;
        return this;
    }

    /**
     *
     * @return
     * The Visibility
     */
    public String getVisibility() {
        return Visibility;
    }

    /**
     *
     * @param Visibility
     * The Visibility
     */
    public void setVisibility(String Visibility) {
        this.Visibility = Visibility;
    }

    public CurrentObservationVO withVisibility(String Visibility) {
        this.Visibility = Visibility;
        return this;
    }

    /**
     *
     * @return
     * The Altimeter
     */
    public String getAltimeter() {
        return Altimeter;
    }

    /**
     *
     * @param Altimeter
     * The Altimeter
     */
    public void setAltimeter(String Altimeter) {
        this.Altimeter = Altimeter;
    }

    public CurrentObservationVO withAltimeter(String Altimeter) {
        this.Altimeter = Altimeter;
        return this;
    }

    /**
     *
     * @return
     * The SLP
     */
    public String getSLP() {
        return SLP;
    }

    /**
     *
     * @param SLP
     * The SLP
     */
    public void setSLP(String SLP) {
        this.SLP = SLP;
    }

    public CurrentObservationVO withSLP(String SLP) {
        this.SLP = SLP;
        return this;
    }

    /**
     *
     * @return
     * The timezone
     */
    public String getTimezone() {
        return timezone;
    }

    /**
     *
     * @param timezone
     * The timezone
     */
    public void setTimezone(String timezone) {
        this.timezone = timezone;
    }

    public CurrentObservationVO withTimezone(String timezone) {
        this.timezone = timezone;
        return this;
    }

    /**
     *
     * @return
     * The state
     */
    public String getState() {
        return state;
    }

    /**
     *
     * @param state
     * The state
     */
    public void setState(String state) {
        this.state = state;
    }

    public CurrentObservationVO withState(String state) {
        this.state = state;
        return this;
    }

    /**
     *
     * @return
     * The WindChill
     */
    public String getWindChill() {
        return WindChill;
    }

    /**
     *
     * @param WindChill
     * The WindChill
     */
    public void setWindChill(String WindChill) {
        this.WindChill = WindChill;
    }

    public CurrentObservationVO withWindChill(String WindChill) {
        this.WindChill = WindChill;
        return this;
    }


    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    public CurrentObservationVO withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

}
