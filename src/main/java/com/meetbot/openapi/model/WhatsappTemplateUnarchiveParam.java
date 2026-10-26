package com.meetbot.openapi.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * WhatsappTemplateUnarchiveParam
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class WhatsappTemplateUnarchiveParam {

    /**
     * 待取消归档的模板 ID
     * Required.
     */
    @JsonProperty("hsm_ids")
    private java.util.List<String> hsmIds;

    public java.util.List<String> getHsmIds() {
        return hsmIds;
    }

    public void setHsmIds(java.util.List<String> hsmIds) {
        this.hsmIds = hsmIds;
    }

    public WhatsappTemplateUnarchiveParam hsmIds(java.util.List<String> hsmIds) {
        this.hsmIds = hsmIds;
        return this;
    }
}
