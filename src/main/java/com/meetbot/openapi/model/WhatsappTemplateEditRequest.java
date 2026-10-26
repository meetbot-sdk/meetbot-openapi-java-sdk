package com.meetbot.openapi.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * 模板编辑请求。{@code param} 为 Meta 消息模板结构。
 *
 * @see <a href="https://developers.meetbot.com/#/operations/whatsappTemplateEdit">whatsappTemplateEdit</a>
 * @see <a href="https://developers.facebook.com/documentation/business-messaging/whatsapp/reference/whatsapp-business-account/message-template-api">Message Template API</a>
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class WhatsappTemplateEditRequest {

    /**
     * WhatsApp Business Account Id(wabaId)
     * Required.
     */
    private String whatsappBusinessAccountId;

    /**
     * WhatsApp模板id
     * Required.
     */
    private String templateId;

    /**
     * Meta 模板更新字段。
     * Required.
     */
    private WhatsappMessageTemplateParam param;

    public String getWhatsappBusinessAccountId() {
        return whatsappBusinessAccountId;
    }

    public void setWhatsappBusinessAccountId(String whatsappBusinessAccountId) {
        this.whatsappBusinessAccountId = whatsappBusinessAccountId;
    }

    public WhatsappTemplateEditRequest whatsappBusinessAccountId(String whatsappBusinessAccountId) {
        this.whatsappBusinessAccountId = whatsappBusinessAccountId;
        return this;
    }

    public String getTemplateId() {
        return templateId;
    }

    public void setTemplateId(String templateId) {
        this.templateId = templateId;
    }

    public WhatsappTemplateEditRequest templateId(String templateId) {
        this.templateId = templateId;
        return this;
    }

    public WhatsappMessageTemplateParam getParam() {
        return param;
    }

    public void setParam(WhatsappMessageTemplateParam param) {
        this.param = param;
    }

    public WhatsappTemplateEditRequest param(WhatsappMessageTemplateParam param) {
        this.param = param;
        return this;
    }
}
