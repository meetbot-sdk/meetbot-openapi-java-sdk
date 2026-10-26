package com.meetbot.openapi.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * WhatsappMediaDeleteRequest
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class WhatsappMediaDeleteRequest {

    /**
     * 媒体文件 ID
     * Required.
     */
    private String mediaId;

    public String getMediaId() {
        return mediaId;
    }

    public void setMediaId(String mediaId) {
        this.mediaId = mediaId;
    }

    public WhatsappMediaDeleteRequest mediaId(String mediaId) {
        this.mediaId = mediaId;
        return this;
    }
}
