package com.meetbot.openapi.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * WhatsappTemplateMigrateRequest
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class WhatsappTemplateMigrateRequest {

    /**
     * 目标 WhatsApp 业务账号 ID
     * Required.
     */
    private String destinationWabaId;

    /**
     * param
     * Required.
     */
    private WhatsappTemplateMigrateParam param;

    public String getDestinationWabaId() {
        return destinationWabaId;
    }

    public void setDestinationWabaId(String destinationWabaId) {
        this.destinationWabaId = destinationWabaId;
    }

    public WhatsappTemplateMigrateRequest destinationWabaId(String destinationWabaId) {
        this.destinationWabaId = destinationWabaId;
        return this;
    }

    public WhatsappTemplateMigrateParam getParam() {
        return param;
    }

    public void setParam(WhatsappTemplateMigrateParam param) {
        this.param = param;
    }

    public WhatsappTemplateMigrateRequest param(WhatsappTemplateMigrateParam param) {
        this.param = param;
        return this;
    }
}
