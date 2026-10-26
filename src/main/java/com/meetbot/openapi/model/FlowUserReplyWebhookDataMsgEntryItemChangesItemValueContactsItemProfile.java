package com.meetbot.openapi.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * 用户资料
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class FlowUserReplyWebhookDataMsgEntryItemChangesItemValueContactsItemProfile {

    /**
     * 用户姓名
     */
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public FlowUserReplyWebhookDataMsgEntryItemChangesItemValueContactsItemProfile name(String name) {
        this.name = name;
        return this;
    }

}
