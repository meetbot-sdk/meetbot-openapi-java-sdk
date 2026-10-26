package com.meetbot.openapi.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * 模板创建请求。{@code param} 为 Meta 消息模板结构。
 *
 * @see <a href="https://developers.meetbot.com/#/operations/whatsappTemplateCreate">whatsappTemplateCreate</a>
 * @see <a href="https://developers.facebook.com/documentation/business-messaging/whatsapp/reference/whatsapp-business-account/message-template-api">Message Template API</a>
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class WhatsappTemplateCreateRequest {

    /**
     * WhatsApp Business Account Id(wabaId)
     * Required.
     */
    private String whatsappBusinessAccountId;

    /**
     * Meta 模板创建字段。
     * Required.
     */
    private WhatsappMessageTemplateParam param;

    public String getWhatsappBusinessAccountId() {
        return whatsappBusinessAccountId;
    }

    public void setWhatsappBusinessAccountId(String whatsappBusinessAccountId) {
        this.whatsappBusinessAccountId = whatsappBusinessAccountId;
    }

    public WhatsappTemplateCreateRequest whatsappBusinessAccountId(String whatsappBusinessAccountId) {
        this.whatsappBusinessAccountId = whatsappBusinessAccountId;
        return this;
    }

    public WhatsappMessageTemplateParam getParam() {
        return param;
    }

    public void setParam(WhatsappMessageTemplateParam param) {
        this.param = param;
    }

    public WhatsappTemplateCreateRequest param(WhatsappMessageTemplateParam param) {
        this.param = param;
        return this;
    }
}
