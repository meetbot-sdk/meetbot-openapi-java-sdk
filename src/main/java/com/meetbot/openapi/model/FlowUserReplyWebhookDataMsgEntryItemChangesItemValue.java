package com.meetbot.openapi.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.JsonNode;

/**
 * 消息详情
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class FlowUserReplyWebhookDataMsgEntryItemChangesItemValue {

    /**
     * 元数据
     */
    private JsonNode metadata;

    /**
     * 固定值 whatsapp
     */
    @JsonProperty("messaging_product")
    private String messagingProduct;

    /**
     * 消息列表
     */
    private java.util.List<FlowUserReplyWebhookDataMsgEntryItemChangesItemValueMessagesItem> messages;

    /**
     * 联系人列表
     */
    private java.util.List<FlowUserReplyWebhookDataMsgEntryItemChangesItemValueContactsItem> contacts;

    public JsonNode getMetadata() {
        return metadata;
    }

    public void setMetadata(JsonNode metadata) {
        this.metadata = metadata;
    }

    public FlowUserReplyWebhookDataMsgEntryItemChangesItemValue metadata(JsonNode metadata) {
        this.metadata = metadata;
        return this;
    }

    public String getMessagingProduct() {
        return messagingProduct;
    }

    public void setMessagingProduct(String messagingProduct) {
        this.messagingProduct = messagingProduct;
    }

    public FlowUserReplyWebhookDataMsgEntryItemChangesItemValue messagingProduct(String messagingProduct) {
        this.messagingProduct = messagingProduct;
        return this;
    }

    public java.util.List<FlowUserReplyWebhookDataMsgEntryItemChangesItemValueMessagesItem> getMessages() {
        return messages;
    }

    public void setMessages(java.util.List<FlowUserReplyWebhookDataMsgEntryItemChangesItemValueMessagesItem> messages) {
        this.messages = messages;
    }

    public FlowUserReplyWebhookDataMsgEntryItemChangesItemValue messages(java.util.List<FlowUserReplyWebhookDataMsgEntryItemChangesItemValueMessagesItem> messages) {
        this.messages = messages;
        return this;
    }

    public java.util.List<FlowUserReplyWebhookDataMsgEntryItemChangesItemValueContactsItem> getContacts() {
        return contacts;
    }

    public void setContacts(java.util.List<FlowUserReplyWebhookDataMsgEntryItemChangesItemValueContactsItem> contacts) {
        this.contacts = contacts;
    }

    public FlowUserReplyWebhookDataMsgEntryItemChangesItemValue contacts(java.util.List<FlowUserReplyWebhookDataMsgEntryItemChangesItemValueContactsItem> contacts) {
        this.contacts = contacts;
        return this;
    }

}
