package com.meetbot.openapi.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * 一次或多次发货/配送的物流与商品行快照。适用 eventType：ORDER_FULFILLED、DELIVERED。
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class BizSyncFulfillmentSnapshot {

    /**
     * 承运商名称，用于内容变量「物流承运商」。
     */
    private String trackingCompany;

    /**
     * 主物流追踪单号。
     */
    private String trackingNumber;

    /**
     * 多个追踪单号列表，用于内容变量「物流编号」。
     */
    private java.util.List<String> trackingNumbers;

    /**
     * 物流轨迹查询 URL，用于内容变量「物流详情链接」。
     */
    private String trackingUrl;

    /**
     * 本次履约涉及的商品行；productId 必填，title/sku/num 用于内容变量「履约商品数量」「订单商品&数量」（title 优先于 sku）。
     */
    private java.util.List<BizSyncSkuItem> lineItems;

    public String getTrackingCompany() {
        return trackingCompany;
    }

    public void setTrackingCompany(String trackingCompany) {
        this.trackingCompany = trackingCompany;
    }

    public BizSyncFulfillmentSnapshot trackingCompany(String trackingCompany) {
        this.trackingCompany = trackingCompany;
        return this;
    }

    public String getTrackingNumber() {
        return trackingNumber;
    }

    public void setTrackingNumber(String trackingNumber) {
        this.trackingNumber = trackingNumber;
    }

    public BizSyncFulfillmentSnapshot trackingNumber(String trackingNumber) {
        this.trackingNumber = trackingNumber;
        return this;
    }

    public java.util.List<String> getTrackingNumbers() {
        return trackingNumbers;
    }

    public void setTrackingNumbers(java.util.List<String> trackingNumbers) {
        this.trackingNumbers = trackingNumbers;
    }

    public BizSyncFulfillmentSnapshot trackingNumbers(java.util.List<String> trackingNumbers) {
        this.trackingNumbers = trackingNumbers;
        return this;
    }

    public String getTrackingUrl() {
        return trackingUrl;
    }

    public void setTrackingUrl(String trackingUrl) {
        this.trackingUrl = trackingUrl;
    }

    public BizSyncFulfillmentSnapshot trackingUrl(String trackingUrl) {
        this.trackingUrl = trackingUrl;
        return this;
    }

    public java.util.List<BizSyncSkuItem> getLineItems() {
        return lineItems;
    }

    public void setLineItems(java.util.List<BizSyncSkuItem> lineItems) {
        this.lineItems = lineItems;
    }

    public BizSyncFulfillmentSnapshot lineItems(java.util.List<BizSyncSkuItem> lineItems) {
        this.lineItems = lineItems;
        return this;
    }

}
