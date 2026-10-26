package com.meetbot.openapi.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class MediaFileUploadRequest {

    /**
     * 文件url地址
     * Required.
     */
    private String fileUrl;

    /**
     * 文件类型，[官方支持的媒体类型](https://developers.facebook.com/documentation/business-messaging/whatsapp/business-phone-numbers/media#supported-media-types)
     * Required.
     */
    private String type;

    /**
     * waba手机号id
     * Required.
     */
    private String phoneNumberId;

    public String getFileUrl() {
        return fileUrl;
    }

    public void setFileUrl(String fileUrl) {
        this.fileUrl = fileUrl;
    }

    public MediaFileUploadRequest fileUrl(String fileUrl) {
        this.fileUrl = fileUrl;
        return this;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public MediaFileUploadRequest type(String type) {
        this.type = type;
        return this;
    }

    public String getPhoneNumberId() {
        return phoneNumberId;
    }

    public void setPhoneNumberId(String phoneNumberId) {
        this.phoneNumberId = phoneNumberId;
    }

    public MediaFileUploadRequest phoneNumberId(String phoneNumberId) {
        this.phoneNumberId = phoneNumberId;
        return this;
    }

}
