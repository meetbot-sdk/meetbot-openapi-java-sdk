package com.meetbot.openapi.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * 结账/加购场景的商品与链接快照。适用 eventType：CHECKOUT_STARTED、PRODUCT_ADDED_TO_CART。
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class BizSyncCheckoutCommodity {

    /**
     * 恢复结账或购物车页面的 URL，用于内容变量「结算页链接」。
     */
    private String checkoutUrl;

    /**
     * 结算 token，用于 CHECKOUT 事件去重。
     */
    private String checkoutToken;

    /**
     * 结算金额，用于转化回传。
     */
    private java.math.BigDecimal totalPrice;

    /**
     * 币种。
     */
    private String currencyCode;

    private java.util.List<BizSyncCheckoutLineItem> lineItems;

    public String getCheckoutUrl() {
        return checkoutUrl;
    }

    public void setCheckoutUrl(String checkoutUrl) {
        this.checkoutUrl = checkoutUrl;
    }

    public BizSyncCheckoutCommodity checkoutUrl(String checkoutUrl) {
        this.checkoutUrl = checkoutUrl;
        return this;
    }

    public String getCheckoutToken() {
        return checkoutToken;
    }

    public void setCheckoutToken(String checkoutToken) {
        this.checkoutToken = checkoutToken;
    }

    public BizSyncCheckoutCommodity checkoutToken(String checkoutToken) {
        this.checkoutToken = checkoutToken;
        return this;
    }

    public java.math.BigDecimal getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(java.math.BigDecimal totalPrice) {
        this.totalPrice = totalPrice;
    }

    public BizSyncCheckoutCommodity totalPrice(java.math.BigDecimal totalPrice) {
        this.totalPrice = totalPrice;
        return this;
    }

    public String getCurrencyCode() {
        return currencyCode;
    }

    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }

    public BizSyncCheckoutCommodity currencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
        return this;
    }

    public java.util.List<BizSyncCheckoutLineItem> getLineItems() {
        return lineItems;
    }

    public void setLineItems(java.util.List<BizSyncCheckoutLineItem> lineItems) {
        this.lineItems = lineItems;
    }

    public BizSyncCheckoutCommodity lineItems(java.util.List<BizSyncCheckoutLineItem> lineItems) {
        this.lineItems = lineItems;
        return this;
    }

}
