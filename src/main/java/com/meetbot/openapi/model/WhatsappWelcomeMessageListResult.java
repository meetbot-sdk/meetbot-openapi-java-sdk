package com.meetbot.openapi.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * 查询欢迎消息序列结果；保留 Meta 扩展字段。
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class WhatsappWelcomeMessageListResult extends ExtensibleDto {

    /**
     * data
     */
    private java.util.List<WhatsappWelcomeMessageListResultDataItem> data;

    public java.util.List<WhatsappWelcomeMessageListResultDataItem> getData() {
        return data;
    }

    public void setData(java.util.List<WhatsappWelcomeMessageListResultDataItem> data) {
        this.data = data;
    }

    public WhatsappWelcomeMessageListResult data(java.util.List<WhatsappWelcomeMessageListResultDataItem> data) {
        this.data = data;
        return this;
    }
}
