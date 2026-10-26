package com.meetbot.openapi.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class WhatsappCallingRejectRequest {

    /**
     * WhatsApp Phone Number ID
     * Required.
     */
    private String phoneNumberId;

    /**
     * 透传 Meta Calling API 请求体。action 固定 reject，无需 session。参考[官方文档](https://developers.facebook.com/documentation/business-messaging/whatsapp/calling/user-initiated-calls#reject-call)。
     * Required.
     */
    private WhatsappCallingRejectParam param;

    public String getPhoneNumberId() {
        return phoneNumberId;
    }

    public void setPhoneNumberId(String phoneNumberId) {
        this.phoneNumberId = phoneNumberId;
    }

    public WhatsappCallingRejectRequest phoneNumberId(String phoneNumberId) {
        this.phoneNumberId = phoneNumberId;
        return this;
    }

    public WhatsappCallingRejectParam getParam() {
        return param;
    }

    public void setParam(WhatsappCallingRejectParam param) {
        this.param = param;
    }

    public WhatsappCallingRejectRequest param(WhatsappCallingRejectParam param) {
        this.param = param;
        return this;
    }

}
