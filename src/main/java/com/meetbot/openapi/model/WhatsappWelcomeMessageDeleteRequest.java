package com.meetbot.openapi.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * WhatsappWelcomeMessageDeleteRequest
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class WhatsappWelcomeMessageDeleteRequest {

    /**
     * WhatsApp 业务账号 ID
     * Required.
     */
    private String wabaId;

    /**
     * 欢迎消息序列 ID
     * Required.
     */
    private String sequenceId;

    public String getWabaId() {
        return wabaId;
    }

    public void setWabaId(String wabaId) {
        this.wabaId = wabaId;
    }

    public WhatsappWelcomeMessageDeleteRequest wabaId(String wabaId) {
        this.wabaId = wabaId;
        return this;
    }

    public String getSequenceId() {
        return sequenceId;
    }

    public void setSequenceId(String sequenceId) {
        this.sequenceId = sequenceId;
    }

    public WhatsappWelcomeMessageDeleteRequest sequenceId(String sequenceId) {
        this.sequenceId = sequenceId;
        return this;
    }
}
