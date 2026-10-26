package com.meetbot.openapi.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class WhatsappCallingAcceptRequest {

    /**
     * WhatsApp Phone Number ID
     * Required.
     */
    private String phoneNumberId;

    /**
     * 透传 Meta Calling API 请求体。action 固定 accept；session 与 preAccept 使用同一份 SDP Answer。参考[官方文档](https://developers.facebook.com/documentation/business-messaging/whatsapp/calling/user-initiated-calls#accept-call)。
     * Required.
     */
    private WhatsappCallingAcceptParam param;

    public String getPhoneNumberId() {
        return phoneNumberId;
    }

    public void setPhoneNumberId(String phoneNumberId) {
        this.phoneNumberId = phoneNumberId;
    }

    public WhatsappCallingAcceptRequest phoneNumberId(String phoneNumberId) {
        this.phoneNumberId = phoneNumberId;
        return this;
    }

    public WhatsappCallingAcceptParam getParam() {
        return param;
    }

    public void setParam(WhatsappCallingAcceptParam param) {
        this.param = param;
    }

    public WhatsappCallingAcceptRequest param(WhatsappCallingAcceptParam param) {
        this.param = param;
        return this;
    }

}
