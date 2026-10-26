package com.meetbot.openapi.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * 变更详情
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class FlowStatusChangeWebhookDataMsgEntryItemChangesItemValue {

    /**
     * Flow ID
     */
    @JsonProperty("flow_id")
    private String flowId;

    /**
     * 变更前状态：DRAFT / PUBLISHED / DEPRECATED / BLOCKED / THROTTLED
     */
    @JsonProperty("old_status")
    private String oldStatus;

    /**
     * 变更后状态
     */
    @JsonProperty("new_status")
    private String newStatus;

    /**
     * 事件类型
     */
    private String event;

    /**
     * 事件描述
     */
    private String message;

    public String getFlowId() {
        return flowId;
    }

    public void setFlowId(String flowId) {
        this.flowId = flowId;
    }

    public FlowStatusChangeWebhookDataMsgEntryItemChangesItemValue flowId(String flowId) {
        this.flowId = flowId;
        return this;
    }

    public String getOldStatus() {
        return oldStatus;
    }

    public void setOldStatus(String oldStatus) {
        this.oldStatus = oldStatus;
    }

    public FlowStatusChangeWebhookDataMsgEntryItemChangesItemValue oldStatus(String oldStatus) {
        this.oldStatus = oldStatus;
        return this;
    }

    public String getNewStatus() {
        return newStatus;
    }

    public void setNewStatus(String newStatus) {
        this.newStatus = newStatus;
    }

    public FlowStatusChangeWebhookDataMsgEntryItemChangesItemValue newStatus(String newStatus) {
        this.newStatus = newStatus;
        return this;
    }

    public String getEvent() {
        return event;
    }

    public void setEvent(String event) {
        this.event = event;
    }

    public FlowStatusChangeWebhookDataMsgEntryItemChangesItemValue event(String event) {
        this.event = event;
        return this;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public FlowStatusChangeWebhookDataMsgEntryItemChangesItemValue message(String message) {
        this.message = message;
        return this;
    }

}
