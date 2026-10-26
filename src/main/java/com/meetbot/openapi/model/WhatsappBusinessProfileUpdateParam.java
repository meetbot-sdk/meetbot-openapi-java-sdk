package com.meetbot.openapi.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.meetbot.openapi.model.enums.WhatsappBusinessVertical;

import java.util.List;

/**
 * Meta 更新商业资料请求体（Meetbot {@code WhatsAppAccountProfileUpdateRequest.param}）。
 *
 * @see <a href="https://developers.facebook.com/documentation/business-messaging/whatsapp/business-phone-numbers/business-profiles">Business profiles</a>
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class WhatsappBusinessProfileUpdateParam extends ExtensibleDto {

    /**
     * 固定 {@code whatsapp}。
     * Required.
     */
    @JsonProperty("messaging_product")
    private String messagingProduct = "whatsapp";

    /** About 文案，1–139 字符。 */
    private String about;

    /** 地址，最多 256 字符。 */
    private String address;

    /** 描述，最多 512 字符。 */
    private String description;

    /** 联系邮箱，最多 128 字符。 */
    private String email;

    /** 行业分类。 */
    private WhatsappBusinessVertical vertical;

    /** 最多 2 个 URL，须含 http/https。 */
    private List<String> websites;

    /**
     * 资料图片 handle（Resumable Upload API 上传后得到）。
     */
    @JsonProperty("profile_picture_handle")
    private String profilePictureHandle;

    public String getMessagingProduct() {
        return messagingProduct;
    }

    public void setMessagingProduct(String messagingProduct) {
        this.messagingProduct = messagingProduct;
    }

    public WhatsappBusinessProfileUpdateParam messagingProduct(String messagingProduct) {
        this.messagingProduct = messagingProduct;
        return this;
    }

    public String getAbout() {
        return about;
    }

    public void setAbout(String about) {
        this.about = about;
    }

    public WhatsappBusinessProfileUpdateParam about(String about) {
        this.about = about;
        return this;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public WhatsappBusinessProfileUpdateParam address(String address) {
        this.address = address;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public WhatsappBusinessProfileUpdateParam description(String description) {
        this.description = description;
        return this;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public WhatsappBusinessProfileUpdateParam email(String email) {
        this.email = email;
        return this;
    }

    public WhatsappBusinessVertical getVertical() {
        return vertical;
    }

    public void setVertical(WhatsappBusinessVertical vertical) {
        this.vertical = vertical;
    }

    public WhatsappBusinessProfileUpdateParam vertical(WhatsappBusinessVertical vertical) {
        this.vertical = vertical;
        return this;
    }

    public List<String> getWebsites() {
        return websites;
    }

    public void setWebsites(List<String> websites) {
        this.websites = websites;
    }

    public WhatsappBusinessProfileUpdateParam websites(List<String> websites) {
        this.websites = websites;
        return this;
    }

    public String getProfilePictureHandle() {
        return profilePictureHandle;
    }

    public void setProfilePictureHandle(String profilePictureHandle) {
        this.profilePictureHandle = profilePictureHandle;
    }

    public WhatsappBusinessProfileUpdateParam profilePictureHandle(String profilePictureHandle) {
        this.profilePictureHandle = profilePictureHandle;
        return this;
    }
}
