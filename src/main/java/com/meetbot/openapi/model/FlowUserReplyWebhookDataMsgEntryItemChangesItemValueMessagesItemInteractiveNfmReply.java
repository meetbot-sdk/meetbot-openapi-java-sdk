package com.meetbot.openapi.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Flow表单回复内容
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class FlowUserReplyWebhookDataMsgEntryItemChangesItemValueMessagesItemInteractiveNfmReply {

    /**
     * 固定值 flow
     */
    private String name;

    /**
     * 用户填写的表单数据（JSON字符串），包含各屏幕的字段值。注意：若Flow配置了端到端加密，response_json内容将被加密。
     */
    @JsonProperty("response_json")
    private String responseJson;

    /**
     * 回复文本
     */
    private String body;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public FlowUserReplyWebhookDataMsgEntryItemChangesItemValueMessagesItemInteractiveNfmReply name(String name) {
        this.name = name;
        return this;
    }

    public String getResponseJson() {
        return responseJson;
    }

    public void setResponseJson(String responseJson) {
        this.responseJson = responseJson;
    }

    public FlowUserReplyWebhookDataMsgEntryItemChangesItemValueMessagesItemInteractiveNfmReply responseJson(String responseJson) {
        this.responseJson = responseJson;
        return this;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public FlowUserReplyWebhookDataMsgEntryItemChangesItemValueMessagesItemInteractiveNfmReply body(String body) {
        this.body = body;
        return this;
    }

}
