package com.meetbot.openapi.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class EventTaskIdResult {

    /** 事件任务 id */
    private Long eventTaskId;

    public Long getEventTaskId() {
        return eventTaskId;
    }

    public void setEventTaskId(Long eventTaskId) {
        this.eventTaskId = eventTaskId;
    }
}
