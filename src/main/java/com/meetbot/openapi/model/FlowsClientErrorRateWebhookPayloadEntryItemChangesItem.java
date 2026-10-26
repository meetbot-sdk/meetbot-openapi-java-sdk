package com.meetbot.openapi.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.JsonNode;

@JsonIgnoreProperties(ignoreUnknown = true)
public class FlowsClientErrorRateWebhookPayloadEntryItemChangesItem {

    /**
     * 事件类型，固定为 CLIENT_ERROR_RATE
     */
    private String field;

    /**
     * 事件详情，字段均为Meta官方定义
     */
    private JsonNode value;

    public String getField() {
        return field;
    }

    public void setField(String field) {
        this.field = field;
    }

    public FlowsClientErrorRateWebhookPayloadEntryItemChangesItem field(String field) {
        this.field = field;
        return this;
    }

    public JsonNode getValue() {
        return value;
    }

    public void setValue(JsonNode value) {
        this.value = value;
    }

    public FlowsClientErrorRateWebhookPayloadEntryItemChangesItem value(JsonNode value) {
        this.value = value;
        return this;
    }

}
