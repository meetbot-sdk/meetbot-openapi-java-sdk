package com.meetbot.openapi.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class FlowStatusChangeWebhookDataMsgEntryItemChangesItem {

    /**
     * 固定值 flows
     */
    private String field;

    /**
     * 变更详情
     */
    private FlowStatusChangeWebhookDataMsgEntryItemChangesItemValue value;

    public String getField() {
        return field;
    }

    public void setField(String field) {
        this.field = field;
    }

    public FlowStatusChangeWebhookDataMsgEntryItemChangesItem field(String field) {
        this.field = field;
        return this;
    }

    public FlowStatusChangeWebhookDataMsgEntryItemChangesItemValue getValue() {
        return value;
    }

    public void setValue(FlowStatusChangeWebhookDataMsgEntryItemChangesItemValue value) {
        this.value = value;
    }

    public FlowStatusChangeWebhookDataMsgEntryItemChangesItem value(FlowStatusChangeWebhookDataMsgEntryItemChangesItemValue value) {
        this.value = value;
        return this;
    }

}
