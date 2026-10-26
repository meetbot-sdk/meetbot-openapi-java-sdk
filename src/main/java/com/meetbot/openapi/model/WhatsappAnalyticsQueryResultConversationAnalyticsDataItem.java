package com.meetbot.openapi.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * WhatsappAnalyticsQueryResultConversationAnalyticsDataItem
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class WhatsappAnalyticsQueryResultConversationAnalyticsDataItem extends ExtensibleDto {

    /**
     * start
     */
    private Long start;

    /**
     * end
     */
    private Long end;

    /**
     * conversation
     */
    private Long conversation;

    public Long getStart() {
        return start;
    }

    public void setStart(Long start) {
        this.start = start;
    }

    public WhatsappAnalyticsQueryResultConversationAnalyticsDataItem start(Long start) {
        this.start = start;
        return this;
    }

    public Long getEnd() {
        return end;
    }

    public void setEnd(Long end) {
        this.end = end;
    }

    public WhatsappAnalyticsQueryResultConversationAnalyticsDataItem end(Long end) {
        this.end = end;
        return this;
    }

    public Long getConversation() {
        return conversation;
    }

    public void setConversation(Long conversation) {
        this.conversation = conversation;
    }

    public WhatsappAnalyticsQueryResultConversationAnalyticsDataItem conversation(Long conversation) {
        this.conversation = conversation;
        return this;
    }
}
