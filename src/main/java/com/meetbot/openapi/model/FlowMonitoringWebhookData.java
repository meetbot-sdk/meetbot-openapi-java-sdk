package com.meetbot.openapi.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * Flow监控类Webhook（客户端错误率/端点错误率/通道延迟/通道可用性/版本冻结）通用数据结构。由Meetbot包装为type=FLOW_WEBHOOK推送至客户配置的Webhook地址。value内的字段均为Meta官方定义。
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class FlowMonitoringWebhookData {

    /**
     * 回调类型，固定为 FLOW_WEBHOOK
     */
    private String type;

    /**
     * 业务数据
     */
    private FlowMonitoringWebhookDataMsg msg;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public FlowMonitoringWebhookData type(String type) {
        this.type = type;
        return this;
    }

    public FlowMonitoringWebhookDataMsg getMsg() {
        return msg;
    }

    public void setMsg(FlowMonitoringWebhookDataMsg msg) {
        this.msg = msg;
    }

    public FlowMonitoringWebhookData msg(FlowMonitoringWebhookDataMsg msg) {
        this.msg = msg;
        return this;
    }

}
