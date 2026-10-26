package com.meetbot.openapi.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * WhatsappTemplateUnarchiveRequest
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class WhatsappTemplateUnarchiveRequest {

    /**
     * WhatsApp 业务账号 ID
     * Required.
     */
    private String wabaId;

    /**
     * param
     * Required.
     */
    private WhatsappTemplateUnarchiveParam param;

    public String getWabaId() {
        return wabaId;
    }

    public void setWabaId(String wabaId) {
        this.wabaId = wabaId;
    }

    public WhatsappTemplateUnarchiveRequest wabaId(String wabaId) {
        this.wabaId = wabaId;
        return this;
    }

    public WhatsappTemplateUnarchiveParam getParam() {
        return param;
    }

    public void setParam(WhatsappTemplateUnarchiveParam param) {
        this.param = param;
    }

    public WhatsappTemplateUnarchiveRequest param(WhatsappTemplateUnarchiveParam param) {
        this.param = param;
        return this;
    }
}
