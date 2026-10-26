package com.meetbot.openapi.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * 预览认证模板结果；保留 Meta 扩展字段。
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class WhatsappTemplatePreviewResult extends ExtensibleDto {

    /**
     * data
     */
    private java.util.List<WhatsappTemplatePreviewResultDataItem> data;

    public java.util.List<WhatsappTemplatePreviewResultDataItem> getData() {
        return data;
    }

    public void setData(java.util.List<WhatsappTemplatePreviewResultDataItem> data) {
        this.data = data;
    }

    public WhatsappTemplatePreviewResult data(java.util.List<WhatsappTemplatePreviewResultDataItem> data) {
        this.data = data;
        return this;
    }
}
