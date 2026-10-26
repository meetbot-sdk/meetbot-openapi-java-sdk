package com.meetbot.openapi.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class FlowUserReplyWebhookDataMsgEntryItemChangesItemValueMessagesItem {

    /**
     * 上下文信息
     */
    private FlowUserReplyWebhookDataMsgEntryItemChangesItemValueMessagesItemContext context;

    /**
     * 交互消息内容
     */
    private FlowUserReplyWebhookDataMsgEntryItemChangesItemValueMessagesItemInteractive interactive;

    /**
     * 用户手机号
     */
    private String from;

    /**
     * 消息ID
     */
    private String id;

    /**
     * 消息类型，固定为 interactive
     */
    private String type;

    /**
     * 用户ID
     */
    @JsonProperty("from_user_id")
    private String fromUserId;

    /**
     * 消息时间戳
     */
    private String timestamp;

    public FlowUserReplyWebhookDataMsgEntryItemChangesItemValueMessagesItemContext getContext() {
        return context;
    }

    public void setContext(FlowUserReplyWebhookDataMsgEntryItemChangesItemValueMessagesItemContext context) {
        this.context = context;
    }

    public FlowUserReplyWebhookDataMsgEntryItemChangesItemValueMessagesItem context(FlowUserReplyWebhookDataMsgEntryItemChangesItemValueMessagesItemContext context) {
        this.context = context;
        return this;
    }

    public FlowUserReplyWebhookDataMsgEntryItemChangesItemValueMessagesItemInteractive getInteractive() {
        return interactive;
    }

    public void setInteractive(FlowUserReplyWebhookDataMsgEntryItemChangesItemValueMessagesItemInteractive interactive) {
        this.interactive = interactive;
    }

    public FlowUserReplyWebhookDataMsgEntryItemChangesItemValueMessagesItem interactive(FlowUserReplyWebhookDataMsgEntryItemChangesItemValueMessagesItemInteractive interactive) {
        this.interactive = interactive;
        return this;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public FlowUserReplyWebhookDataMsgEntryItemChangesItemValueMessagesItem from(String from) {
        this.from = from;
        return this;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public FlowUserReplyWebhookDataMsgEntryItemChangesItemValueMessagesItem id(String id) {
        this.id = id;
        return this;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public FlowUserReplyWebhookDataMsgEntryItemChangesItemValueMessagesItem type(String type) {
        this.type = type;
        return this;
    }

    public String getFromUserId() {
        return fromUserId;
    }

    public void setFromUserId(String fromUserId) {
        this.fromUserId = fromUserId;
    }

    public FlowUserReplyWebhookDataMsgEntryItemChangesItemValueMessagesItem fromUserId(String fromUserId) {
        this.fromUserId = fromUserId;
        return this;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    public FlowUserReplyWebhookDataMsgEntryItemChangesItemValueMessagesItem timestamp(String timestamp) {
        this.timestamp = timestamp;
        return this;
    }

}
