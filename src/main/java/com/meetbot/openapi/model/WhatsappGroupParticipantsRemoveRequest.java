package com.meetbot.openapi.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * WhatsappGroupParticipantsRemoveRequest
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class WhatsappGroupParticipantsRemoveRequest {

    /**
     * 群组 ID
     * Required.
     */
    private String groupId;

    /**
     * Meta 官方请求参数
     * Required.
     */
    private WhatsappGroupParticipantsRemoveParam param;

    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    public WhatsappGroupParticipantsRemoveRequest groupId(String groupId) {
        this.groupId = groupId;
        return this;
    }

    public WhatsappGroupParticipantsRemoveParam getParam() {
        return param;
    }

    public void setParam(WhatsappGroupParticipantsRemoveParam param) {
        this.param = param;
    }

    public WhatsappGroupParticipantsRemoveRequest param(WhatsappGroupParticipantsRemoveParam param) {
        this.param = param;
        return this;
    }
}
