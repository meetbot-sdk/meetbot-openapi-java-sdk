package com.meetbot.openapi.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * 认证模板定义
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class WhatsappTemplateUpsertParam {

    /**
     * 模板名称
     * Required.
     */
    private String name;

    /**
     * 需要创建或更新的语言代码
     * Required.
     */
    private java.util.List<String> languages;

    /**
     * 模板类别
     * Required.
     */
    private String category;

    /**
     * 认证模板组件，包括 BODY、可选 FOOTER 和包含一个 OTP 按钮的 BUTTONS
     * Required.
     */
    private java.util.List<com.fasterxml.jackson.databind.JsonNode> components;

    /**
     * 消息发送有效期，单位为秒
     */
    @JsonProperty("message_send_ttl_seconds")
    private Long messageSendTtlSeconds;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public WhatsappTemplateUpsertParam name(String name) {
        this.name = name;
        return this;
    }

    public java.util.List<String> getLanguages() {
        return languages;
    }

    public void setLanguages(java.util.List<String> languages) {
        this.languages = languages;
    }

    public WhatsappTemplateUpsertParam languages(java.util.List<String> languages) {
        this.languages = languages;
        return this;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public WhatsappTemplateUpsertParam category(String category) {
        this.category = category;
        return this;
    }

    public java.util.List<com.fasterxml.jackson.databind.JsonNode> getComponents() {
        return components;
    }

    public void setComponents(java.util.List<com.fasterxml.jackson.databind.JsonNode> components) {
        this.components = components;
    }

    public WhatsappTemplateUpsertParam components(java.util.List<com.fasterxml.jackson.databind.JsonNode> components) {
        this.components = components;
        return this;
    }

    public Long getMessageSendTtlSeconds() {
        return messageSendTtlSeconds;
    }

    public void setMessageSendTtlSeconds(Long messageSendTtlSeconds) {
        this.messageSendTtlSeconds = messageSendTtlSeconds;
    }

    public WhatsappTemplateUpsertParam messageSendTtlSeconds(Long messageSendTtlSeconds) {
        this.messageSendTtlSeconds = messageSendTtlSeconds;
        return this;
    }
}
