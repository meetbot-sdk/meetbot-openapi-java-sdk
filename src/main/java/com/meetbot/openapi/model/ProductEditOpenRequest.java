package com.meetbot.openapi.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.meetbot.openapi.model.enums.ProductAvailability;
import com.meetbot.openapi.model.enums.ProductCondition;
import com.meetbot.openapi.model.enums.ProductType;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ProductEditOpenRequest {

    /**
     * 商品类型：PHYSICAL=实物商品 / VIRTUAL=虚拟商品
     * Required.
     */
    private ProductType productType;

    /**
     * 商品图片 URL
     */
    private String imageUrl;

    /**
     * Meetbot 侧业务唯一 ID
     * Required.
     */
    private String retailerId;

    /**
     * 价格币种
     */
    private String priceCurrency;

    /**
     * 商品描述
     */
    private String description;

    /**
     * 商品名称
     * Required.
     */
    private String title;

    /**
     * 商品价格
     */
    private java.math.BigDecimal priceValue;

    /**
     * 商品品牌
     */
    private String brand;

    /**
     * 商品成色（Meta code）：new=全新 / refurbished=翻新 / used=二手 / used_like_new=二手（几乎全新） / used_good=二手（成色好） / used_fair=二手（成色尚可）
     * Required.
     */
    private ProductCondition productCondition;

    /**
     * Catalog ID
     * Required.
     */
    private String catalogId;

    /**
     * 是否更新 extendFields，默认 false 不更新
     */
    private Boolean updateExtendFields;

    /**
     * 商品介绍链接
     */
    private String link;

    /**
     * 库存状态（Meta code）：in stock=有货 / out of stock=缺货
     * Required.
     */
    private ProductAvailability availability;

    public ProductType getProductType() {
        return productType;
    }

    public void setProductType(ProductType productType) {
        this.productType = productType;
    }

    public ProductEditOpenRequest productType(ProductType productType) {
        this.productType = productType;
        return this;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public ProductEditOpenRequest imageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
        return this;
    }

    public String getRetailerId() {
        return retailerId;
    }

    public void setRetailerId(String retailerId) {
        this.retailerId = retailerId;
    }

    public ProductEditOpenRequest retailerId(String retailerId) {
        this.retailerId = retailerId;
        return this;
    }

    public String getPriceCurrency() {
        return priceCurrency;
    }

    public void setPriceCurrency(String priceCurrency) {
        this.priceCurrency = priceCurrency;
    }

    public ProductEditOpenRequest priceCurrency(String priceCurrency) {
        this.priceCurrency = priceCurrency;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ProductEditOpenRequest description(String description) {
        this.description = description;
        return this;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public ProductEditOpenRequest title(String title) {
        this.title = title;
        return this;
    }

    public java.math.BigDecimal getPriceValue() {
        return priceValue;
    }

    public void setPriceValue(java.math.BigDecimal priceValue) {
        this.priceValue = priceValue;
    }

    public ProductEditOpenRequest priceValue(java.math.BigDecimal priceValue) {
        this.priceValue = priceValue;
        return this;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public ProductEditOpenRequest brand(String brand) {
        this.brand = brand;
        return this;
    }

    public ProductCondition getProductCondition() {
        return productCondition;
    }

    public void setProductCondition(ProductCondition productCondition) {
        this.productCondition = productCondition;
    }

    public ProductEditOpenRequest productCondition(ProductCondition productCondition) {
        this.productCondition = productCondition;
        return this;
    }

    public String getCatalogId() {
        return catalogId;
    }

    public void setCatalogId(String catalogId) {
        this.catalogId = catalogId;
    }

    public ProductEditOpenRequest catalogId(String catalogId) {
        this.catalogId = catalogId;
        return this;
    }

    public Boolean getUpdateExtendFields() {
        return updateExtendFields;
    }

    public void setUpdateExtendFields(Boolean updateExtendFields) {
        this.updateExtendFields = updateExtendFields;
    }

    public ProductEditOpenRequest updateExtendFields(Boolean updateExtendFields) {
        this.updateExtendFields = updateExtendFields;
        return this;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public ProductEditOpenRequest link(String link) {
        this.link = link;
        return this;
    }

    public ProductAvailability getAvailability() {
        return availability;
    }

    public void setAvailability(ProductAvailability availability) {
        this.availability = availability;
    }

    public ProductEditOpenRequest availability(ProductAvailability availability) {
        this.availability = availability;
        return this;
    }

}
