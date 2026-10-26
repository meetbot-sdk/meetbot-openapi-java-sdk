package com.meetbot.openapi.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * WhatsappGroupJoinRequestListResultDataItem
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class WhatsappGroupJoinRequestListResultDataItem extends ExtensibleDto {

    /**
     * phone_number
     */
    @JsonProperty("phone_number")
    private String phoneNumber;

    /**
     * requested_at
     */
    @JsonProperty("requested_at")
    private String requestedAt;

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public WhatsappGroupJoinRequestListResultDataItem phoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }

    public String getRequestedAt() {
        return requestedAt;
    }

    public void setRequestedAt(String requestedAt) {
        this.requestedAt = requestedAt;
    }

    public WhatsappGroupJoinRequestListResultDataItem requestedAt(String requestedAt) {
        this.requestedAt = requestedAt;
        return this;
    }
}
