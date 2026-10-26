package com.meetbot.openapi.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * WhatsappTemplateGroupUpdateRequest
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class WhatsappTemplateGroupUpdateRequest {

    /**
     * 模板组 ID
     * Required.
     */
    private String templateGroupId;

    /**
     * Meta 官方请求参数
     * Required.
     */
    private com.fasterxml.jackson.databind.JsonNode param;

    public String getTemplateGroupId() {
        return templateGroupId;
    }

    public void setTemplateGroupId(String templateGroupId) {
        this.templateGroupId = templateGroupId;
    }

    public WhatsappTemplateGroupUpdateRequest templateGroupId(String templateGroupId) {
        this.templateGroupId = templateGroupId;
        return this;
    }

    public com.fasterxml.jackson.databind.JsonNode getParam() {
        return param;
    }

    public void setParam(com.fasterxml.jackson.databind.JsonNode param) {
        this.param = param;
    }

    public WhatsappTemplateGroupUpdateRequest param(com.fasterxml.jackson.databind.JsonNode param) {
        this.param = param;
        return this;
    }
}
