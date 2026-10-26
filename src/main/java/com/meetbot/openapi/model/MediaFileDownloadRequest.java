package com.meetbot.openapi.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class MediaFileDownloadRequest {

    /**
     * WhatsApp的mediaId
     * Required.
     */
    private String mediaId;

    /**
     * 文件类型，[官方支持的媒体类型](https://developers.facebook.com/documentation/business-messaging/whatsapp/business-phone-numbers/media#supported-media-types)
     * Required.
     */
    private String mineType;

    public String getMediaId() {
        return mediaId;
    }

    public void setMediaId(String mediaId) {
        this.mediaId = mediaId;
    }

    public MediaFileDownloadRequest mediaId(String mediaId) {
        this.mediaId = mediaId;
        return this;
    }

    public String getMineType() {
        return mineType;
    }

    public void setMineType(String mineType) {
        this.mineType = mineType;
    }

    public MediaFileDownloadRequest mineType(String mineType) {
        this.mineType = mineType;
        return this;
    }

}
