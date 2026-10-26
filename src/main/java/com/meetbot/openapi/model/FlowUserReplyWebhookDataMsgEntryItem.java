package com.meetbot.openapi.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class FlowUserReplyWebhookDataMsgEntryItem {

    /**
     * WABA ID
     */
    private String id;

    /**
     * 变更事件列表
     */
    private java.util.List<FlowUserReplyWebhookDataMsgEntryItemChangesItem> changes;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public FlowUserReplyWebhookDataMsgEntryItem id(String id) {
        this.id = id;
        return this;
    }

    public java.util.List<FlowUserReplyWebhookDataMsgEntryItemChangesItem> getChanges() {
        return changes;
    }

    public void setChanges(java.util.List<FlowUserReplyWebhookDataMsgEntryItemChangesItem> changes) {
        this.changes = changes;
    }

    public FlowUserReplyWebhookDataMsgEntryItem changes(java.util.List<FlowUserReplyWebhookDataMsgEntryItemChangesItem> changes) {
        this.changes = changes;
        return this;
    }

}
