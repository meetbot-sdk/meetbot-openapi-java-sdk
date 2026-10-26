package com.meetbot.openapi.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * WhatsappTemplateGroupCreateRequest
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class WhatsappTemplateGroupCreateRequest {

    /**
     * WhatsApp 业务账号 ID
     * Required.
     */
    private String wabaId;

    /**
     * Meta 官方请求参数
     * Required.
     */
    private com.fasterxml.jackson.databind.JsonNode param;

    public String getWabaId() {
        return wabaId;
    }

    public void setWabaId(String wabaId) {
        this.wabaId = wabaId;
    }

    public WhatsappTemplateGroupCreateRequest wabaId(String wabaId) {
        this.wabaId = wabaId;
        return this;
    }

    public com.fasterxml.jackson.databind.JsonNode getParam() {
        return param;
    }

    public void setParam(com.fasterxml.jackson.databind.JsonNode param) {
        this.param = param;
    }

    public WhatsappTemplateGroupCreateRequest param(com.fasterxml.jackson.databind.JsonNode param) {
        this.param = param;
        return this;
    }
}
