package com.meetbot.openapi.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.JsonNode;

@JsonIgnoreProperties(ignoreUnknown = true)
public class FlowMonitoringWebhookDataMsgEntryItemChangesItem {

    /**
     * 变更类型：client_error_rate / endpoint_error_rate / endpoint_channel_latency / endpoint_channel_availability / flow_version_frozen
     */
    private String field;

    /**
     * 变更详情，字段均为Meta官方定义
     */
    private JsonNode value;

    public String getField() {
        return field;
    }

    public void setField(String field) {
        this.field = field;
    }

    public FlowMonitoringWebhookDataMsgEntryItemChangesItem field(String field) {
        this.field = field;
        return this;
    }

    public JsonNode getValue() {
        return value;
    }

    public void setValue(JsonNode value) {
        this.value = value;
    }

    public FlowMonitoringWebhookDataMsgEntryItemChangesItem value(JsonNode value) {
        this.value = value;
        return this;
    }

}
