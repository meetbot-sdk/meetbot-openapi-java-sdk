package com.meetbot.openapi.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * Flow状态变更（FLOW_STATUS_CHANGE）Webhook通知负载。当Flow状态发生变更时，Meta主动推送此负载。field字段值为FLOW_STATUS_CHANGE。客户需返回HTTP 200表示接收成功。参考[官方文档](https://developers.facebook.com/documentation/business-messaging/whatsapp/flows/guides/flowswebhooks)。
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class FlowsStatusChangeWebhookPayload {

    /**
     * 固定值 whatsapp_flows
     */
    private String object;

    /**
     * Webhook事件条目列表
     */
    private java.util.List<FlowsStatusChangeWebhookPayloadEntryItem> entry;

    public String getObject() {
        return object;
    }

    public void setObject(String object) {
        this.object = object;
    }

    public FlowsStatusChangeWebhookPayload object(String object) {
        this.object = object;
        return this;
    }

    public java.util.List<FlowsStatusChangeWebhookPayloadEntryItem> getEntry() {
        return entry;
    }

    public void setEntry(java.util.List<FlowsStatusChangeWebhookPayloadEntryItem> entry) {
        this.entry = entry;
    }

    public FlowsStatusChangeWebhookPayload entry(java.util.List<FlowsStatusChangeWebhookPayloadEntryItem> entry) {
        this.entry = entry;
        return this;
    }

}
