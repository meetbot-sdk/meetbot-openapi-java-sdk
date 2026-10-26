package com.meetbot.openapi.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class CatalogDeleteOpenRequest {

    /**
     * Catalog ID
     * Required.
     */
    private String catalogId;

    public String getCatalogId() {
        return catalogId;
    }

    public void setCatalogId(String catalogId) {
        this.catalogId = catalogId;
    }

    public CatalogDeleteOpenRequest catalogId(String catalogId) {
        this.catalogId = catalogId;
        return this;
    }

}
