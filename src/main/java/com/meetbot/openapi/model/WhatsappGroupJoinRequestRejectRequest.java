package com.meetbot.openapi.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * WhatsappGroupJoinRequestRejectRequest
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class WhatsappGroupJoinRequestRejectRequest {

    /**
     * 群组 ID
     * Required.
     */
    private String groupId;

    /**
     * Meta 官方请求参数
     * Required.
     */
    private WhatsappGroupJoinRequestRejectParam param;

    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    public WhatsappGroupJoinRequestRejectRequest groupId(String groupId) {
        this.groupId = groupId;
        return this;
    }

    public WhatsappGroupJoinRequestRejectParam getParam() {
        return param;
    }

    public void setParam(WhatsappGroupJoinRequestRejectParam param) {
        this.param = param;
    }

    public WhatsappGroupJoinRequestRejectRequest param(WhatsappGroupJoinRequestRejectParam param) {
        this.param = param;
        return this;
    }
}
