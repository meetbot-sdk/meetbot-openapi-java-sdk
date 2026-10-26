package com.meetbot.openapi.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * WABA 下的手机号信息。
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class WhatsappPhoneNumberItem extends ExtensibleDto {

    @JsonProperty("display_phone_number")
    private String displayPhoneNumber;

    @JsonProperty("name_status")
    private String nameStatus;

    private String certificate;

    @JsonProperty("verified_name")
    private String verifiedName;

    @JsonProperty("new_name_status")
    private String newNameStatus;

    private String id;

    @JsonProperty("code_verification_status")
    private String codeVerificationStatus;

    private String status;

    @JsonProperty("profile_picture_url")
    private String profilePictureUrl;

    public String getDisplayPhoneNumber() {
        return displayPhoneNumber;
    }

    public void setDisplayPhoneNumber(String displayPhoneNumber) {
        this.displayPhoneNumber = displayPhoneNumber;
    }

    public String getNameStatus() {
        return nameStatus;
    }

    public void setNameStatus(String nameStatus) {
        this.nameStatus = nameStatus;
    }

    public String getCertificate() {
        return certificate;
    }

    public void setCertificate(String certificate) {
        this.certificate = certificate;
    }

    public String getVerifiedName() {
        return verifiedName;
    }

    public void setVerifiedName(String verifiedName) {
        this.verifiedName = verifiedName;
    }

    public String getNewNameStatus() {
        return newNameStatus;
    }

    public void setNewNameStatus(String newNameStatus) {
        this.newNameStatus = newNameStatus;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCodeVerificationStatus() {
        return codeVerificationStatus;
    }

    public void setCodeVerificationStatus(String codeVerificationStatus) {
        this.codeVerificationStatus = codeVerificationStatus;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getProfilePictureUrl() {
        return profilePictureUrl;
    }

    public void setProfilePictureUrl(String profilePictureUrl) {
        this.profilePictureUrl = profilePictureUrl;
    }
}
