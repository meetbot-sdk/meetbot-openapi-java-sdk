package com.meetbot.openapi.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Flow 预览信息。
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class WhatsappFlowPreviewInfo extends ExtensibleDto {

    @JsonProperty("preview_url")
    private String previewUrl;

    @JsonProperty("expires_at")
    private String expiresAt;

    public String getPreviewUrl() {
        return previewUrl;
    }

    public void setPreviewUrl(String previewUrl) {
        this.previewUrl = previewUrl;
    }

    public String getExpiresAt() {
        return expiresAt;
    }

    public void setExpiresAt(String expiresAt) {
        this.expiresAt = expiresAt;
    }
}
