package com.meetbot.openapi.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * 上下文信息
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class FlowUserReplyWebhookDataMsgEntryItemChangesItemValueMessagesItemContext {

    /**
     * 发送者号码
     */
    private String from;

    /**
     * 原始消息ID
     */
    private String id;

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public FlowUserReplyWebhookDataMsgEntryItemChangesItemValueMessagesItemContext from(String from) {
        this.from = from;
        return this;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public FlowUserReplyWebhookDataMsgEntryItemChangesItemValueMessagesItemContext id(String id) {
        this.id = id;
        return this;
    }

}
