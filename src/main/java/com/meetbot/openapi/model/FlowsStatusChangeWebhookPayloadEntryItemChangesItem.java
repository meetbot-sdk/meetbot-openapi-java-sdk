package com.meetbot.openapi.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class FlowsStatusChangeWebhookPayloadEntryItemChangesItem {

    /**
     * 事件类型，固定为 FLOW_STATUS_CHANGE
     */
    private String field;

    /**
     * 事件详情
     */
    private FlowsStatusChangeWebhookPayloadEntryItemChangesItemValue value;

    public String getField() {
        return field;
    }

    public void setField(String field) {
        this.field = field;
    }

    public FlowsStatusChangeWebhookPayloadEntryItemChangesItem field(String field) {
        this.field = field;
        return this;
    }

    public FlowsStatusChangeWebhookPayloadEntryItemChangesItemValue getValue() {
        return value;
    }

    public void setValue(FlowsStatusChangeWebhookPayloadEntryItemChangesItemValue value) {
        this.value = value;
    }

    public FlowsStatusChangeWebhookPayloadEntryItemChangesItem value(FlowsStatusChangeWebhookPayloadEntryItemChangesItemValue value) {
        this.value = value;
        return this;
    }

}
