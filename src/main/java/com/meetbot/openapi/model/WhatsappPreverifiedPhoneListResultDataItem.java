package com.meetbot.openapi.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * WhatsappPreverifiedPhoneListResultDataItem
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class WhatsappPreverifiedPhoneListResultDataItem extends ExtensibleDto {

    /**
     * id
     */
    private String id;

    /**
     * display_phone_number
     */
    @JsonProperty("display_phone_number")
    private String displayPhoneNumber;

    /**
     * code_verification_status
     */
    @JsonProperty("code_verification_status")
    private String codeVerificationStatus;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public WhatsappPreverifiedPhoneListResultDataItem id(String id) {
        this.id = id;
        return this;
    }

    public String getDisplayPhoneNumber() {
        return displayPhoneNumber;
    }

    public void setDisplayPhoneNumber(String displayPhoneNumber) {
        this.displayPhoneNumber = displayPhoneNumber;
    }

    public WhatsappPreverifiedPhoneListResultDataItem displayPhoneNumber(String displayPhoneNumber) {
        this.displayPhoneNumber = displayPhoneNumber;
        return this;
    }

    public String getCodeVerificationStatus() {
        return codeVerificationStatus;
    }

    public void setCodeVerificationStatus(String codeVerificationStatus) {
        this.codeVerificationStatus = codeVerificationStatus;
    }

    public WhatsappPreverifiedPhoneListResultDataItem codeVerificationStatus(String codeVerificationStatus) {
        this.codeVerificationStatus = codeVerificationStatus;
        return this;
    }
}
