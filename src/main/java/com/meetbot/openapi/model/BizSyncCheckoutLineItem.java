package com.meetbot.openapi.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * 购物车或结算页中的单行商品快照。
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class BizSyncCheckoutLineItem {

    /**
     * 商品 ID，必填。用于弃购/结算扫描中的商品条件匹配及 queryProductInfoByProductIds 详情查询。
     */
    private String productId;

    /**
     * 商品展示名称，用于内容变量「订单商品&数量」；有 title 时优先展示，否则回退为 sku。
     */
    private String title;

    /**
     * SKU 编码。
     */
    private String sku;

    /**
     * 加购或结算中的商品件数。
     */
    private Long num;

    /**
     * 商品单价。
     */
    private java.math.BigDecimal price;

    /**
     * 单价币种。
     */
    private String currency;

    /**
     * 商品主图 URL（外链）。接收后会异步拉取并替换为内部 storageKey，供消息内容中的图片占位符引用。
     */
    private String img;

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public BizSyncCheckoutLineItem productId(String productId) {
        this.productId = productId;
        return this;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public BizSyncCheckoutLineItem title(String title) {
        this.title = title;
        return this;
    }

    public String getSku() {
        return sku;
    }

    public void setSku(String sku) {
        this.sku = sku;
    }

    public BizSyncCheckoutLineItem sku(String sku) {
        this.sku = sku;
        return this;
    }

    public Long getNum() {
        return num;
    }

    public void setNum(Long num) {
        this.num = num;
    }

    public BizSyncCheckoutLineItem num(Long num) {
        this.num = num;
        return this;
    }

    public java.math.BigDecimal getPrice() {
        return price;
    }

    public void setPrice(java.math.BigDecimal price) {
        this.price = price;
    }

    public BizSyncCheckoutLineItem price(java.math.BigDecimal price) {
        this.price = price;
        return this;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public BizSyncCheckoutLineItem currency(String currency) {
        this.currency = currency;
        return this;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public BizSyncCheckoutLineItem img(String img) {
        this.img = img;
        return this;
    }

}
