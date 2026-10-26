package com.meetbot.openapi.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class WhatsappCallingTerminateRequest {

    /**
     * WhatsApp Phone Number ID
     * Required.
     */
    private String phoneNumberId;

    /**
     * 透传 Meta Calling API 请求体。action 固定 terminate，无需 session。参考[官方文档](https://developers.facebook.com/documentation/business-messaging/whatsapp/calling/user-initiated-calls#terminate-call)。
     * Required.
     */
    private WhatsappCallingTerminateParam param;

    public String getPhoneNumberId() {
        return phoneNumberId;
    }

    public void setPhoneNumberId(String phoneNumberId) {
        this.phoneNumberId = phoneNumberId;
    }

    public WhatsappCallingTerminateRequest phoneNumberId(String phoneNumberId) {
        this.phoneNumberId = phoneNumberId;
        return this;
    }

    public WhatsappCallingTerminateParam getParam() {
        return param;
    }

    public void setParam(WhatsappCallingTerminateParam param) {
        this.param = param;
    }

    public WhatsappCallingTerminateRequest param(WhatsappCallingTerminateParam param) {
        this.param = param;
        return this;
    }

}
