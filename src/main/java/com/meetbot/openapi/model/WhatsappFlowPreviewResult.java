package com.meetbot.openapi.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * 预览 Flow 响应。
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class WhatsappFlowPreviewResult extends ExtensibleDto {

    private String id;
    private WhatsappFlowPreviewInfo preview;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public WhatsappFlowPreviewInfo getPreview() {
        return preview;
    }

    public void setPreview(WhatsappFlowPreviewInfo preview) {
        this.preview = preview;
    }
}
