package com.meetbot.openapi.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * WhatsappTemplateInsightsEnableRequest
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class WhatsappTemplateInsightsEnableRequest {

    /**
     * WhatsApp 业务账号 ID
     * Required.
     */
    private String wabaId;

    public String getWabaId() {
        return wabaId;
    }

    public void setWabaId(String wabaId) {
        this.wabaId = wabaId;
    }

    public WhatsappTemplateInsightsEnableRequest wabaId(String wabaId) {
        this.wabaId = wabaId;
        return this;
    }
}
