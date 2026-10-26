package com.meetbot.openapi.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * 创建/编辑消息模板时的 example 对象。
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class WhatsappTemplateExample extends ExtensibleDto {

    @JsonProperty("header_text")
    private List<String> headerText;

    @JsonProperty("header_handle")
    private List<String> headerHandle;

    @JsonProperty("body_text")
    private List<List<String>> bodyText;

    @JsonProperty("body_text_named_params")
    private List<WhatsappNamedParamExample> bodyTextNamedParams;

    public List<String> getHeaderText() {
        return headerText;
    }

    public void setHeaderText(List<String> headerText) {
        this.headerText = headerText;
    }

    public WhatsappTemplateExample headerText(List<String> headerText) {
        this.headerText = headerText;
        return this;
    }

    public List<String> getHeaderHandle() {
        return headerHandle;
    }

    public void setHeaderHandle(List<String> headerHandle) {
        this.headerHandle = headerHandle;
    }

    public WhatsappTemplateExample headerHandle(List<String> headerHandle) {
        this.headerHandle = headerHandle;
        return this;
    }

    public List<List<String>> getBodyText() {
        return bodyText;
    }

    public void setBodyText(List<List<String>> bodyText) {
        this.bodyText = bodyText;
    }

    public WhatsappTemplateExample bodyText(List<List<String>> bodyText) {
        this.bodyText = bodyText;
        return this;
    }

    public List<WhatsappNamedParamExample> getBodyTextNamedParams() {
        return bodyTextNamedParams;
    }

    public void setBodyTextNamedParams(List<WhatsappNamedParamExample> bodyTextNamedParams) {
        this.bodyTextNamedParams = bodyTextNamedParams;
    }

    public WhatsappTemplateExample bodyTextNamedParams(List<WhatsappNamedParamExample> bodyTextNamedParams) {
        this.bodyTextNamedParams = bodyTextNamedParams;
        return this;
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class WhatsappNamedParamExample extends ExtensibleDto {
        @JsonProperty("param_name")
        private String paramName;
        private String example;

        public String getParamName() {
            return paramName;
        }

        public void setParamName(String paramName) {
            this.paramName = paramName;
        }

        public WhatsappNamedParamExample paramName(String paramName) {
            this.paramName = paramName;
            return this;
        }

        public String getExample() {
            return example;
        }

        public void setExample(String example) {
            this.example = example;
        }

        public WhatsappNamedParamExample example(String example) {
            this.example = example;
            return this;
        }
    }
}
