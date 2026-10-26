package com.meetbot.openapi.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * 查询模板详情结果；保留 Meta 扩展字段。
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class WhatsappTemplateDetailsResult extends ExtensibleDto {

    /**
     * id
     */
    private String id;

    /**
     * name
     */
    private String name;

    /**
     * status
     */
    private String status;

    /**
     * category
     */
    private String category;

    /**
     * language
     */
    private String language;

    /**
     * components
     */
    private java.util.List<com.fasterxml.jackson.databind.JsonNode> components;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public WhatsappTemplateDetailsResult id(String id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public WhatsappTemplateDetailsResult name(String name) {
        this.name = name;
        return this;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public WhatsappTemplateDetailsResult status(String status) {
        this.status = status;
        return this;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public WhatsappTemplateDetailsResult category(String category) {
        this.category = category;
        return this;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public WhatsappTemplateDetailsResult language(String language) {
        this.language = language;
        return this;
    }

    public java.util.List<com.fasterxml.jackson.databind.JsonNode> getComponents() {
        return components;
    }

    public void setComponents(java.util.List<com.fasterxml.jackson.databind.JsonNode> components) {
        this.components = components;
    }

    public WhatsappTemplateDetailsResult components(java.util.List<com.fasterxml.jackson.databind.JsonNode> components) {
        this.components = components;
        return this;
    }
}
