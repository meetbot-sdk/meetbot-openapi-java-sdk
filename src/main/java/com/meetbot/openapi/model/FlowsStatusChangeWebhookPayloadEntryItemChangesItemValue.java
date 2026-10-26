package com.meetbot.openapi.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * 事件详情
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class FlowsStatusChangeWebhookPayloadEntryItemChangesItemValue {

    /**
     * Flow ID
     */
    @JsonProperty("flow_id")
    private String flowId;

    /**
     * Flow名称
     */
    @JsonProperty("flow_name")
    private String flowName;

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
     * 事件发生时间（Unix时间戳）
     */
    @JsonProperty("event_time")
    private Long eventTime;

    public String getFlowId() {
        return flowId;
    }

    public void setFlowId(String flowId) {
        this.flowId = flowId;
    }

    public FlowsStatusChangeWebhookPayloadEntryItemChangesItemValue flowId(String flowId) {
        this.flowId = flowId;
        return this;
    }

    public String getFlowName() {
        return flowName;
    }

    public void setFlowName(String flowName) {
        this.flowName = flowName;
    }

    public FlowsStatusChangeWebhookPayloadEntryItemChangesItemValue flowName(String flowName) {
        this.flowName = flowName;
        return this;
    }

    public String getOldStatus() {
        return oldStatus;
    }

    public void setOldStatus(String oldStatus) {
        this.oldStatus = oldStatus;
    }

    public FlowsStatusChangeWebhookPayloadEntryItemChangesItemValue oldStatus(String oldStatus) {
        this.oldStatus = oldStatus;
        return this;
    }

    public String getNewStatus() {
        return newStatus;
    }

    public void setNewStatus(String newStatus) {
        this.newStatus = newStatus;
    }

    public FlowsStatusChangeWebhookPayloadEntryItemChangesItemValue newStatus(String newStatus) {
        this.newStatus = newStatus;
        return this;
    }

    public Long getEventTime() {
        return eventTime;
    }

    public void setEventTime(Long eventTime) {
        this.eventTime = eventTime;
    }

    public FlowsStatusChangeWebhookPayloadEntryItemChangesItemValue eventTime(Long eventTime) {
        this.eventTime = eventTime;
        return this;
    }

}
