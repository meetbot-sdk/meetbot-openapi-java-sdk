package com.meetbot.openapi.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * WhatsappTemplateUpsertRequest
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class WhatsappTemplateUpsertRequest {

    /**
     * WhatsApp 业务账号 ID
     * Required.
     */
    private String wabaId;

    /**
     * 认证模板定义
     * Required.
     */
    private WhatsappTemplateUpsertParam param;

    public String getWabaId() {
        return wabaId;
    }

    public void setWabaId(String wabaId) {
        this.wabaId = wabaId;
    }

    public WhatsappTemplateUpsertRequest wabaId(String wabaId) {
        this.wabaId = wabaId;
        return this;
    }

    public WhatsappTemplateUpsertParam getParam() {
        return param;
    }

    public void setParam(WhatsappTemplateUpsertParam param) {
        this.param = param;
    }

    public WhatsappTemplateUpsertRequest param(WhatsappTemplateUpsertParam param) {
        this.param = param;
        return this;
    }
}
