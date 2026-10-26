package com.meetbot.openapi.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;
import java.util.List;

/**
 * Meta Conversions API {@code custom_data}。
 *
 * @see <a href="https://developers.facebook.com/documentation/marketing-api/conversions-api">Conversions API</a>
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class ConversionCustomData extends ExtensibleDto {

    private BigDecimal value;
    private String currency;

    @JsonProperty("content_name")
    private String contentName;

    @JsonProperty("content_category")
    private String contentCategory;

    @JsonProperty("content_ids")
    private List<String> contentIds;

    @JsonProperty("num_items")
    private Integer numItems;

    @JsonProperty("order_id")
    private String orderId;

    @JsonProperty("search_string")
    private String searchString;

    private String status;

    public BigDecimal getValue() {
        return value;
    }

    public void setValue(BigDecimal value) {
        this.value = value;
    }

    public ConversionCustomData value(BigDecimal value) {
        this.value = value;
        return this;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public ConversionCustomData currency(String currency) {
        this.currency = currency;
        return this;
    }

    public String getContentName() {
        return contentName;
    }

    public void setContentName(String contentName) {
        this.contentName = contentName;
    }

    public ConversionCustomData contentName(String contentName) {
        this.contentName = contentName;
        return this;
    }

    public String getContentCategory() {
        return contentCategory;
    }

    public void setContentCategory(String contentCategory) {
        this.contentCategory = contentCategory;
    }

    public ConversionCustomData contentCategory(String contentCategory) {
        this.contentCategory = contentCategory;
        return this;
    }

    public List<String> getContentIds() {
        return contentIds;
    }

    public void setContentIds(List<String> contentIds) {
        this.contentIds = contentIds;
    }

    public ConversionCustomData contentIds(List<String> contentIds) {
        this.contentIds = contentIds;
        return this;
    }

    public Integer getNumItems() {
        return numItems;
    }

    public void setNumItems(Integer numItems) {
        this.numItems = numItems;
    }

    public ConversionCustomData numItems(Integer numItems) {
        this.numItems = numItems;
        return this;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public ConversionCustomData orderId(String orderId) {
        this.orderId = orderId;
        return this;
    }

    public String getSearchString() {
        return searchString;
    }

    public void setSearchString(String searchString) {
        this.searchString = searchString;
    }

    public ConversionCustomData searchString(String searchString) {
        this.searchString = searchString;
        return this;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public ConversionCustomData status(String status) {
        this.status = status;
        return this;
    }
}
