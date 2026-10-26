package com.meetbot.openapi.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ProductDetailOpenRequest {

    /**
     * Catalog ID
     * Required.
     */
    private String catalogId;

    /**
     * Meetbot 侧业务唯一 ID
     * Required.
     */
    private String retailerId;

    public String getCatalogId() {
        return catalogId;
    }

    public void setCatalogId(String catalogId) {
        this.catalogId = catalogId;
    }

    public ProductDetailOpenRequest catalogId(String catalogId) {
        this.catalogId = catalogId;
        return this;
    }

    public String getRetailerId() {
        return retailerId;
    }

    public void setRetailerId(String retailerId) {
        this.retailerId = retailerId;
    }

    public ProductDetailOpenRequest retailerId(String retailerId) {
        this.retailerId = retailerId;
        return this;
    }

}
