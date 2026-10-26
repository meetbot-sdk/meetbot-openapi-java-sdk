package com.meetbot.openapi.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * 对比消息模板表现结果；保留 Meta 扩展字段。
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class WhatsappTemplateCompareResult extends ExtensibleDto {

    /**
     * data
     */
    private java.util.List<WhatsappTemplateCompareResultDataItem> data;

    public java.util.List<WhatsappTemplateCompareResultDataItem> getData() {
        return data;
    }

    public void setData(java.util.List<WhatsappTemplateCompareResultDataItem> data) {
        this.data = data;
    }

    public WhatsappTemplateCompareResult data(java.util.List<WhatsappTemplateCompareResultDataItem> data) {
        this.data = data;
        return this;
    }
}
