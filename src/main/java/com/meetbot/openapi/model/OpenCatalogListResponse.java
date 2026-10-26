package com.meetbot.openapi.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class OpenCatalogListResponse {

    /**
     * BM ID
     */
    private String businessId;

    /**
     * Catalog 列表
     */
    private java.util.List<CatalogItemDTO> catalogs;

    public String getBusinessId() {
        return businessId;
    }

    public void setBusinessId(String businessId) {
        this.businessId = businessId;
    }

    public OpenCatalogListResponse businessId(String businessId) {
        this.businessId = businessId;
        return this;
    }

    public java.util.List<CatalogItemDTO> getCatalogs() {
        return catalogs;
    }

    public void setCatalogs(java.util.List<CatalogItemDTO> catalogs) {
        this.catalogs = catalogs;
    }

    public OpenCatalogListResponse catalogs(java.util.List<CatalogItemDTO> catalogs) {
        this.catalogs = catalogs;
        return this;
    }

}
