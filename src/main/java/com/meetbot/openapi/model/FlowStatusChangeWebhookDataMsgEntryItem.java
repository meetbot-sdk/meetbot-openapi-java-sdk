package com.meetbot.openapi.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class FlowStatusChangeWebhookDataMsgEntryItem {

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
    private java.util.List<FlowStatusChangeWebhookDataMsgEntryItemChangesItem> changes;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public FlowStatusChangeWebhookDataMsgEntryItem id(String id) {
        this.id = id;
        return this;
    }

    public Long getTime() {
        return time;
    }

    public void setTime(Long time) {
        this.time = time;
    }

    public FlowStatusChangeWebhookDataMsgEntryItem time(Long time) {
        this.time = time;
        return this;
    }

    public java.util.List<FlowStatusChangeWebhookDataMsgEntryItemChangesItem> getChanges() {
        return changes;
    }

    public void setChanges(java.util.List<FlowStatusChangeWebhookDataMsgEntryItemChangesItem> changes) {
        this.changes = changes;
    }

    public FlowStatusChangeWebhookDataMsgEntryItem changes(java.util.List<FlowStatusChangeWebhookDataMsgEntryItemChangesItem> changes) {
        this.changes = changes;
        return this;
    }

}
