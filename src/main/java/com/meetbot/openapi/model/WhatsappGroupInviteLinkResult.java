package com.meetbot.openapi.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * 查询群组邀请链接结果；保留 Meta 扩展字段。
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class WhatsappGroupInviteLinkResult extends ExtensibleDto {

    /**
     * invite_link
     */
    @JsonProperty("invite_link")
    private String inviteLink;

    public String getInviteLink() {
        return inviteLink;
    }

    public void setInviteLink(String inviteLink) {
        this.inviteLink = inviteLink;
    }

    public WhatsappGroupInviteLinkResult inviteLink(String inviteLink) {
        this.inviteLink = inviteLink;
        return this;
    }
}
