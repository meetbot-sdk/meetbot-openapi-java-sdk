package com.meetbot.openapi.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * WhatsappTemplateArchiveRequest
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class WhatsappTemplateArchiveRequest {

    /**
     * WhatsApp 业务账号 ID
     * Required.
     */
    private String wabaId;

    /**
     * param
     * Required.
     */
    private WhatsappTemplateArchiveParam param;

    public String getWabaId() {
        return wabaId;
    }

    public void setWabaId(String wabaId) {
        this.wabaId = wabaId;
    }

    public WhatsappTemplateArchiveRequest wabaId(String wabaId) {
        this.wabaId = wabaId;
        return this;
    }

    public WhatsappTemplateArchiveParam getParam() {
        return param;
    }

    public void setParam(WhatsappTemplateArchiveParam param) {
        this.param = param;
    }

    public WhatsappTemplateArchiveRequest param(WhatsappTemplateArchiveParam param) {
        this.param = param;
        return this;
    }
}
