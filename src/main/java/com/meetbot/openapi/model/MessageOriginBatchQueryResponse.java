package com.meetbot.openapi.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * MessageOriginBatchQueryResponse
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class MessageOriginBatchQueryResponse {

    /**
     * 查询命中的商户侧消息；未命中或用户发送的消息不返回，可为空数组
     * Required.
     */
    private java.util.List<MessageOriginItemResponse> list;

    public java.util.List<MessageOriginItemResponse> getList() {
        return list;
    }

    public void setList(java.util.List<MessageOriginItemResponse> list) {
        this.list = list;
    }

    public MessageOriginBatchQueryResponse list(java.util.List<MessageOriginItemResponse> list) {
        this.list = list;
        return this;
    }
}
