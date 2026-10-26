package com.meetbot.openapi.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * 业务数据
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class FlowMonitoringWebhookDataMsg {

    /**
     * 固定值 whatsapp_business_account
     */
    private String object;

    /**
     * 事件条目列表
     */
    private java.util.List<FlowMonitoringWebhookDataMsgEntryItem> entry;

    public String getObject() {
        return object;
    }

    public void setObject(String object) {
        this.object = object;
    }

    public FlowMonitoringWebhookDataMsg object(String object) {
        this.object = object;
        return this;
    }

    public java.util.List<FlowMonitoringWebhookDataMsgEntryItem> getEntry() {
        return entry;
    }

    public void setEntry(java.util.List<FlowMonitoringWebhookDataMsgEntryItem> entry) {
        this.entry = entry;
    }

    public FlowMonitoringWebhookDataMsg entry(java.util.List<FlowMonitoringWebhookDataMsgEntryItem> entry) {
        this.entry = entry;
        return this;
    }

}
