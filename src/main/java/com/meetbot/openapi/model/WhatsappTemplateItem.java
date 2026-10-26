package com.meetbot.openapi.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * 模板查询列表中的单条模板。
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class WhatsappTemplateItem extends ExtensibleDto {

    private String id;
    private String name;
    private String language;
    private String category;
    private String status;

    @JsonProperty("parameter_format")
    private String parameterFormat;

    private List<WhatsappTemplateComponent> components;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getParameterFormat() {
        return parameterFormat;
    }

    public void setParameterFormat(String parameterFormat) {
        this.parameterFormat = parameterFormat;
    }

    public List<WhatsappTemplateComponent> getComponents() {
        return components;
    }

    public void setComponents(List<WhatsappTemplateComponent> components) {
        this.components = components;
    }
}
