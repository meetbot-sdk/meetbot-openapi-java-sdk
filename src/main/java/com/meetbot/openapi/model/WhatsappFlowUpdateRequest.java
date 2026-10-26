package com.meetbot.openapi.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * 更新 Flow 基本信息。{@code param} 为 Meta 官方字段。
 *
 * @see <a href="https://developers.meetbot.com/#/operations/whatsappFlowUpdate">whatsappFlowUpdate</a>
 * @see <a href="https://developers.facebook.com/documentation/business-messaging/whatsapp/flows/reference/whatsapp-business-account/flows-api#update-flow">Update Flow</a>
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class WhatsappFlowUpdateRequest {

    /**
     * Flow ID
     * Required.
     */
    private String flowId;

    /**
     * Meta Flow 更新参数。
     * Required.
     */
    private WhatsappFlowUpdateParam param;

    public String getFlowId() {
        return flowId;
    }

    public void setFlowId(String flowId) {
        this.flowId = flowId;
    }

    public WhatsappFlowUpdateRequest flowId(String flowId) {
        this.flowId = flowId;
        return this;
    }

    public WhatsappFlowUpdateParam getParam() {
        return param;
    }

    public void setParam(WhatsappFlowUpdateParam param) {
        this.param = param;
    }

    public WhatsappFlowUpdateRequest param(WhatsappFlowUpdateParam param) {
        this.param = param;
        return this;
    }
}
