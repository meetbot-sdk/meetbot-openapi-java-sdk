package com.meetbot.openapi.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.meetbot.openapi.model.enums.Channel;

/**
 * MessageOriginBatchQueryRequest
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class MessageOriginBatchQueryRequest {

    /**
     * 消息渠道，不传时默认为 whatsapp
     */
    private Channel channel;

    /**
     * 渠道消息 ID 列表，与 CONTENT 回调中的 channelMid 一致；WhatsApp 消息填写 wamid，不是业务系统消息 ID
     * Required.
     */
    private java.util.List<String> channelMids;

    public Channel getChannel() {
        return channel;
    }

    public void setChannel(Channel channel) {
        this.channel = channel;
    }

    public MessageOriginBatchQueryRequest channel(Channel channel) {
        this.channel = channel;
        return this;
    }

    public java.util.List<String> getChannelMids() {
        return channelMids;
    }

    public void setChannelMids(java.util.List<String> channelMids) {
        this.channelMids = channelMids;
    }

    public MessageOriginBatchQueryRequest channelMids(java.util.List<String> channelMids) {
        this.channelMids = channelMids;
        return this;
    }
}
