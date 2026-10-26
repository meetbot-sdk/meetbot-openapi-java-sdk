package com.meetbot.openapi.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * WhatsappAnalyticsQueryResultConversationAnalytics
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class WhatsappAnalyticsQueryResultConversationAnalytics extends ExtensibleDto {

    /**
     * data
     */
    private java.util.List<WhatsappAnalyticsQueryResultConversationAnalyticsDataItem> data;

    public java.util.List<WhatsappAnalyticsQueryResultConversationAnalyticsDataItem> getData() {
        return data;
    }

    public void setData(java.util.List<WhatsappAnalyticsQueryResultConversationAnalyticsDataItem> data) {
        this.data = data;
    }

    public WhatsappAnalyticsQueryResultConversationAnalytics data(java.util.List<WhatsappAnalyticsQueryResultConversationAnalyticsDataItem> data) {
        this.data = data;
        return this;
    }
}
