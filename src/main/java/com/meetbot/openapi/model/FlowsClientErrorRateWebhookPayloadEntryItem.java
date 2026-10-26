package com.meetbot.openapi.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class FlowsClientErrorRateWebhookPayloadEntryItem {

    /**
     * WABA ID
     */
    private String id;

    /**
     * 变更事件列表
     */
    private java.util.List<FlowsClientErrorRateWebhookPayloadEntryItemChangesItem> changes;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public FlowsClientErrorRateWebhookPayloadEntryItem id(String id) {
        this.id = id;
        return this;
    }

    public java.util.List<FlowsClientErrorRateWebhookPayloadEntryItemChangesItem> getChanges() {
        return changes;
    }

    public void setChanges(java.util.List<FlowsClientErrorRateWebhookPayloadEntryItemChangesItem> changes) {
        this.changes = changes;
    }

    public FlowsClientErrorRateWebhookPayloadEntryItem changes(java.util.List<FlowsClientErrorRateWebhookPayloadEntryItemChangesItem> changes) {
        this.changes = changes;
        return this;
    }

}
