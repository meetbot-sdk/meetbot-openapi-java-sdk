package com.meetbot.openapi.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * 客户端错误率（CLIENT_ERROR_RATE）Webhook通知负载。当Flow的客户端错误率超过预设阈值时，Meta主动推送此负载。field字段值为CLIENT_ERROR_RATE。客户需返回HTTP 200表示成功接收。value内的字段均为Meta官方定义，具体字段参考[官方文档](https://developers.facebook.com/documentation/business-messaging/whatsapp/flows/guides/flowswebhooks)。
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class FlowsClientErrorRateWebhookPayload {

    /**
     * 固定值 whatsapp_flows
     */
    private String object;

    /**
     * Webhook事件条目列表
     */
    private java.util.List<FlowsClientErrorRateWebhookPayloadEntryItem> entry;

    public String getObject() {
        return object;
    }

    public void setObject(String object) {
        this.object = object;
    }

    public FlowsClientErrorRateWebhookPayload object(String object) {
        this.object = object;
        return this;
    }

    public java.util.List<FlowsClientErrorRateWebhookPayloadEntryItem> getEntry() {
        return entry;
    }

    public void setEntry(java.util.List<FlowsClientErrorRateWebhookPayloadEntryItem> entry) {
        this.entry = entry;
    }

    public FlowsClientErrorRateWebhookPayload entry(java.util.List<FlowsClientErrorRateWebhookPayloadEntryItem> entry) {
        this.entry = entry;
        return this;
    }

}
