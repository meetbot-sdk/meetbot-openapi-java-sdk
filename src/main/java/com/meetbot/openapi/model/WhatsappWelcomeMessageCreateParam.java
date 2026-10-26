package com.meetbot.openapi.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * 欢迎消息序列参数
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class WhatsappWelcomeMessageCreateParam {

    /**
     * 欢迎消息序列名称
     * Required.
     */
    private String name;

    /**
     * 欢迎消息序列内容
     * Required.
     */
    private com.fasterxml.jackson.databind.JsonNode welcomeMessageSequence;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public WhatsappWelcomeMessageCreateParam name(String name) {
        this.name = name;
        return this;
    }

    public com.fasterxml.jackson.databind.JsonNode getWelcomeMessageSequence() {
        return welcomeMessageSequence;
    }

    public void setWelcomeMessageSequence(com.fasterxml.jackson.databind.JsonNode welcomeMessageSequence) {
        this.welcomeMessageSequence = welcomeMessageSequence;
    }

    public WhatsappWelcomeMessageCreateParam welcomeMessageSequence(com.fasterxml.jackson.databind.JsonNode welcomeMessageSequence) {
        this.welcomeMessageSequence = welcomeMessageSequence;
        return this;
    }
}
