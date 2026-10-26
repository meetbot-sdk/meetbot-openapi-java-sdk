package com.meetbot.openapi.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * WhatsappGroupInviteLinkResetRequest
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class WhatsappGroupInviteLinkResetRequest {

    /**
     * 群组 ID
     * Required.
     */
    private String groupId;

    /**
     * Meta 官方请求参数
     * Required.
     */
    private WhatsappGroupInviteLinkResetParam param;

    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    public WhatsappGroupInviteLinkResetRequest groupId(String groupId) {
        this.groupId = groupId;
        return this;
    }

    public WhatsappGroupInviteLinkResetParam getParam() {
        return param;
    }

    public void setParam(WhatsappGroupInviteLinkResetParam param) {
        this.param = param;
    }

    public WhatsappGroupInviteLinkResetRequest param(WhatsappGroupInviteLinkResetParam param) {
        this.param = param;
        return this;
    }
}
