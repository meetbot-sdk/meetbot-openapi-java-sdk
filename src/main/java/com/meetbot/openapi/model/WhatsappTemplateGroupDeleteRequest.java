package com.meetbot.openapi.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * WhatsappTemplateGroupDeleteRequest
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class WhatsappTemplateGroupDeleteRequest {

    /**
     * 模板组 ID
     * Required.
     */
    private String templateGroupId;

    public String getTemplateGroupId() {
        return templateGroupId;
    }

    public void setTemplateGroupId(String templateGroupId) {
        this.templateGroupId = templateGroupId;
    }

    public WhatsappTemplateGroupDeleteRequest templateGroupId(String templateGroupId) {
        this.templateGroupId = templateGroupId;
        return this;
    }
}
