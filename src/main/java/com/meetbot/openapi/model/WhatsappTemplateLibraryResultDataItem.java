package com.meetbot.openapi.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * WhatsappTemplateLibraryResultDataItem
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class WhatsappTemplateLibraryResultDataItem extends ExtensibleDto {

    /**
     * name
     */
    private String name;

    /**
     * language
     */
    private String language;

    /**
     * category
     */
    private String category;

    /**
     * topic
     */
    private String topic;

    /**
     * usecase
     */
    private String usecase;

    /**
     * industry
     */
    private java.util.List<String> industry;

    /**
     * components
     */
    private java.util.List<com.fasterxml.jackson.databind.JsonNode> components;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public WhatsappTemplateLibraryResultDataItem name(String name) {
        this.name = name;
        return this;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public WhatsappTemplateLibraryResultDataItem language(String language) {
        this.language = language;
        return this;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public WhatsappTemplateLibraryResultDataItem category(String category) {
        this.category = category;
        return this;
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public WhatsappTemplateLibraryResultDataItem topic(String topic) {
        this.topic = topic;
        return this;
    }

    public String getUsecase() {
        return usecase;
    }

    public void setUsecase(String usecase) {
        this.usecase = usecase;
    }

    public WhatsappTemplateLibraryResultDataItem usecase(String usecase) {
        this.usecase = usecase;
        return this;
    }

    public java.util.List<String> getIndustry() {
        return industry;
    }

    public void setIndustry(java.util.List<String> industry) {
        this.industry = industry;
    }

    public WhatsappTemplateLibraryResultDataItem industry(java.util.List<String> industry) {
        this.industry = industry;
        return this;
    }

    public java.util.List<com.fasterxml.jackson.databind.JsonNode> getComponents() {
        return components;
    }

    public void setComponents(java.util.List<com.fasterxml.jackson.databind.JsonNode> components) {
        this.components = components;
    }

    public WhatsappTemplateLibraryResultDataItem components(java.util.List<com.fasterxml.jackson.databind.JsonNode> components) {
        this.components = components;
        return this;
    }
}
