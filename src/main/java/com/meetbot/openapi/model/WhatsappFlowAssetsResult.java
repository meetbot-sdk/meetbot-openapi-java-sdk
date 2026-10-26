package com.meetbot.openapi.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

/**
 * Flow 附加资产列表响应。
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class WhatsappFlowAssetsResult extends ExtensibleDto {

    private List<WhatsappFlowAssetItem> data;
    private MetaPaging paging;

    public List<WhatsappFlowAssetItem> getData() {
        return data;
    }

    public void setData(List<WhatsappFlowAssetItem> data) {
        this.data = data;
    }

    public MetaPaging getPaging() {
        return paging;
    }

    public void setPaging(MetaPaging paging) {
        this.paging = paging;
    }
}
