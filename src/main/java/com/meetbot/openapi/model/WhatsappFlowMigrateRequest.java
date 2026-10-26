package com.meetbot.openapi.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class WhatsappFlowMigrateRequest {

    /**
     * 目标WABA ID，Flow将迁移到此账号下
     * Required.
     */
    private String destinationWabaId;

    /**
     * 源WABA ID，Flow当前所属的账号
     * Required.
     */
    private String sourceWabaId;

    /**
     * 要迁移的Flow名称列表。最多100个。不传则迁移所有Flow（可能会导致大量数据传输，建议指定迁移的Flow）。
     */
    private java.util.List<String> sourceFlowNames;

    public String getDestinationWabaId() {
        return destinationWabaId;
    }

    public void setDestinationWabaId(String destinationWabaId) {
        this.destinationWabaId = destinationWabaId;
    }

    public WhatsappFlowMigrateRequest destinationWabaId(String destinationWabaId) {
        this.destinationWabaId = destinationWabaId;
        return this;
    }

    public String getSourceWabaId() {
        return sourceWabaId;
    }

    public void setSourceWabaId(String sourceWabaId) {
        this.sourceWabaId = sourceWabaId;
    }

    public WhatsappFlowMigrateRequest sourceWabaId(String sourceWabaId) {
        this.sourceWabaId = sourceWabaId;
        return this;
    }

    public java.util.List<String> getSourceFlowNames() {
        return sourceFlowNames;
    }

    public void setSourceFlowNames(java.util.List<String> sourceFlowNames) {
        this.sourceFlowNames = sourceFlowNames;
    }

    public WhatsappFlowMigrateRequest sourceFlowNames(java.util.List<String> sourceFlowNames) {
        this.sourceFlowNames = sourceFlowNames;
        return this;
    }

}
