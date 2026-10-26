package com.meetbot.openapi.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * Flow状态变更Webhook回调数据结构。由Meetbot包装为type=FLOW_WEBHOOK推送至客户配置的Webhook地址。
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class FlowStatusChangeWebhookData {

    /**
     * 回调类型，固定为 FLOW_WEBHOOK
     */
    private String type;

    /**
     * 业务数据
     */
    private FlowStatusChangeWebhookDataMsg msg;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public FlowStatusChangeWebhookData type(String type) {
        this.type = type;
        return this;
    }

    public FlowStatusChangeWebhookDataMsg getMsg() {
        return msg;
    }

    public void setMsg(FlowStatusChangeWebhookDataMsg msg) {
        this.msg = msg;
    }

    public FlowStatusChangeWebhookData msg(FlowStatusChangeWebhookDataMsg msg) {
        this.msg = msg;
        return this;
    }

}
