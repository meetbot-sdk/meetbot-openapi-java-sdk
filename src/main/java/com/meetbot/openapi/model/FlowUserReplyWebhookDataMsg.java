package com.meetbot.openapi.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * 业务数据
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class FlowUserReplyWebhookDataMsg {

    /**
     * 固定值 whatsapp_business_account
     */
    private String object;

    /**
     * 事件条目列表
     */
    private java.util.List<FlowUserReplyWebhookDataMsgEntryItem> entry;

    public String getObject() {
        return object;
    }

    public void setObject(String object) {
        this.object = object;
    }

    public FlowUserReplyWebhookDataMsg object(String object) {
        this.object = object;
        return this;
    }

    public java.util.List<FlowUserReplyWebhookDataMsgEntryItem> getEntry() {
        return entry;
    }

    public void setEntry(java.util.List<FlowUserReplyWebhookDataMsgEntryItem> entry) {
        this.entry = entry;
    }

    public FlowUserReplyWebhookDataMsg entry(java.util.List<FlowUserReplyWebhookDataMsgEntryItem> entry) {
        this.entry = entry;
        return this;
    }

}
