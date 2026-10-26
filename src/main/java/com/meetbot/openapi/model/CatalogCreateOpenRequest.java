package com.meetbot.openapi.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class CatalogCreateOpenRequest {

    /**
     * BM ID
     * Required.
     */
    private String businessId;

    /**
     * Catalog 名称
     * Required.
     */
    private String catalogName;

    public String getBusinessId() {
        return businessId;
    }

    public void setBusinessId(String businessId) {
        this.businessId = businessId;
    }

    public CatalogCreateOpenRequest businessId(String businessId) {
        this.businessId = businessId;
        return this;
    }

    public String getCatalogName() {
        return catalogName;
    }

    public void setCatalogName(String catalogName) {
        this.catalogName = catalogName;
    }

    public CatalogCreateOpenRequest catalogName(String catalogName) {
        this.catalogName = catalogName;
        return this;
    }

}
