package com.meetbot.openapi.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * 邮寄/收货地址，用于订单配送、国家类策略条件及内容变量（收件人姓名、收件地址、收件邮编等）。
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class BizSyncShippingAddress {

    /**
     * 收件人名（Given name）；与 lastName 组合用于内容变量「收件人姓名」。
     */
    private String firstName;

    /**
     * 收件人姓（Family name）。
     */
    private String lastName;

    /**
     * 收件人全名；若同时传 firstName/lastName，展示时通常优先拼接姓名。
     */
    private String name;

    /**
     * 街道地址第一行，通常为门牌号与街道名；参与内容变量「收件地址」拼接。
     */
    private String address1;

    /**
     * 街道地址第二行，如单元号、楼层、补充说明等，可为空；参与内容变量「收件地址」拼接。
     */
    private String address2;

    /**
     * 城市或 locality 名称；参与内容变量「收件地址」拼接。
     */
    private String city;

    /**
     * 省/州/地区名称（如 California、广东省）；参与内容变量「收件地址」拼接。
     */
    private String province;

    /**
     * 邮政编码或 ZIP code，用于内容变量「收件邮编」。
     */
    private String zip;

    private String country;

    /**
     * 收货手机号，用于内容变量「收件人电话」。建议含国际区号。
     */
    private String phone;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public BizSyncShippingAddress firstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public BizSyncShippingAddress lastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BizSyncShippingAddress name(String name) {
        this.name = name;
        return this;
    }

    public String getAddress1() {
        return address1;
    }

    public void setAddress1(String address1) {
        this.address1 = address1;
    }

    public BizSyncShippingAddress address1(String address1) {
        this.address1 = address1;
        return this;
    }

    public String getAddress2() {
        return address2;
    }

    public void setAddress2(String address2) {
        this.address2 = address2;
    }

    public BizSyncShippingAddress address2(String address2) {
        this.address2 = address2;
        return this;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public BizSyncShippingAddress city(String city) {
        this.city = city;
        return this;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public BizSyncShippingAddress province(String province) {
        this.province = province;
        return this;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public BizSyncShippingAddress zip(String zip) {
        this.zip = zip;
        return this;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public BizSyncShippingAddress country(String country) {
        this.country = country;
        return this;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public BizSyncShippingAddress phone(String phone) {
        this.phone = phone;
        return this;
    }

}
