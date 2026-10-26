package com.meetbot.openapi.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * 查询群组列表结果；保留 Meta 扩展字段。
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class WhatsappGroupListResult extends ExtensibleDto {

    /**
     * data
     */
    private java.util.List<WhatsappGroupListResultDataItem> data;

    public java.util.List<WhatsappGroupListResultDataItem> getData() {
        return data;
    }

    public void setData(java.util.List<WhatsappGroupListResultDataItem> data) {
        this.data = data;
    }

    public WhatsappGroupListResult data(java.util.List<WhatsappGroupListResultDataItem> data) {
        this.data = data;
        return this;
    }
}
