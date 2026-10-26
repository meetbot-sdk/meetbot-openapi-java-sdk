package com.meetbot.openapi.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * 发送自定义消息请求。{@code param} 为 Meta Cloud API 消息体。
 *
 * @see <a href="https://developers.meetbot.com/#/operations/sendMessage">sendMessage</a>
 * @see <a href="https://developers.facebook.com/documentation/business-messaging/whatsapp/messages/send-messages">Send messages</a>
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class SendMessageRequest {

    /**
     * waba手机号id
     * Required.
     */
    private String phoneNumberId;

    /**
     * Meta 官方发送消息对象。
     * Required.
     */
    private WhatsappMessageSendParam param;

    public String getPhoneNumberId() {
        return phoneNumberId;
    }

    public void setPhoneNumberId(String phoneNumberId) {
        this.phoneNumberId = phoneNumberId;
    }

    public SendMessageRequest phoneNumberId(String phoneNumberId) {
        this.phoneNumberId = phoneNumberId;
        return this;
    }

    public WhatsappMessageSendParam getParam() {
        return param;
    }

    public void setParam(WhatsappMessageSendParam param) {
        this.param = param;
    }

    public SendMessageRequest param(WhatsappMessageSendParam param) {
        this.param = param;
        return this;
    }
}
