package com.meetbot.openapi.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * 用户提交Flow表单回复的Webhook回调数据结构。由Meetbot包装为type=CONTENT推送至客户配置的Webhook地址。messages[].interactive.type为nfm_reply，interactive.nfm_reply.response_json包含用户填写的表单数据。
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class FlowUserReplyWebhookData {

    /**
     * 回调类型，固定为 CONTENT
     */
    private String type;

    /**
     * 业务数据
     */
    private FlowUserReplyWebhookDataMsg msg;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public FlowUserReplyWebhookData type(String type) {
        this.type = type;
        return this;
    }

    public FlowUserReplyWebhookDataMsg getMsg() {
        return msg;
    }

    public void setMsg(FlowUserReplyWebhookDataMsg msg) {
        this.msg = msg;
    }

    public FlowUserReplyWebhookData msg(FlowUserReplyWebhookDataMsg msg) {
        this.msg = msg;
        return this;
    }

}
