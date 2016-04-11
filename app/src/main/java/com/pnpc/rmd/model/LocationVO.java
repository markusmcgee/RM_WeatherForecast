package com.pnpc.rmd.model;

import java.util.HashMap;
import java.util.Map;

public class LocationVO {

    private String region;
    private String latitude;
    private String longitude;
    private String elevation;
    private String wfo;
    private String timezone;
    private String areaDescription;
    private String radar;
    private String zone;
    private String county;
    private String firezone;
    private String metar;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     *
     */
    public LocationVO() {
    }

    /**
     *
     * @param region
     * @param areaDescription
     * @param timezone
     * @param wfo
     * @param county
     * @param elevation
     * @param firezone
     * @param radar
     * @param longitude
     * @param latitude
     * @param zone
     * @param metar
     */
    public LocationVO(String region, String latitude, String longitude, String elevation, String wfo, String timezone, String areaDescription, String radar, String zone, String county, String firezone, String metar) {
        this.region = region;
        this.latitude = latitude;
        this.longitude = longitude;
        this.elevation = elevation;
        this.wfo = wfo;
        this.timezone = timezone;
        this.areaDescription = areaDescription;
        this.radar = radar;
        this.zone = zone;
        this.county = county;
        this.firezone = firezone;
        this.metar = metar;
    }

    /**
     *
     * @return
     * The region
     */
    public String getRegion() {
        return region;
    }

    /**
     *
     * @param region
     * The region
     */
    public void setRegion(String region) {
        this.region = region;
    }

    public LocationVO withRegion(String region) {
        this.region = region;
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

    public LocationVO withLatitude(String latitude) {
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

    public LocationVO withLongitude(String longitude) {
        this.longitude = longitude;
        return this;
    }

    /**
     *
     * @return
     * The elevation
     */
    public String getElevation() {
        return elevation;
    }

    /**
     *
     * @param elevation
     * The elevation
     */
    public void setElevation(String elevation) {
        this.elevation = elevation;
    }

    public LocationVO withElevation(String elevation) {
        this.elevation = elevation;
        return this;
    }

    /**
     *
     * @return
     * The wfo
     */
    public String getWfo() {
        return wfo;
    }

    /**
     *
     * @param wfo
     * The wfo
     */
    public void setWfo(String wfo) {
        this.wfo = wfo;
    }

    public LocationVO withWfo(String wfo) {
        this.wfo = wfo;
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

    public LocationVO withTimezone(String timezone) {
        this.timezone = timezone;
        return this;
    }

    /**
     *
     * @return
     * The areaDescription
     */
    public String getAreaDescription() {
        return areaDescription;
    }

    /**
     *
     * @param areaDescription
     * The areaDescription
     */
    public void setAreaDescription(String areaDescription) {
        this.areaDescription = areaDescription;
    }

    public LocationVO withAreaDescription(String areaDescription) {
        this.areaDescription = areaDescription;
        return this;
    }

    /**
     *
     * @return
     * The radar
     */
    public String getRadar() {
        return radar;
    }

    /**
     *
     * @param radar
     * The radar
     */
    public void setRadar(String radar) {
        this.radar = radar;
    }

    public LocationVO withRadar(String radar) {
        this.radar = radar;
        return this;
    }

    /**
     *
     * @return
     * The zone
     */
    public String getZone() {
        return zone;
    }

    /**
     *
     * @param zone
     * The zone
     */
    public void setZone(String zone) {
        this.zone = zone;
    }

    public LocationVO withZone(String zone) {
        this.zone = zone;
        return this;
    }

    /**
     *
     * @return
     * The county
     */
    public String getCounty() {
        return county;
    }

    /**
     *
     * @param county
     * The county
     */
    public void setCounty(String county) {
        this.county = county;
    }

    public LocationVO withCounty(String county) {
        this.county = county;
        return this;
    }

    /**
     *
     * @return
     * The firezone
     */
    public String getFirezone() {
        return firezone;
    }

    /**
     *
     * @param firezone
     * The firezone
     */
    public void setFirezone(String firezone) {
        this.firezone = firezone;
    }

    public LocationVO withFirezone(String firezone) {
        this.firezone = firezone;
        return this;
    }

    /**
     *
     * @return
     * The metar
     */
    public String getMetar() {
        return metar;
    }

    /**
     *
     * @param metar
     * The metar
     */
    public void setMetar(String metar) {
        this.metar = metar;
    }

    public LocationVO withMetar(String metar) {
        this.metar = metar;
        return this;
    }


    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    public LocationVO withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }



}