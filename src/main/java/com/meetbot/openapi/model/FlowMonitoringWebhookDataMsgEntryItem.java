package com.meetbot.openapi.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class FlowMonitoringWebhookDataMsgEntryItem {

    /**
     * WABA ID
     */
    private String id;

    /**
     * 事件时间（Unix时间戳）
     */
    private Long time;

    /**
     * 变更事件列表
     */
    private java.util.List<FlowMonitoringWebhookDataMsgEntryItemChangesItem> changes;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public FlowMonitoringWebhookDataMsgEntryItem id(String id) {
        this.id = id;
        return this;
    }

    public Long getTime() {
        return time;
    }

    public void setTime(Long time) {
        this.time = time;
    }

    public FlowMonitoringWebhookDataMsgEntryItem time(Long time) {
        this.time = time;
        return this;
    }

    public java.util.List<FlowMonitoringWebhookDataMsgEntryItemChangesItem> getChanges() {
        return changes;
    }

    public void setChanges(java.util.List<FlowMonitoringWebhookDataMsgEntryItemChangesItem> changes) {
        this.changes = changes;
    }

    public FlowMonitoringWebhookDataMsgEntryItem changes(java.util.List<FlowMonitoringWebhookDataMsgEntryItemChangesItem> changes) {
        this.changes = changes;
        return this;
    }

}
