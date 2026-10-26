package com.meetbot.openapi.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * 业务数据
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class FlowStatusChangeWebhookDataMsg {

    /**
     * 固定值 whatsapp_business_account
     */
    private String object;

    /**
     * 事件条目列表
     */
    private java.util.List<FlowStatusChangeWebhookDataMsgEntryItem> entry;

    public String getObject() {
        return object;
    }

    public void setObject(String object) {
        this.object = object;
    }

    public FlowStatusChangeWebhookDataMsg object(String object) {
        this.object = object;
        return this;
    }

    public java.util.List<FlowStatusChangeWebhookDataMsgEntryItem> getEntry() {
        return entry;
    }

    public void setEntry(java.util.List<FlowStatusChangeWebhookDataMsgEntryItem> entry) {
        this.entry = entry;
    }

    public FlowStatusChangeWebhookDataMsg entry(java.util.List<FlowStatusChangeWebhookDataMsgEntryItem> entry) {
        this.entry = entry;
        return this;
    }

}
