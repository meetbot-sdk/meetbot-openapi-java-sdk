package com.meetbot.openapi.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class CatalogListOpenRequest {

    /**
     * BM ID（Meta Business Manager ID）
     * Required.
     */
    private String businessId;

    public String getBusinessId() {
        return businessId;
    }

    public void setBusinessId(String businessId) {
        this.businessId = businessId;
    }

    public CatalogListOpenRequest businessId(String businessId) {
        this.businessId = businessId;
        return this;
    }

}
