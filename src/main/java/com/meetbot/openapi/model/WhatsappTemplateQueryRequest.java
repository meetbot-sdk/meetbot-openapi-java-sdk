package com.meetbot.openapi.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class WhatsappTemplateQueryRequest {

    /**
     * WhatsApp Business Account Id(wabaId)
     * Required.
     */
    private String whatsappBusinessAccountId;

    /**
     * 非第一次查询参数，将上一次请求响应的accessToken填入即可。（当before或after不为空时为必填项）
     */
    private String accessToken;

    /**
     * 非第一次查询参数，如果想查询上一次查询的前一页，将上一次请求响应的before字段填入即可（不能与after参数同时填写）
     */
    private String before;

    /**
     * 非第一次查询参数，如果想查询上一次查询的后一页，将上一次请求响应的after字段填入即可（不能与before参数同时填写）
     */
    private String after;

    /**
     * 需要返回的字段，具体字段参考[官方文档](https://developers.facebook.com/documentation/business-messaging/whatsapp/reference/whatsapp-business-account/message-template-api#get-version-waba-id-message-templates)，不填返回默认字段列表
     */
    private java.util.List<String> fields;

    /**
     * 每页获取多少条数据，默认25
     */
    private String limit;

    public String getWhatsappBusinessAccountId() {
        return whatsappBusinessAccountId;
    }

    public void setWhatsappBusinessAccountId(String whatsappBusinessAccountId) {
        this.whatsappBusinessAccountId = whatsappBusinessAccountId;
    }

    public WhatsappTemplateQueryRequest whatsappBusinessAccountId(String whatsappBusinessAccountId) {
        this.whatsappBusinessAccountId = whatsappBusinessAccountId;
        return this;
    }

    public String getAccessToken() {
        return accessToken;
    }

    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken;
    }

    public WhatsappTemplateQueryRequest accessToken(String accessToken) {
        this.accessToken = accessToken;
        return this;
    }

    public String getBefore() {
        return before;
    }

    public void setBefore(String before) {
        this.before = before;
    }

    public WhatsappTemplateQueryRequest before(String before) {
        this.before = before;
        return this;
    }

    public String getAfter() {
        return after;
    }

    public void setAfter(String after) {
        this.after = after;
    }

    public WhatsappTemplateQueryRequest after(String after) {
        this.after = after;
        return this;
    }

    public java.util.List<String> getFields() {
        return fields;
    }

    public void setFields(java.util.List<String> fields) {
        this.fields = fields;
    }

    public WhatsappTemplateQueryRequest fields(java.util.List<String> fields) {
        this.fields = fields;
        return this;
    }

    public String getLimit() {
        return limit;
    }

    public void setLimit(String limit) {
        this.limit = limit;
    }

    public WhatsappTemplateQueryRequest limit(String limit) {
        this.limit = limit;
        return this;
    }

}
