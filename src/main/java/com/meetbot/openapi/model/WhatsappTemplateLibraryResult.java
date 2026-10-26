package com.meetbot.openapi.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * 查询模板库结果；保留 Meta 扩展字段。
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class WhatsappTemplateLibraryResult extends ExtensibleDto {

    /**
     * data
     */
    private java.util.List<WhatsappTemplateLibraryResultDataItem> data;

    public java.util.List<WhatsappTemplateLibraryResultDataItem> getData() {
        return data;
    }

    public void setData(java.util.List<WhatsappTemplateLibraryResultDataItem> data) {
        this.data = data;
    }

    public WhatsappTemplateLibraryResult data(java.util.List<WhatsappTemplateLibraryResultDataItem> data) {
        this.data = data;
        return this;
    }
}
