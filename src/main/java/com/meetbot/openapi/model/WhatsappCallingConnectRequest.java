package com.meetbot.openapi.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class WhatsappCallingConnectRequest {

    /**
     * WhatsApp Phone Number ID
     * Required.
     */
    private String phoneNumberId;

    /**
     * 透传 Meta Calling API 请求体。{@code to} 与 {@code recipient}（BSUID）至少填一个。
     * 参考 <a href="https://developers.facebook.com/documentation/business-messaging/whatsapp/calling/business-initiated-calls#endpoints-for-business-initiated-calling">Business-initiated calling</a>
     * 与 <a href="https://developers.facebook.com/documentation/business-messaging/whatsapp/business-scoped-user-ids">Business-scoped user IDs</a>。
     * Required.
     */
    private WhatsappCallingConnectParam param;

    public String getPhoneNumberId() {
        return phoneNumberId;
    }

    public void setPhoneNumberId(String phoneNumberId) {
        this.phoneNumberId = phoneNumberId;
    }

    public WhatsappCallingConnectRequest phoneNumberId(String phoneNumberId) {
        this.phoneNumberId = phoneNumberId;
        return this;
    }

    public WhatsappCallingConnectParam getParam() {
        return param;
    }

    public void setParam(WhatsappCallingConnectParam param) {
        this.param = param;
    }

    public WhatsappCallingConnectRequest param(WhatsappCallingConnectParam param) {
        this.param = param;
        return this;
    }

}
