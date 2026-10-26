package com.meetbot.openapi.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * Meta Conversions API 单条转化事件。
 *
 * @see <a href="https://developers.facebook.com/documentation/marketing-api/conversions-api">Conversions API</a>
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class ConversionEvent extends ExtensibleDto {

    @JsonProperty("event_name")
    private String eventName;

    @JsonProperty("event_time")
    private Long eventTime;

    @JsonProperty("event_id")
    private String eventId;

    @JsonProperty("event_source_url")
    private String eventSourceUrl;

    @JsonProperty("action_source")
    private String actionSource;

    @JsonProperty("opt_out")
    private Boolean optOut;

    @JsonProperty("user_data")
    private ConversionUserData userData;

    @JsonProperty("custom_data")
    private ConversionCustomData customData;

    @JsonProperty("data_processing_options")
    private List<String> dataProcessingOptions;

    @JsonProperty("data_processing_options_country")
    private Integer dataProcessingOptionsCountry;

    @JsonProperty("data_processing_options_state")
    private Integer dataProcessingOptionsState;

    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public ConversionEvent eventName(String eventName) {
        this.eventName = eventName;
        return this;
    }

    public Long getEventTime() {
        return eventTime;
    }

    public void setEventTime(Long eventTime) {
        this.eventTime = eventTime;
    }

    public ConversionEvent eventTime(Long eventTime) {
        this.eventTime = eventTime;
        return this;
    }

    public String getEventId() {
        return eventId;
    }

    public void setEventId(String eventId) {
        this.eventId = eventId;
    }

    public ConversionEvent eventId(String eventId) {
        this.eventId = eventId;
        return this;
    }

    public String getEventSourceUrl() {
        return eventSourceUrl;
    }

    public void setEventSourceUrl(String eventSourceUrl) {
        this.eventSourceUrl = eventSourceUrl;
    }

    public ConversionEvent eventSourceUrl(String eventSourceUrl) {
        this.eventSourceUrl = eventSourceUrl;
        return this;
    }

    public String getActionSource() {
        return actionSource;
    }

    public void setActionSource(String actionSource) {
        this.actionSource = actionSource;
    }

    public ConversionEvent actionSource(String actionSource) {
        this.actionSource = actionSource;
        return this;
    }

    public Boolean getOptOut() {
        return optOut;
    }

    public void setOptOut(Boolean optOut) {
        this.optOut = optOut;
    }

    public ConversionEvent optOut(Boolean optOut) {
        this.optOut = optOut;
        return this;
    }

    public ConversionUserData getUserData() {
        return userData;
    }

    public void setUserData(ConversionUserData userData) {
        this.userData = userData;
    }

    public ConversionEvent userData(ConversionUserData userData) {
        this.userData = userData;
        return this;
    }

    public ConversionCustomData getCustomData() {
        return customData;
    }

    public void setCustomData(ConversionCustomData customData) {
        this.customData = customData;
    }

    public ConversionEvent customData(ConversionCustomData customData) {
        this.customData = customData;
        return this;
    }

    public List<String> getDataProcessingOptions() {
        return dataProcessingOptions;
    }

    public void setDataProcessingOptions(List<String> dataProcessingOptions) {
        this.dataProcessingOptions = dataProcessingOptions;
    }

    public ConversionEvent dataProcessingOptions(List<String> dataProcessingOptions) {
        this.dataProcessingOptions = dataProcessingOptions;
        return this;
    }

    public Integer getDataProcessingOptionsCountry() {
        return dataProcessingOptionsCountry;
    }

    public void setDataProcessingOptionsCountry(Integer dataProcessingOptionsCountry) {
        this.dataProcessingOptionsCountry = dataProcessingOptionsCountry;
    }

    public ConversionEvent dataProcessingOptionsCountry(Integer dataProcessingOptionsCountry) {
        this.dataProcessingOptionsCountry = dataProcessingOptionsCountry;
        return this;
    }

    public Integer getDataProcessingOptionsState() {
        return dataProcessingOptionsState;
    }

    public void setDataProcessingOptionsState(Integer dataProcessingOptionsState) {
        this.dataProcessingOptionsState = dataProcessingOptionsState;
    }

    public ConversionEvent dataProcessingOptionsState(Integer dataProcessingOptionsState) {
        this.dataProcessingOptionsState = dataProcessingOptionsState;
        return this;
    }
}
