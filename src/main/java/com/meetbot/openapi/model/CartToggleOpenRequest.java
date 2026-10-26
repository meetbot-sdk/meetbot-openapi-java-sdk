package com.meetbot.openapi.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class CartToggleOpenRequest {

    /**
     * Meta 手机号 ID
     * Required.
     */
    private String phoneNumberId;

    /**
     * 是否开启购物车
     * Required.
     */
    private Boolean enabled;

    public String getPhoneNumberId() {
        return phoneNumberId;
    }

    public void setPhoneNumberId(String phoneNumberId) {
        this.phoneNumberId = phoneNumberId;
    }

    public CartToggleOpenRequest phoneNumberId(String phoneNumberId) {
        this.phoneNumberId = phoneNumberId;
        return this;
    }

    public Boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    public CartToggleOpenRequest enabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

}
