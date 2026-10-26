package com.meetbot.openapi.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class CustomerConsultantAllocationAddUserRequest {

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
     * 专属客户登陆账号（Meetbot登陆账号邮箱或手机号）
     * Required.
     */
    private String allocationUser;

    /**
     * 个人标签
     * Required.
     */
    private java.util.List<String> labelList;

    public String getUserMobile() {
        return userMobile;
    }

    public void setUserMobile(String userMobile) {
        this.userMobile = userMobile;
    }

    public CustomerConsultantAllocationAddUserRequest userMobile(String userMobile) {
        this.userMobile = userMobile;
        return this;
    }

    public String getWhatsappMobile() {
        return whatsappMobile;
    }

    public void setWhatsappMobile(String whatsappMobile) {
        this.whatsappMobile = whatsappMobile;
    }

    public CustomerConsultantAllocationAddUserRequest whatsappMobile(String whatsappMobile) {
        this.whatsappMobile = whatsappMobile;
        return this;
    }

    public String getAllocationUser() {
        return allocationUser;
    }

    public void setAllocationUser(String allocationUser) {
        this.allocationUser = allocationUser;
    }

    public CustomerConsultantAllocationAddUserRequest allocationUser(String allocationUser) {
        this.allocationUser = allocationUser;
        return this;
    }

    public java.util.List<String> getLabelList() {
        return labelList;
    }

    public void setLabelList(java.util.List<String> labelList) {
        this.labelList = labelList;
    }

    public CustomerConsultantAllocationAddUserRequest labelList(java.util.List<String> labelList) {
        this.labelList = labelList;
        return this;
    }

}
