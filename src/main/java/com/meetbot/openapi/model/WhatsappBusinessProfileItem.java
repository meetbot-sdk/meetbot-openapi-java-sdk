package com.meetbot.openapi.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * WhatsApp 商业资料条目。
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class WhatsappBusinessProfileItem extends ExtensibleDto {

    private String address;

    @JsonProperty("profile_picture_url")
    private String profilePictureUrl;

    @JsonProperty("messaging_product")
    private String messagingProduct;

    private String about;
    private String description;
    private String email;
    private List<String> websites;
    private String vertical;

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getProfilePictureUrl() {
        return profilePictureUrl;
    }

    public void setProfilePictureUrl(String profilePictureUrl) {
        this.profilePictureUrl = profilePictureUrl;
    }

    public String getMessagingProduct() {
        return messagingProduct;
    }

    public void setMessagingProduct(String messagingProduct) {
        this.messagingProduct = messagingProduct;
    }

    public String getAbout() {
        return about;
    }

    public void setAbout(String about) {
        this.about = about;
    }

    public WhatsappBusinessProfileItem about(String about) {
        this.about = about;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public WhatsappBusinessProfileItem description(String description) {
        this.description = description;
        return this;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public WhatsappBusinessProfileItem email(String email) {
        this.email = email;
        return this;
    }

    public List<String> getWebsites() {
        return websites;
    }

    public void setWebsites(List<String> websites) {
        this.websites = websites;
    }

    public String getVertical() {
        return vertical;
    }

    public void setVertical(String vertical) {
        this.vertical = vertical;
    }
}
