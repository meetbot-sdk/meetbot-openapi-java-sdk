package com.meetbot.openapi.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * WhatsappGroupJoinRequestApproveRequest
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class WhatsappGroupJoinRequestApproveRequest {

    /**
     * 群组 ID
     * Required.
     */
    private String groupId;

    /**
     * Meta 官方请求参数
     * Required.
     */
    private WhatsappGroupJoinRequestApproveParam param;

    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    public WhatsappGroupJoinRequestApproveRequest groupId(String groupId) {
        this.groupId = groupId;
        return this;
    }

    public WhatsappGroupJoinRequestApproveParam getParam() {
        return param;
    }

    public void setParam(WhatsappGroupJoinRequestApproveParam param) {
        this.param = param;
    }

    public WhatsappGroupJoinRequestApproveRequest param(WhatsappGroupJoinRequestApproveParam param) {
        this.param = param;
        return this;
    }
}
