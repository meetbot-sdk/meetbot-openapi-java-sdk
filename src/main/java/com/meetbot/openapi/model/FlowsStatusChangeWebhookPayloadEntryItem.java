package com.meetbot.openapi.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class FlowsStatusChangeWebhookPayloadEntryItem {

    /**
     * WABA ID
     */
    private String id;

    /**
     * 变更事件列表
     */
    private java.util.List<FlowsStatusChangeWebhookPayloadEntryItemChangesItem> changes;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public FlowsStatusChangeWebhookPayloadEntryItem id(String id) {
        this.id = id;
        return this;
    }

    public java.util.List<FlowsStatusChangeWebhookPayloadEntryItemChangesItem> getChanges() {
        return changes;
    }

    public void setChanges(java.util.List<FlowsStatusChangeWebhookPayloadEntryItemChangesItem> changes) {
        this.changes = changes;
    }

    public FlowsStatusChangeWebhookPayloadEntryItem changes(java.util.List<FlowsStatusChangeWebhookPayloadEntryItemChangesItem> changes) {
        this.changes = changes;
        return this;
    }

}
