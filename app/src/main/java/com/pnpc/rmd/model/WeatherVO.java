package com.pnpc.rmd.model;

import java.util.HashMap;
import java.util.Map;
public class WeatherVO {

    private String operationalMode;
    private String srsName;
    private String creationDate;
    private String creationDateLocal;
    private String productionCenter;
    private String credit;
    private String moreInformation;
    private LocationVO location;
    private TimeVO time;
    private DataVO data;
    private CurrentObservationVO currentobservation;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     *
     */
    public WeatherVO() {
    }

    /**
     *
     * @param creationDate
     * @param currentobservation
     * @param time
     * @param srsName
     * @param productionCenter
     * @param moreInformation
     * @param location
     * @param data
     * @param operationalMode
     * @param credit
     * @param creationDateLocal
     */
    public WeatherVO(String operationalMode, String srsName, String creationDate, String creationDateLocal, String productionCenter, String credit, String moreInformation, LocationVO location, TimeVO time, DataVO data, CurrentObservationVO currentobservation) {
        this.operationalMode = operationalMode;
        this.srsName = srsName;
        this.creationDate = creationDate;
        this.creationDateLocal = creationDateLocal;
        this.productionCenter = productionCenter;
        this.credit = credit;
        this.moreInformation = moreInformation;
        this.location = location;
        this.time = time;
        this.data = data;
        this.currentobservation = currentobservation;
    }

    /**
     *
     * @return
     * The operationalMode
     */
    public String getOperationalMode() {
        return operationalMode;
    }

    /**
     *
     * @param operationalMode
     * The operationalMode
     */
    public void setOperationalMode(String operationalMode) {
        this.operationalMode = operationalMode;
    }

    public WeatherVO withOperationalMode(String operationalMode) {
        this.operationalMode = operationalMode;
        return this;
    }

    /**
     *
     * @return
     * The srsName
     */
    public String getSrsName() {
        return srsName;
    }

    /**
     *
     * @param srsName
     * The srsName
     */
    public void setSrsName(String srsName) {
        this.srsName = srsName;
    }

    public WeatherVO withSrsName(String srsName) {
        this.srsName = srsName;
        return this;
    }

    /**
     *
     * @return
     * The creationDate
     */
    public String getCreationDate() {
        return creationDate;
    }

    /**
     *
     * @param creationDate
     * The creationDate
     */
    public void setCreationDate(String creationDate) {
        this.creationDate = creationDate;
    }

    public WeatherVO withCreationDate(String creationDate) {
        this.creationDate = creationDate;
        return this;
    }

    /**
     *
     * @return
     * The creationDateLocal
     */
    public String getCreationDateLocal() {
        return creationDateLocal;
    }

    /**
     *
     * @param creationDateLocal
     * The creationDateLocal
     */
    public void setCreationDateLocal(String creationDateLocal) {
        this.creationDateLocal = creationDateLocal;
    }

    public WeatherVO withCreationDateLocal(String creationDateLocal) {
        this.creationDateLocal = creationDateLocal;
        return this;
    }

    /**
     *
     * @return
     * The productionCenter
     */
    public String getProductionCenter() {
        return productionCenter;
    }

    /**
     *
     * @param productionCenter
     * The productionCenter
     */
    public void setProductionCenter(String productionCenter) {
        this.productionCenter = productionCenter;
    }

    public WeatherVO withProductionCenter(String productionCenter) {
        this.productionCenter = productionCenter;
        return this;
    }

    /**
     *
     * @return
     * The credit
     */
    public String getCredit() {
        return credit;
    }

    /**
     *
     * @param credit
     * The credit
     */
    public void setCredit(String credit) {
        this.credit = credit;
    }

    public WeatherVO withCredit(String credit) {
        this.credit = credit;
        return this;
    }

    /**
     *
     * @return
     * The moreInformation
     */
    public String getMoreInformation() {
        return moreInformation;
    }

    /**
     *
     * @param moreInformation
     * The moreInformation
     */
    public void setMoreInformation(String moreInformation) {
        this.moreInformation = moreInformation;
    }

    public WeatherVO withMoreInformation(String moreInformation) {
        this.moreInformation = moreInformation;
        return this;
    }

    /**
     *
     * @return
     * The location
     */
    public LocationVO getLocation() {
        return location;
    }

    /**
     *
     * @param location
     * The location
     */
    public void setLocation(LocationVO location) {
        this.location = location;
    }

    public WeatherVO withLocation(LocationVO location) {
        this.location = location;
        return this;
    }

    /**
     *
     * @return
     * The time
     */
    public TimeVO getTime() {
        return time;
    }

    /**
     *
     * @param time
     * The time
     */
    public void setTime(TimeVO time) {
        this.time = time;
    }

    public WeatherVO withTime(TimeVO time) {
        this.time = time;
        return this;
    }

    /**
     *
     * @return
     * The data
     */
    public DataVO getData() {
        return data;
    }

    /**
     *
     * @param data
     * The data
     */
    public void setData(DataVO data) {
        this.data = data;
    }

    public WeatherVO withData(DataVO data) {
        this.data = data;
        return this;
    }

    /**
     *
     * @return
     * The currentobservation
     */
    public CurrentObservationVO getCurrentobservation() {
        return currentobservation;
    }

    /**
     *
     * @param currentobservation
     * The currentobservation
     */
    public void setCurrentobservation(CurrentObservationVO currentobservation) {
        this.currentobservation = currentobservation;
    }

    public WeatherVO withCurrentobservation(CurrentObservationVO currentobservation) {
        this.currentobservation = currentobservation;
        return this;
    }



    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    public WeatherVO withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }



}