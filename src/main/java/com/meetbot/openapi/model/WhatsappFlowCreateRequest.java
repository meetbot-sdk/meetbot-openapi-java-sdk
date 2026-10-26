package com.meetbot.openapi.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * 创建 Flow。{@code param} 为 Meta 官方字段。
 *
 * @see <a href="https://developers.meetbot.com/#/operations/whatsappFlowCreate">whatsappFlowCreate</a>
 * @see <a href="https://developers.facebook.com/documentation/business-messaging/whatsapp/flows/reference/whatsapp-business-account/flows-api#create-flow">Create Flow</a>
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class WhatsappFlowCreateRequest {

    /**
     * WhatsApp Business Account ID (WABA ID)
     * Required.
     */
    private String wabaId;

    /**
     * Meta Flow 创建参数。
     * Required.
     */
    private WhatsappFlowCreateParam param;

    public String getWabaId() {
        return wabaId;
    }

    public void setWabaId(String wabaId) {
        this.wabaId = wabaId;
    }

    public WhatsappFlowCreateRequest wabaId(String wabaId) {
        this.wabaId = wabaId;
        return this;
    }

    public WhatsappFlowCreateParam getParam() {
        return param;
    }

    public void setParam(WhatsappFlowCreateParam param) {
        this.param = param;
    }

    public WhatsappFlowCreateRequest param(WhatsappFlowCreateParam param) {
        this.param = param;
        return this;
    }
}
