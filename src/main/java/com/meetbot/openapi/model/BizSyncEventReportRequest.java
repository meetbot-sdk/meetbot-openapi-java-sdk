package com.meetbot.openapi.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.meetbot.openapi.model.enums.BizSyncEventType;

@JsonIgnoreProperties(ignoreUnknown = true)
public class BizSyncEventReportRequest {

    /**
     * 事件唯一 ID，同一逻辑事件重试上报时须保持不变，与渠道维度共同构成幂等键。
     * Required.
     */
    private String eventId;

    /** Required. */
    private BizSyncEventType eventType;

    /**
     * 业务事件发生时间（毫秒），作为策略锚点时间，通常优于订单内的 orderPayTime 等字段。
     * Required.
     */
    private Long eventTime;

    /** Required. */
    private BizSyncEventData eventData;

    public String getEventId() {
        return eventId;
    }

    public void setEventId(String eventId) {
        this.eventId = eventId;
    }

    public BizSyncEventReportRequest eventId(String eventId) {
        this.eventId = eventId;
        return this;
    }

    public BizSyncEventType getEventType() {
        return eventType;
    }

    public void setEventType(BizSyncEventType eventType) {
        this.eventType = eventType;
    }

    public BizSyncEventReportRequest eventType(BizSyncEventType eventType) {
        this.eventType = eventType;
        return this;
    }

    public Long getEventTime() {
        return eventTime;
    }

    public void setEventTime(Long eventTime) {
        this.eventTime = eventTime;
    }

    public BizSyncEventReportRequest eventTime(Long eventTime) {
        this.eventTime = eventTime;
        return this;
    }

    public BizSyncEventData getEventData() {
        return eventData;
    }

    public void setEventData(BizSyncEventData eventData) {
        this.eventData = eventData;
    }

    public BizSyncEventReportRequest eventData(BizSyncEventData eventData) {
        this.eventData = eventData;
        return this;
    }

}
