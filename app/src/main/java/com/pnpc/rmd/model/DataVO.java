package com.pnpc.rmd.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DataVO {

    private List<String> temperature = new ArrayList<String>();
    private List<Object> pop = new ArrayList<Object>();
    private List<String> weather = new ArrayList<String>();
    private List<String> iconLink = new ArrayList<String>();
    private List<String> hazard = new ArrayList<String>();
    private List<String> hazardUrl = new ArrayList<String>();
    private List<String> text = new ArrayList<String>();
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     *
     */
    public DataVO() {
    }

    /**
     *
     * @param text
     * @param iconLink
     * @param hazard
     * @param weather
     * @param pop
     * @param hazardUrl
     * @param temperature
     */
    public DataVO(List<String> temperature, List<Object> pop, List<String> weather, List<String> iconLink, List<String> hazard, List<String> hazardUrl, List<String> text) {
        this.temperature = temperature;
        this.pop = pop;
        this.weather = weather;
        this.iconLink = iconLink;
        this.hazard = hazard;
        this.hazardUrl = hazardUrl;
        this.text = text;
    }

    /**
     *
     * @return
     * The temperature
     */
    public List<String> getTemperature() {
        return temperature;
    }

    /**
     *
     * @param temperature
     * The temperature
     */
    public void setTemperature(List<String> temperature) {
        this.temperature = temperature;
    }

    public DataVO withTemperature(List<String> temperature) {
        this.temperature = temperature;
        return this;
    }

    /**
     *
     * @return
     * The pop
     */
    public List<Object> getPop() {
        return pop;
    }

    /**
     *
     * @param pop
     * The pop
     */
    public void setPop(List<Object> pop) {
        this.pop = pop;
    }

    public DataVO withPop(List<Object> pop) {
        this.pop = pop;
        return this;
    }

    /**
     *
     * @return
     * The weather
     */
    public List<String> getWeather() {
        return weather;
    }

    /**
     *
     * @param weather
     * The weather
     */
    public void setWeather(List<String> weather) {
        this.weather = weather;
    }

    public DataVO withWeather(List<String> weather) {
        this.weather = weather;
        return this;
    }

    /**
     *
     * @return
     * The iconLink
     */
    public List<String> getIconLink() {
        return iconLink;
    }

    /**
     *
     * @param iconLink
     * The iconLink
     */
    public void setIconLink(List<String> iconLink) {
        this.iconLink = iconLink;
    }

    public DataVO withIconLink(List<String> iconLink) {
        this.iconLink = iconLink;
        return this;
    }

    /**
     *
     * @return
     * The hazard
     */
    public List<String> getHazard() {
        return hazard;
    }

    /**
     *
     * @param hazard
     * The hazard
     */
    public void setHazard(List<String> hazard) {
        this.hazard = hazard;
    }

    public DataVO withHazard(List<String> hazard) {
        this.hazard = hazard;
        return this;
    }

    /**
     *
     * @return
     * The hazardUrl
     */
    public List<String> getHazardUrl() {
        return hazardUrl;
    }

    /**
     *
     * @param hazardUrl
     * The hazardUrl
     */
    public void setHazardUrl(List<String> hazardUrl) {
        this.hazardUrl = hazardUrl;
    }

    public DataVO withHazardUrl(List<String> hazardUrl) {
        this.hazardUrl = hazardUrl;
        return this;
    }

    /**
     *
     * @return
     * The text
     */
    public List<String> getText() {
        return text;
    }

    /**
     *
     * @param text
     * The text
     */
    public void setText(List<String> text) {
        this.text = text;
    }

    public DataVO withText(List<String> text) {
        this.text = text;
        return this;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    public DataVO withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }


}