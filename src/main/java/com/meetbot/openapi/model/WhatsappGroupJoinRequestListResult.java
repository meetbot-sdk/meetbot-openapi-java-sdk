package com.meetbot.openapi.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * 查询群组加入申请结果；保留 Meta 扩展字段。
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class WhatsappGroupJoinRequestListResult extends ExtensibleDto {

    /**
     * data
     */
    private java.util.List<WhatsappGroupJoinRequestListResultDataItem> data;

    public java.util.List<WhatsappGroupJoinRequestListResultDataItem> getData() {
        return data;
    }

    public void setData(java.util.List<WhatsappGroupJoinRequestListResultDataItem> data) {
        this.data = data;
    }

    public WhatsappGroupJoinRequestListResult data(java.util.List<WhatsappGroupJoinRequestListResultDataItem> data) {
        this.data = data;
        return this;
    }
}
