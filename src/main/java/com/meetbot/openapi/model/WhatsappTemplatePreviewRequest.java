package com.meetbot.openapi.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * 预览认证模板查询条件
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class WhatsappTemplatePreviewRequest {

    /**
     * WhatsApp 业务账号 ID
     * Required.
     */
    private String wabaId;

    /**
     * 模板类别
     * Required.
     */
    private String category;

    /**
     * 语言代码，多个值用逗号分隔；不传则返回所有支持的语言
     */
    private String languages;

    /**
     * 是否增加安全建议
     */
    private Boolean addSecurityRecommendation;

    /**
     * 验证码有效分钟数
     */
    private Long codeExpirationMinutes;

    /**
     * 按钮类型，认证模板固定为 OTP
     * Required.
     */
    private String buttonTypes;

    /**
     * 业务名称
     */
    private String businessName;

    public String getWabaId() {
        return wabaId;
    }

    public void setWabaId(String wabaId) {
        this.wabaId = wabaId;
    }

    public WhatsappTemplatePreviewRequest wabaId(String wabaId) {
        this.wabaId = wabaId;
        return this;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public WhatsappTemplatePreviewRequest category(String category) {
        this.category = category;
        return this;
    }

    public String getLanguages() {
        return languages;
    }

    public void setLanguages(String languages) {
        this.languages = languages;
    }

    public WhatsappTemplatePreviewRequest languages(String languages) {
        this.languages = languages;
        return this;
    }

    public Boolean getAddSecurityRecommendation() {
        return addSecurityRecommendation;
    }

    public void setAddSecurityRecommendation(Boolean addSecurityRecommendation) {
        this.addSecurityRecommendation = addSecurityRecommendation;
    }

    public WhatsappTemplatePreviewRequest addSecurityRecommendation(Boolean addSecurityRecommendation) {
        this.addSecurityRecommendation = addSecurityRecommendation;
        return this;
    }

    public Long getCodeExpirationMinutes() {
        return codeExpirationMinutes;
    }

    public void setCodeExpirationMinutes(Long codeExpirationMinutes) {
        this.codeExpirationMinutes = codeExpirationMinutes;
    }

    public WhatsappTemplatePreviewRequest codeExpirationMinutes(Long codeExpirationMinutes) {
        this.codeExpirationMinutes = codeExpirationMinutes;
        return this;
    }

    public String getButtonTypes() {
        return buttonTypes;
    }

    public void setButtonTypes(String buttonTypes) {
        this.buttonTypes = buttonTypes;
    }

    public WhatsappTemplatePreviewRequest buttonTypes(String buttonTypes) {
        this.buttonTypes = buttonTypes;
        return this;
    }

    public String getBusinessName() {
        return businessName;
    }

    public void setBusinessName(String businessName) {
        this.businessName = businessName;
    }

    public WhatsappTemplatePreviewRequest businessName(String businessName) {
        this.businessName = businessName;
        return this;
    }
}
