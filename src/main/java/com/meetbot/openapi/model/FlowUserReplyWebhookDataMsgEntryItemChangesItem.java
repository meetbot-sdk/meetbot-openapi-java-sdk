package com.meetbot.openapi.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class FlowUserReplyWebhookDataMsgEntryItemChangesItem {

    /**
     * 固定值 messages
     */
    private String field;

    /**
     * 消息详情
     */
    private FlowUserReplyWebhookDataMsgEntryItemChangesItemValue value;

    public String getField() {
        return field;
    }

    public void setField(String field) {
        this.field = field;
    }

    public FlowUserReplyWebhookDataMsgEntryItemChangesItem field(String field) {
        this.field = field;
        return this;
    }

    public FlowUserReplyWebhookDataMsgEntryItemChangesItemValue getValue() {
        return value;
    }

    public void setValue(FlowUserReplyWebhookDataMsgEntryItemChangesItemValue value) {
        this.value = value;
    }

    public FlowUserReplyWebhookDataMsgEntryItemChangesItem value(FlowUserReplyWebhookDataMsgEntryItemChangesItemValue value) {
        this.value = value;
        return this;
    }

}
