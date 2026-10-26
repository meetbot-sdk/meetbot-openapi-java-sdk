package com.meetbot.openapi.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * 批量创建或更新认证模板结果；保留 Meta 扩展字段。
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class WhatsappTemplateUpsertResult extends ExtensibleDto {

    /**
     * data
     */
    private java.util.List<WhatsappTemplateUpsertResultDataItem> data;

    public java.util.List<WhatsappTemplateUpsertResultDataItem> getData() {
        return data;
    }

    public void setData(java.util.List<WhatsappTemplateUpsertResultDataItem> data) {
        this.data = data;
    }

    public WhatsappTemplateUpsertResult data(java.util.List<WhatsappTemplateUpsertResultDataItem> data) {
        this.data = data;
        return this;
    }
}
