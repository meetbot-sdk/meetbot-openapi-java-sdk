package com.meetbot.openapi.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * 查询WhatsApp分析数据结果；保留 Meta 扩展字段。
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class WhatsappAnalyticsQueryResult extends ExtensibleDto {

    /**
     * conversation_analytics
     */
    @JsonProperty("conversation_analytics")
    private WhatsappAnalyticsQueryResultConversationAnalytics conversationAnalytics;

    /**
     * id
     */
    private String id;

    public WhatsappAnalyticsQueryResultConversationAnalytics getConversationAnalytics() {
        return conversationAnalytics;
    }

    public void setConversationAnalytics(WhatsappAnalyticsQueryResultConversationAnalytics conversationAnalytics) {
        this.conversationAnalytics = conversationAnalytics;
    }

    public WhatsappAnalyticsQueryResult conversationAnalytics(WhatsappAnalyticsQueryResultConversationAnalytics conversationAnalytics) {
        this.conversationAnalytics = conversationAnalytics;
        return this;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public WhatsappAnalyticsQueryResult id(String id) {
        this.id = id;
        return this;
    }
}
