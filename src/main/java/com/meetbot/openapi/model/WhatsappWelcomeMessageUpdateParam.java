package com.meetbot.openapi.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * 欢迎消息序列参数
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class WhatsappWelcomeMessageUpdateParam {

    /**
     * 欢迎消息序列 ID
     * Required.
     */
    private String sequenceId;

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

    public String getSequenceId() {
        return sequenceId;
    }

    public void setSequenceId(String sequenceId) {
        this.sequenceId = sequenceId;
    }

    public WhatsappWelcomeMessageUpdateParam sequenceId(String sequenceId) {
        this.sequenceId = sequenceId;
        return this;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public WhatsappWelcomeMessageUpdateParam name(String name) {
        this.name = name;
        return this;
    }

    public com.fasterxml.jackson.databind.JsonNode getWelcomeMessageSequence() {
        return welcomeMessageSequence;
    }

    public void setWelcomeMessageSequence(com.fasterxml.jackson.databind.JsonNode welcomeMessageSequence) {
        this.welcomeMessageSequence = welcomeMessageSequence;
    }

    public WhatsappWelcomeMessageUpdateParam welcomeMessageSequence(com.fasterxml.jackson.databind.JsonNode welcomeMessageSequence) {
        this.welcomeMessageSequence = welcomeMessageSequence;
        return this;
    }
}
