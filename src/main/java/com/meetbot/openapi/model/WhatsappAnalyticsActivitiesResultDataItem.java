package com.meetbot.openapi.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * WhatsappAnalyticsActivitiesResultDataItem
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class WhatsappAnalyticsActivitiesResultDataItem extends ExtensibleDto {

    /**
     * id
     */
    private String id;

    /**
     * event_time
     */
    @JsonProperty("event_time")
    private Long eventTime;

    /**
     * event_type
     */
    @JsonProperty("event_type")
    private String eventType;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public WhatsappAnalyticsActivitiesResultDataItem id(String id) {
        this.id = id;
        return this;
    }

    public Long getEventTime() {
        return eventTime;
    }

    public void setEventTime(Long eventTime) {
        this.eventTime = eventTime;
    }

    public WhatsappAnalyticsActivitiesResultDataItem eventTime(Long eventTime) {
        this.eventTime = eventTime;
        return this;
    }

    public String getEventType() {
        return eventType;
    }

    public void setEventType(String eventType) {
        this.eventType = eventType;
    }

    public WhatsappAnalyticsActivitiesResultDataItem eventType(String eventType) {
        this.eventType = eventType;
        return this;
    }
}
