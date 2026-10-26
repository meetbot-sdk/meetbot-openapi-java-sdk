package com.meetbot.openapi.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;
import java.util.Map;

/**
 * Meta Conversions API 回传响应。
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class CtwaConversionResult extends ExtensibleDto {

    @JsonProperty("events_received")
    private Integer eventsReceived;

    private List<Map<String, Object>> messages;

    @JsonProperty("fbtrace_id")
    private String fbtraceId;

    public Integer getEventsReceived() {
        return eventsReceived;
    }

    public void setEventsReceived(Integer eventsReceived) {
        this.eventsReceived = eventsReceived;
    }

    public List<Map<String, Object>> getMessages() {
        return messages;
    }

    public void setMessages(List<Map<String, Object>> messages) {
        this.messages = messages;
    }

    public String getFbtraceId() {
        return fbtraceId;
    }

    public void setFbtraceId(String fbtraceId) {
        this.fbtraceId = fbtraceId;
    }
}
