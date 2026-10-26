package com.meetbot.openapi.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * 发送模板/交互消息时的参数项。{@code type} 为 text / image / video / document / currency / date_time / payload / coupon_code 等。
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class WhatsappMessageParameter extends ExtensibleDto {

    /** Required. */
    private String type;

    private String text;
    private String payload;

    @JsonProperty("parameter_name")
    private String parameterName;

    @JsonProperty("coupon_code")
    private String couponCode;

    private WhatsappMediaObject image;
    private WhatsappMediaObject video;
    private WhatsappMediaObject document;
    private WhatsappMediaObject audio;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public WhatsappMessageParameter type(String type) {
        this.type = type;
        return this;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public WhatsappMessageParameter text(String text) {
        this.text = text;
        return this;
    }

    public String getPayload() {
        return payload;
    }

    public void setPayload(String payload) {
        this.payload = payload;
    }

    public WhatsappMessageParameter payload(String payload) {
        this.payload = payload;
        return this;
    }

    public String getParameterName() {
        return parameterName;
    }

    public void setParameterName(String parameterName) {
        this.parameterName = parameterName;
    }

    public WhatsappMessageParameter parameterName(String parameterName) {
        this.parameterName = parameterName;
        return this;
    }

    public String getCouponCode() {
        return couponCode;
    }

    public void setCouponCode(String couponCode) {
        this.couponCode = couponCode;
    }

    public WhatsappMessageParameter couponCode(String couponCode) {
        this.couponCode = couponCode;
        return this;
    }

    public WhatsappMediaObject getImage() {
        return image;
    }

    public void setImage(WhatsappMediaObject image) {
        this.image = image;
    }

    public WhatsappMessageParameter image(WhatsappMediaObject image) {
        this.image = image;
        return this;
    }

    public WhatsappMediaObject getVideo() {
        return video;
    }

    public void setVideo(WhatsappMediaObject video) {
        this.video = video;
    }

    public WhatsappMessageParameter video(WhatsappMediaObject video) {
        this.video = video;
        return this;
    }

    public WhatsappMediaObject getDocument() {
        return document;
    }

    public void setDocument(WhatsappMediaObject document) {
        this.document = document;
    }

    public WhatsappMessageParameter document(WhatsappMediaObject document) {
        this.document = document;
        return this;
    }

    public WhatsappMediaObject getAudio() {
        return audio;
    }

    public void setAudio(WhatsappMediaObject audio) {
        this.audio = audio;
    }

    public WhatsappMessageParameter audio(WhatsappMediaObject audio) {
        this.audio = audio;
        return this;
    }
}
