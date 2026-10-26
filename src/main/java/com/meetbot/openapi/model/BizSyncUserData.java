package com.meetbot.openapi.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * 用户（客户）主数据快照，用于用户索引与事件中的买家信息。
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class BizSyncUserData {

    /**
     * 外部用户唯一 ID，在本渠道内全局唯一，作为用户同步与事件关联的主键；建议使用源系统数字 ID 的字符串形式。
     * Required.
     */
    private String id;

    /**
     * 该用户记录在源系统中的最后变更时间（毫秒）。每次更新须单调递增，用于接收端防乱序丢弃旧数据。
     * Required.
     */
    private Long updateTime;

    /**
     * 用户手机号，建议含国际区号（如 +8613900000000）。用于联系信息收集、短信触达及手机号类策略条件。
     */
    private String mobile;

    /**
     * 用户电子邮箱地址，用于邮件触达与用户画像。
     */
    private String userEmail;

    /**
     * 用户名字（名），与 userLastName 组合用于内容变量「订单买家姓名」。
     */
    private String userFirstName;

    /**
     * 用户姓氏（姓）。
     */
    private String userLastName;

    private String country;

    /**
     * 用户所在城市。
     */
    private String city;

    /**
     * 用户所属公司或组织名称，B2B 场景常用。
     */
    private String company;

    /**
     * 用户在源系统中的首次创建时间（毫秒），可选。
     */
    private Long createTime;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public BizSyncUserData id(String id) {
        this.id = id;
        return this;
    }

    public Long getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Long updateTime) {
        this.updateTime = updateTime;
    }

    public BizSyncUserData updateTime(Long updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public BizSyncUserData mobile(String mobile) {
        this.mobile = mobile;
        return this;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public BizSyncUserData userEmail(String userEmail) {
        this.userEmail = userEmail;
        return this;
    }

    public String getUserFirstName() {
        return userFirstName;
    }

    public void setUserFirstName(String userFirstName) {
        this.userFirstName = userFirstName;
    }

    public BizSyncUserData userFirstName(String userFirstName) {
        this.userFirstName = userFirstName;
        return this;
    }

    public String getUserLastName() {
        return userLastName;
    }

    public void setUserLastName(String userLastName) {
        this.userLastName = userLastName;
    }

    public BizSyncUserData userLastName(String userLastName) {
        this.userLastName = userLastName;
        return this;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public BizSyncUserData country(String country) {
        this.country = country;
        return this;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public BizSyncUserData city(String city) {
        this.city = city;
        return this;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public BizSyncUserData company(String company) {
        this.company = company;
        return this;
    }

    public Long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }

    public BizSyncUserData createTime(Long createTime) {
        this.createTime = createTime;
        return this;
    }

}
