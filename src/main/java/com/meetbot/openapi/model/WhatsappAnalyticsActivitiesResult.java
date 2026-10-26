package com.meetbot.openapi.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * 查询WABA活动记录结果；保留 Meta 扩展字段。
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class WhatsappAnalyticsActivitiesResult extends ExtensibleDto {

    /**
     * data
     */
    private java.util.List<WhatsappAnalyticsActivitiesResultDataItem> data;

    public java.util.List<WhatsappAnalyticsActivitiesResultDataItem> getData() {
        return data;
    }

    public void setData(java.util.List<WhatsappAnalyticsActivitiesResultDataItem> data) {
        this.data = data;
    }

    public WhatsappAnalyticsActivitiesResult data(java.util.List<WhatsappAnalyticsActivitiesResultDataItem> data) {
        this.data = data;
        return this;
    }
}
