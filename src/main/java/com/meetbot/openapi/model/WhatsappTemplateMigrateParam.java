package com.meetbot.openapi.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * WhatsappTemplateMigrateParam
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class WhatsappTemplateMigrateParam {

    /**
     * 源 WhatsApp 业务账号 ID
     * Required.
     */
    @JsonProperty("source_waba_id")
    private String sourceWabaId;

    /**
     * 分页页码
     */
    @JsonProperty("page_number")
    private Long pageNumber;

    /**
     * 每页迁移数量
     */
    private Long count;

    /**
     * 指定迁移的模板 ID
     */
    @JsonProperty("template_ids")
    private java.util.List<String> templateIds;

    public String getSourceWabaId() {
        return sourceWabaId;
    }

    public void setSourceWabaId(String sourceWabaId) {
        this.sourceWabaId = sourceWabaId;
    }

    public WhatsappTemplateMigrateParam sourceWabaId(String sourceWabaId) {
        this.sourceWabaId = sourceWabaId;
        return this;
    }

    public Long getPageNumber() {
        return pageNumber;
    }

    public void setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
    }

    public WhatsappTemplateMigrateParam pageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }

    public Long getCount() {
        return count;
    }

    public void setCount(Long count) {
        this.count = count;
    }

    public WhatsappTemplateMigrateParam count(Long count) {
        this.count = count;
        return this;
    }

    public java.util.List<String> getTemplateIds() {
        return templateIds;
    }

    public void setTemplateIds(java.util.List<String> templateIds) {
        this.templateIds = templateIds;
    }

    public WhatsappTemplateMigrateParam templateIds(java.util.List<String> templateIds) {
        this.templateIds = templateIds;
        return this;
    }
}
