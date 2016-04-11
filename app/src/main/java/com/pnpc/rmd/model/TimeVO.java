package com.pnpc.rmd.model;

import java.util.HashMap;
import java.util.Map;


import java.util.ArrayList;
import java.util.List;

public class TimeVO {

    private String layoutKey;
    private List<String> startPeriodName = new ArrayList<String>();
    private List<String> startValidTime = new ArrayList<String>();
    private List<String> tempLabel = new ArrayList<String>();
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     *
     */
    public TimeVO() {
    }

    /**
     *
     * @param tempLabel
     * @param layoutKey
     * @param startPeriodName
     * @param startValidTime
     */
    public TimeVO(String layoutKey, List<String> startPeriodName, List<String> startValidTime, List<String> tempLabel) {
        this.layoutKey = layoutKey;
        this.startPeriodName = startPeriodName;
        this.startValidTime = startValidTime;
        this.tempLabel = tempLabel;
    }

    /**
     *
     * @return
     * The layoutKey
     */
    public String getLayoutKey() {
        return layoutKey;
    }

    /**
     *
     * @param layoutKey
     * The layoutKey
     */
    public void setLayoutKey(String layoutKey) {
        this.layoutKey = layoutKey;
    }

    public TimeVO withLayoutKey(String layoutKey) {
        this.layoutKey = layoutKey;
        return this;
    }

    /**
     *
     * @return
     * The startPeriodName
     */
    public List<String> getStartPeriodName() {
        return startPeriodName;
    }

    /**
     *
     * @param startPeriodName
     * The startPeriodName
     */
    public void setStartPeriodName(List<String> startPeriodName) {
        this.startPeriodName = startPeriodName;
    }

    public TimeVO withStartPeriodName(List<String> startPeriodName) {
        this.startPeriodName = startPeriodName;
        return this;
    }

    /**
     *
     * @return
     * The startValidTime
     */
    public List<String> getStartValidTime() {
        return startValidTime;
    }

    /**
     *
     * @param startValidTime
     * The startValidTime
     */
    public void setStartValidTime(List<String> startValidTime) {
        this.startValidTime = startValidTime;
    }

    public TimeVO withStartValidTime(List<String> startValidTime) {
        this.startValidTime = startValidTime;
        return this;
    }

    /**
     *
     * @return
     * The tempLabel
     */
    public List<String> getTempLabel() {
        return tempLabel;
    }

    /**
     *
     * @param tempLabel
     * The tempLabel
     */
    public void setTempLabel(List<String> tempLabel) {
        this.tempLabel = tempLabel;
    }

    public TimeVO withTempLabel(List<String> tempLabel) {
        this.tempLabel = tempLabel;
        return this;
    }


    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    public TimeVO withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

}