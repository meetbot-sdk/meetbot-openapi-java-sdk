package com.meetbot.openapi.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * 交互消息内容
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class FlowUserReplyWebhookDataMsgEntryItemChangesItemValueMessagesItemInteractive {

    /**
     * 交互类型，固定为 nfm_reply
     */
    private String type;

    /**
     * Flow表单回复内容
     */
    @JsonProperty("nfm_reply")
    private FlowUserReplyWebhookDataMsgEntryItemChangesItemValueMessagesItemInteractiveNfmReply nfmReply;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public FlowUserReplyWebhookDataMsgEntryItemChangesItemValueMessagesItemInteractive type(String type) {
        this.type = type;
        return this;
    }

    public FlowUserReplyWebhookDataMsgEntryItemChangesItemValueMessagesItemInteractiveNfmReply getNfmReply() {
        return nfmReply;
    }

    public void setNfmReply(FlowUserReplyWebhookDataMsgEntryItemChangesItemValueMessagesItemInteractiveNfmReply nfmReply) {
        this.nfmReply = nfmReply;
    }

    public FlowUserReplyWebhookDataMsgEntryItemChangesItemValueMessagesItemInteractive nfmReply(FlowUserReplyWebhookDataMsgEntryItemChangesItemValueMessagesItemInteractiveNfmReply nfmReply) {
        this.nfmReply = nfmReply;
        return this;
    }

}
