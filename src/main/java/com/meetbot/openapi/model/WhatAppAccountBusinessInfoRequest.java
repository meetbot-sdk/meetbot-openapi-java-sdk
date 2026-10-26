package com.meetbot.openapi.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class WhatAppAccountBusinessInfoRequest {

    /**
     * WhatsApp Business Account Id(wabaId)
     * Required.
     */
    private String whatsappBusinessAccountId;

    /**
     * 需要返回的字段，具体字段参考[官方文档](https://developers.facebook.com/docs/graph-api/reference/whats-app-business-account#Reading)，不填返回默认字段列表
     */
    private java.util.List<String> fields;

    public String getWhatsappBusinessAccountId() {
        return whatsappBusinessAccountId;
    }

    public void setWhatsappBusinessAccountId(String whatsappBusinessAccountId) {
        this.whatsappBusinessAccountId = whatsappBusinessAccountId;
    }

    public WhatAppAccountBusinessInfoRequest whatsappBusinessAccountId(String whatsappBusinessAccountId) {
        this.whatsappBusinessAccountId = whatsappBusinessAccountId;
        return this;
    }

    public java.util.List<String> getFields() {
        return fields;
    }

    public void setFields(java.util.List<String> fields) {
        this.fields = fields;
    }

    public WhatAppAccountBusinessInfoRequest fields(java.util.List<String> fields) {
        this.fields = fields;
        return this;
    }

}
