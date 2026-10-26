package com.meetbot.openapi.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class CatalogItemDTO {

    /**
     * Catalog ID
     */
    private String catalogId;

    /**
     * Catalog 名称
     */
    private String catalogName;

    /**
     * 绑定的 WABA ID；未绑定时为空字符串
     */
    private String boundWabaId;

    /**
     * 绑定的 WABA 名称；未绑定时为空字符串
     */
    private String boundWabaName;

    /**
     * 是否可用（未删除时为 true）
     */
    private Boolean availability;

    public String getCatalogId() {
        return catalogId;
    }

    public void setCatalogId(String catalogId) {
        this.catalogId = catalogId;
    }

    public CatalogItemDTO catalogId(String catalogId) {
        this.catalogId = catalogId;
        return this;
    }

    public String getCatalogName() {
        return catalogName;
    }

    public void setCatalogName(String catalogName) {
        this.catalogName = catalogName;
    }

    public CatalogItemDTO catalogName(String catalogName) {
        this.catalogName = catalogName;
        return this;
    }

    public String getBoundWabaId() {
        return boundWabaId;
    }

    public void setBoundWabaId(String boundWabaId) {
        this.boundWabaId = boundWabaId;
    }

    public CatalogItemDTO boundWabaId(String boundWabaId) {
        this.boundWabaId = boundWabaId;
        return this;
    }

    public String getBoundWabaName() {
        return boundWabaName;
    }

    public void setBoundWabaName(String boundWabaName) {
        this.boundWabaName = boundWabaName;
    }

    public CatalogItemDTO boundWabaName(String boundWabaName) {
        this.boundWabaName = boundWabaName;
        return this;
    }

    public Boolean getAvailability() {
        return availability;
    }

    public void setAvailability(Boolean availability) {
        this.availability = availability;
    }

    public CatalogItemDTO availability(Boolean availability) {
        this.availability = availability;
        return this;
    }

}
