package com.meetbot.openapi.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * 查询模板组列表结果；保留 Meta 扩展字段。
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class WhatsappTemplateGroupListResult extends ExtensibleDto {

    /**
     * data
     */
    private java.util.List<WhatsappTemplateGroupListResultDataItem> data;

    /**
     * paging
     */
    private WhatsappTemplateGroupListResultPaging paging;

    public java.util.List<WhatsappTemplateGroupListResultDataItem> getData() {
        return data;
    }

    public void setData(java.util.List<WhatsappTemplateGroupListResultDataItem> data) {
        this.data = data;
    }

    public WhatsappTemplateGroupListResult data(java.util.List<WhatsappTemplateGroupListResultDataItem> data) {
        this.data = data;
        return this;
    }

    public WhatsappTemplateGroupListResultPaging getPaging() {
        return paging;
    }

    public void setPaging(WhatsappTemplateGroupListResultPaging paging) {
        this.paging = paging;
    }

    public WhatsappTemplateGroupListResult paging(WhatsappTemplateGroupListResultPaging paging) {
        this.paging = paging;
        return this;
    }
}
