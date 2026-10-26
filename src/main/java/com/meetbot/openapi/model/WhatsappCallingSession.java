package com.meetbot.openapi.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.meetbot.openapi.model.enums.SdpType;

@JsonIgnoreProperties(ignoreUnknown = true)
public class WhatsappCallingSession {

    /**
     * SDP 类型。商家发起通话时为 offer；预接听/接听用户来电时为 answer
     * Required.
     */
    @JsonProperty("sdp_type")
    private SdpType sdpType;

    /**
     * RFC 8866 SDP 文本，由本地 WebRTC 堆栈生成。字段名与 Meta 官方一致。
     * Required.
     */
    private String sdp;

    public SdpType getSdpType() {
        return sdpType;
    }

    public void setSdpType(SdpType sdpType) {
        this.sdpType = sdpType;
    }

    public WhatsappCallingSession sdpType(SdpType sdpType) {
        this.sdpType = sdpType;
        return this;
    }

    public String getSdp() {
        return sdp;
    }

    public void setSdp(String sdp) {
        this.sdp = sdp;
    }

    public WhatsappCallingSession sdp(String sdp) {
        this.sdp = sdp;
        return this;
    }

}
