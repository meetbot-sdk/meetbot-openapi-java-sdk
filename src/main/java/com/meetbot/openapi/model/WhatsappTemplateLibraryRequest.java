package com.meetbot.openapi.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * 查询模板库查询条件
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class WhatsappTemplateLibraryRequest {

    /**
     * 模板类别
     */
    private String category;

    /**
     * 搜索关键字
     */
    private String search;

    /**
     * 主题
     */
    private String topic;

    /**
     * Meta 模板库支持的使用场景枚举
     */
    private String usecase;

    /**
     * 行业
     */
    private String industry;

    /**
     * 语言代码
     */
    private String language;

    /**
     * 模板名称
     */
    private String name;

    /**
     * 每页返回数量
     */
    private Long limit;

    /**
     * 下一页游标，使用上次响应 paging.cursors.after 的值
     */
    private String after;

    /**
     * 上一页游标，使用响应 paging.cursors.before 的值
     */
    private String before;

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public WhatsappTemplateLibraryRequest category(String category) {
        this.category = category;
        return this;
    }

    public String getSearch() {
        return search;
    }

    public void setSearch(String search) {
        this.search = search;
    }

    public WhatsappTemplateLibraryRequest search(String search) {
        this.search = search;
        return this;
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public WhatsappTemplateLibraryRequest topic(String topic) {
        this.topic = topic;
        return this;
    }

    public String getUsecase() {
        return usecase;
    }

    public void setUsecase(String usecase) {
        this.usecase = usecase;
    }

    public WhatsappTemplateLibraryRequest usecase(String usecase) {
        this.usecase = usecase;
        return this;
    }

    public String getIndustry() {
        return industry;
    }

    public void setIndustry(String industry) {
        this.industry = industry;
    }

    public WhatsappTemplateLibraryRequest industry(String industry) {
        this.industry = industry;
        return this;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public WhatsappTemplateLibraryRequest language(String language) {
        this.language = language;
        return this;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public WhatsappTemplateLibraryRequest name(String name) {
        this.name = name;
        return this;
    }

    public Long getLimit() {
        return limit;
    }

    public void setLimit(Long limit) {
        this.limit = limit;
    }

    public WhatsappTemplateLibraryRequest limit(Long limit) {
        this.limit = limit;
        return this;
    }

    public String getAfter() {
        return after;
    }

    public void setAfter(String after) {
        this.after = after;
    }

    public WhatsappTemplateLibraryRequest after(String after) {
        this.after = after;
        return this;
    }

    public String getBefore() {
        return before;
    }

    public void setBefore(String before) {
        this.before = before;
    }

    public WhatsappTemplateLibraryRequest before(String before) {
        this.before = before;
        return this;
    }
}
