package com.meetbot.openapi.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

/**
 * WhatsApp 账号详情响应。
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class WhatsappAccountProfileResult extends ExtensibleDto {

    private List<WhatsappBusinessProfileItem> data;

    public List<WhatsappBusinessProfileItem> getData() {
        return data;
    }

    public void setData(List<WhatsappBusinessProfileItem> data) {
        this.data = data;
    }
}
