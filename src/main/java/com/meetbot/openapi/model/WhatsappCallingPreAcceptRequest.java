package com.meetbot.openapi.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class WhatsappCallingPreAcceptRequest {

    /**
     * WhatsApp Phone Number ID
     * Required.
     */
    private String phoneNumberId;

    /**
     * 透传 Meta Calling API 请求体。call_id 来自 calls_connect 回调；action 固定 pre_accept；session.sdp_type 为 answer。参考[官方文档](https://developers.facebook.com/documentation/business-messaging/whatsapp/calling/user-initiated-calls#pre-accept-call)。
     * Required.
     */
    private WhatsappCallingPreAcceptParam param;

    public String getPhoneNumberId() {
        return phoneNumberId;
    }

    public void setPhoneNumberId(String phoneNumberId) {
        this.phoneNumberId = phoneNumberId;
    }

    public WhatsappCallingPreAcceptRequest phoneNumberId(String phoneNumberId) {
        this.phoneNumberId = phoneNumberId;
        return this;
    }

    public WhatsappCallingPreAcceptParam getParam() {
        return param;
    }

    public void setParam(WhatsappCallingPreAcceptParam param) {
        this.param = param;
    }

    public WhatsappCallingPreAcceptRequest param(WhatsappCallingPreAcceptParam param) {
        this.param = param;
        return this;
    }

}
