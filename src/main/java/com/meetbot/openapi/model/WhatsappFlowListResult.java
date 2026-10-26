package com.meetbot.openapi.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

/**
 * Flow 列表响应。
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class WhatsappFlowListResult extends ExtensibleDto {

    private List<WhatsappFlowItem> data;
    private MetaPaging paging;

    public List<WhatsappFlowItem> getData() {
        return data;
    }

    public void setData(List<WhatsappFlowItem> data) {
        this.data = data;
    }

    public MetaPaging getPaging() {
        return paging;
    }

    public void setPaging(MetaPaging paging) {
        this.paging = paging;
    }
}
