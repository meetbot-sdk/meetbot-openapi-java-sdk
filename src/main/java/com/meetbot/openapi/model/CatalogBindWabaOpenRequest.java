package com.meetbot.openapi.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class CatalogBindWabaOpenRequest {

    /**
     * WABA ID
     * Required.
     */
    private String whatsappBusinessAccountId;

    /**
     * Catalog ID
     * Required.
     */
    private String catalogId;

    public String getWhatsappBusinessAccountId() {
        return whatsappBusinessAccountId;
    }

    public void setWhatsappBusinessAccountId(String whatsappBusinessAccountId) {
        this.whatsappBusinessAccountId = whatsappBusinessAccountId;
    }

    public CatalogBindWabaOpenRequest whatsappBusinessAccountId(String whatsappBusinessAccountId) {
        this.whatsappBusinessAccountId = whatsappBusinessAccountId;
        return this;
    }

    public String getCatalogId() {
        return catalogId;
    }

    public void setCatalogId(String catalogId) {
        this.catalogId = catalogId;
    }

    public CatalogBindWabaOpenRequest catalogId(String catalogId) {
        this.catalogId = catalogId;
        return this;
    }

}
