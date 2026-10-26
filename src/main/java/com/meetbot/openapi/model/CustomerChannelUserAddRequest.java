package com.meetbot.openapi.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class CustomerChannelUserAddRequest {

    /**
     * c端用户手机号
     * Required.
     */
    private String userMobile;

    /**
     * b端商户手机号
     */
    private String whatsappMobile;

    /**
     * 自有系统的用户id
     */
    private String userId;

    /**
     * 标签信息
     */
    private java.util.List<CustomerChannelUserAddTagRequest> tags;

    public String getUserMobile() {
        return userMobile;
    }

    public void setUserMobile(String userMobile) {
        this.userMobile = userMobile;
    }

    public CustomerChannelUserAddRequest userMobile(String userMobile) {
        this.userMobile = userMobile;
        return this;
    }

    public String getWhatsappMobile() {
        return whatsappMobile;
    }

    public void setWhatsappMobile(String whatsappMobile) {
        this.whatsappMobile = whatsappMobile;
    }

    public CustomerChannelUserAddRequest whatsappMobile(String whatsappMobile) {
        this.whatsappMobile = whatsappMobile;
        return this;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public CustomerChannelUserAddRequest userId(String userId) {
        this.userId = userId;
        return this;
    }

    public java.util.List<CustomerChannelUserAddTagRequest> getTags() {
        return tags;
    }

    public void setTags(java.util.List<CustomerChannelUserAddTagRequest> tags) {
        this.tags = tags;
    }

    public CustomerChannelUserAddRequest tags(java.util.List<CustomerChannelUserAddTagRequest> tags) {
        this.tags = tags;
        return this;
    }

}
