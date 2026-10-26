package com.meetbot.openapi.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * WhatsappGroupUpdateRequest
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class WhatsappGroupUpdateRequest {

    /**
     * 群组 ID
     * Required.
     */
    private String groupId;

    /**
     * Meta 官方请求参数
     * Required.
     */
    private WhatsappGroupUpdateParam param;

    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    public WhatsappGroupUpdateRequest groupId(String groupId) {
        this.groupId = groupId;
        return this;
    }

    public WhatsappGroupUpdateParam getParam() {
        return param;
    }

    public void setParam(WhatsappGroupUpdateParam param) {
        this.param = param;
    }

    public WhatsappGroupUpdateRequest param(WhatsappGroupUpdateParam param) {
        this.param = param;
        return this;
    }
}
