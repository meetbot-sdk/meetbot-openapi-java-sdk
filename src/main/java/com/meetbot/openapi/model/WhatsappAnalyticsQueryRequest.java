package com.meetbot.openapi.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.meetbot.openapi.model.enums.WhatsappAnalyticsField;

/**
 * 查询WhatsApp分析数据查询条件
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class WhatsappAnalyticsQueryRequest {

    /**
     * WhatsApp 业务账号 ID
     * Required.
     */
    private String wabaId;

    /**
     * 分析指标类型，必填
     * Required.
     */
    private WhatsappAnalyticsField field;

    /**
     * 开始时间，Unix 秒
     */
    private Long start;

    /**
     * 结束时间，Unix 秒
     */
    private Long end;

    /**
     * 时间粒度
     */
    private String granularity;

    /**
     * 手机号 ID，多个值用逗号分隔
     */
    private String phoneNumbers;

    /**
     * 国家代码，多个值用逗号分隔
     */
    private String countryCodes;

    /**
     * 产品类型，多个值用逗号分隔
     */
    private String productTypes;

    /**
     * 指标类型，多个值用逗号分隔
     */
    private String metricTypes;

    /**
     * 计价类型，多个值用逗号分隔
     */
    private String pricingTypes;

    /**
     * 计价类别，多个值用逗号分隔
     */
    private String pricingCategories;

    /**
     * 维度，多个值用逗号分隔
     */
    private String dimensions;

    /**
     * 会话类别，多个值用逗号分隔
     */
    private String conversationCategories;

    /**
     * 会话类型，多个值用逗号分隔
     */
    private String conversationTypes;

    /**
     * 会话方向，多个值用逗号分隔
     */
    private String conversationDirections;

    /**
     * 方向，多个值用逗号分隔
     */
    private String directions;

    /**
     * 模板 ID，多个值用逗号分隔
     */
    private String templateIds;

    /**
     * 模板组 ID，多个值用逗号分隔
     */
    private String templateGroupIds;

    /**
     * 群组 ID，多个值用逗号分隔
     */
    private String groupIds;

    /**
     * 产品类型
     */
    private String productType;

    /**
     * 是否使用 WABA 时区
     */
    private Boolean useWabaTimezone;

    public String getWabaId() {
        return wabaId;
    }

    public void setWabaId(String wabaId) {
        this.wabaId = wabaId;
    }

    public WhatsappAnalyticsQueryRequest wabaId(String wabaId) {
        this.wabaId = wabaId;
        return this;
    }

    public WhatsappAnalyticsField getField() {
        return field;
    }

    public void setField(WhatsappAnalyticsField field) {
        this.field = field;
    }

    public WhatsappAnalyticsQueryRequest field(WhatsappAnalyticsField field) {
        this.field = field;
        return this;
    }

    public Long getStart() {
        return start;
    }

    public void setStart(Long start) {
        this.start = start;
    }

    public WhatsappAnalyticsQueryRequest start(Long start) {
        this.start = start;
        return this;
    }

    public Long getEnd() {
        return end;
    }

    public void setEnd(Long end) {
        this.end = end;
    }

    public WhatsappAnalyticsQueryRequest end(Long end) {
        this.end = end;
        return this;
    }

    public String getGranularity() {
        return granularity;
    }

    public void setGranularity(String granularity) {
        this.granularity = granularity;
    }

    public WhatsappAnalyticsQueryRequest granularity(String granularity) {
        this.granularity = granularity;
        return this;
    }

    public String getPhoneNumbers() {
        return phoneNumbers;
    }

    public void setPhoneNumbers(String phoneNumbers) {
        this.phoneNumbers = phoneNumbers;
    }

    public WhatsappAnalyticsQueryRequest phoneNumbers(String phoneNumbers) {
        this.phoneNumbers = phoneNumbers;
        return this;
    }

    public String getCountryCodes() {
        return countryCodes;
    }

    public void setCountryCodes(String countryCodes) {
        this.countryCodes = countryCodes;
    }

    public WhatsappAnalyticsQueryRequest countryCodes(String countryCodes) {
        this.countryCodes = countryCodes;
        return this;
    }

    public String getProductTypes() {
        return productTypes;
    }

    public void setProductTypes(String productTypes) {
        this.productTypes = productTypes;
    }

    public WhatsappAnalyticsQueryRequest productTypes(String productTypes) {
        this.productTypes = productTypes;
        return this;
    }

    public String getMetricTypes() {
        return metricTypes;
    }

    public void setMetricTypes(String metricTypes) {
        this.metricTypes = metricTypes;
    }

    public WhatsappAnalyticsQueryRequest metricTypes(String metricTypes) {
        this.metricTypes = metricTypes;
        return this;
    }

    public String getPricingTypes() {
        return pricingTypes;
    }

    public void setPricingTypes(String pricingTypes) {
        this.pricingTypes = pricingTypes;
    }

    public WhatsappAnalyticsQueryRequest pricingTypes(String pricingTypes) {
        this.pricingTypes = pricingTypes;
        return this;
    }

    public String getPricingCategories() {
        return pricingCategories;
    }

    public void setPricingCategories(String pricingCategories) {
        this.pricingCategories = pricingCategories;
    }

    public WhatsappAnalyticsQueryRequest pricingCategories(String pricingCategories) {
        this.pricingCategories = pricingCategories;
        return this;
    }

    public String getDimensions() {
        return dimensions;
    }

    public void setDimensions(String dimensions) {
        this.dimensions = dimensions;
    }

    public WhatsappAnalyticsQueryRequest dimensions(String dimensions) {
        this.dimensions = dimensions;
        return this;
    }

    public String getConversationCategories() {
        return conversationCategories;
    }

    public void setConversationCategories(String conversationCategories) {
        this.conversationCategories = conversationCategories;
    }

    public WhatsappAnalyticsQueryRequest conversationCategories(String conversationCategories) {
        this.conversationCategories = conversationCategories;
        return this;
    }

    public String getConversationTypes() {
        return conversationTypes;
    }

    public void setConversationTypes(String conversationTypes) {
        this.conversationTypes = conversationTypes;
    }

    public WhatsappAnalyticsQueryRequest conversationTypes(String conversationTypes) {
        this.conversationTypes = conversationTypes;
        return this;
    }

    public String getConversationDirections() {
        return conversationDirections;
    }

    public void setConversationDirections(String conversationDirections) {
        this.conversationDirections = conversationDirections;
    }

    public WhatsappAnalyticsQueryRequest conversationDirections(String conversationDirections) {
        this.conversationDirections = conversationDirections;
        return this;
    }

    public String getDirections() {
        return directions;
    }

    public void setDirections(String directions) {
        this.directions = directions;
    }

    public WhatsappAnalyticsQueryRequest directions(String directions) {
        this.directions = directions;
        return this;
    }

    public String getTemplateIds() {
        return templateIds;
    }

    public void setTemplateIds(String templateIds) {
        this.templateIds = templateIds;
    }

    public WhatsappAnalyticsQueryRequest templateIds(String templateIds) {
        this.templateIds = templateIds;
        return this;
    }

    public String getTemplateGroupIds() {
        return templateGroupIds;
    }

    public void setTemplateGroupIds(String templateGroupIds) {
        this.templateGroupIds = templateGroupIds;
    }

    public WhatsappAnalyticsQueryRequest templateGroupIds(String templateGroupIds) {
        this.templateGroupIds = templateGroupIds;
        return this;
    }

    public String getGroupIds() {
        return groupIds;
    }

    public void setGroupIds(String groupIds) {
        this.groupIds = groupIds;
    }

    public WhatsappAnalyticsQueryRequest groupIds(String groupIds) {
        this.groupIds = groupIds;
        return this;
    }

    public String getProductType() {
        return productType;
    }

    public void setProductType(String productType) {
        this.productType = productType;
    }

    public WhatsappAnalyticsQueryRequest productType(String productType) {
        this.productType = productType;
        return this;
    }

    public Boolean getUseWabaTimezone() {
        return useWabaTimezone;
    }

    public void setUseWabaTimezone(Boolean useWabaTimezone) {
        this.useWabaTimezone = useWabaTimezone;
    }

    public WhatsappAnalyticsQueryRequest useWabaTimezone(Boolean useWabaTimezone) {
        this.useWabaTimezone = useWabaTimezone;
        return this;
    }
}
