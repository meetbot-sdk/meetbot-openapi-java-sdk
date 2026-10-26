package com.meetbot.openapi.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

/**
 * WhatsApp 账号信息和状态查询响应。
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class WhatsappPhoneNumbersResult extends ExtensibleDto {

    private List<WhatsappPhoneNumberItem> data;
    private MetaPaging paging;

    public List<WhatsappPhoneNumberItem> getData() {
        return data;
    }

    public void setData(List<WhatsappPhoneNumberItem> data) {
        this.data = data;
    }

    public MetaPaging getPaging() {
        return paging;
    }

    public void setPaging(MetaPaging paging) {
        this.paging = paging;
    }
}
