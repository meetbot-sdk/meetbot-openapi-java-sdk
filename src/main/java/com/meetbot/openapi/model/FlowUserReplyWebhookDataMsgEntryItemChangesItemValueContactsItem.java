package com.meetbot.openapi.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class FlowUserReplyWebhookDataMsgEntryItemChangesItemValueContactsItem {

    /**
     * 用户ID
     */
    @JsonProperty("user_id")
    private String userId;

    /**
     * 用户资料
     */
    private FlowUserReplyWebhookDataMsgEntryItemChangesItemValueContactsItemProfile profile;

    /**
     * WhatsApp ID
     */
    @JsonProperty("wa_id")
    private String waId;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public FlowUserReplyWebhookDataMsgEntryItemChangesItemValueContactsItem userId(String userId) {
        this.userId = userId;
        return this;
    }

    public FlowUserReplyWebhookDataMsgEntryItemChangesItemValueContactsItemProfile getProfile() {
        return profile;
    }

    public void setProfile(FlowUserReplyWebhookDataMsgEntryItemChangesItemValueContactsItemProfile profile) {
        this.profile = profile;
    }

    public FlowUserReplyWebhookDataMsgEntryItemChangesItemValueContactsItem profile(FlowUserReplyWebhookDataMsgEntryItemChangesItemValueContactsItemProfile profile) {
        this.profile = profile;
        return this;
    }

    public String getWaId() {
        return waId;
    }

    public void setWaId(String waId) {
        this.waId = waId;
    }

    public FlowUserReplyWebhookDataMsgEntryItemChangesItemValueContactsItem waId(String waId) {
        this.waId = waId;
        return this;
    }

}
