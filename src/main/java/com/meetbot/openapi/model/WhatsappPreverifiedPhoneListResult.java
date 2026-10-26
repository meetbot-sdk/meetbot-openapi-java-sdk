package com.meetbot.openapi.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * 查询预验证号码结果；保留 Meta 扩展字段。
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class WhatsappPreverifiedPhoneListResult extends ExtensibleDto {

    /**
     * data
     */
    private java.util.List<WhatsappPreverifiedPhoneListResultDataItem> data;

    public java.util.List<WhatsappPreverifiedPhoneListResultDataItem> getData() {
        return data;
    }

    public void setData(java.util.List<WhatsappPreverifiedPhoneListResultDataItem> data) {
        this.data = data;
    }

    public WhatsappPreverifiedPhoneListResult data(java.util.List<WhatsappPreverifiedPhoneListResultDataItem> data) {
        this.data = data;
        return this;
    }
}
