package com.meetbot.openapi.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.meetbot.openapi.model.enums.CapabilityToVisitStatus;
import com.meetbot.openapi.model.enums.CatalogReviewStatus;
import com.meetbot.openapi.model.enums.ProductAvailability;
import com.meetbot.openapi.model.enums.ProductCondition;
import com.meetbot.openapi.model.enums.ProductType;

@JsonIgnoreProperties(ignoreUnknown = true)
public class CatalogProductResponse {

    /**
     * 主键
     */
    private Long id;

    /**
     * Meta Catalog ID
     */
    private String catalogId;

    /**
     * Meetbot 侧业务唯一 ID
     */
    private String retailerId;

    /**
     * Meta 商品 ID
     */
    private String metaProductId;

    /**
     * 商品名称
     */
    private String title;

    /**
     * 商品图片 URL
     */
    private String imageUrl;

    /**
     * 商品图片 storyKey
     */
    private String imageKey;

    /**
     * 商品类型：PHYSICAL=实物商品 / VIRTUAL=虚拟商品
     */
    private ProductType productType;

    /**
     * 商品成色（Meta code）：new=全新 / refurbished=翻新 / used=二手 / used_like_new=二手（几乎全新） / used_good=二手（成色好） / used_fair=二手（成色尚可）
     */
    private ProductCondition productCondition;

    /**
     * 商品品牌
     */
    private String brand;

    /**
     * 商品描述
     */
    private String description;

    /**
     * 商品价格
     */
    private java.math.BigDecimal priceValue;

    /**
     * 价格币种
     */
    private String priceCurrency;

    /**
     * 库存状态（Meta code）：in stock=有货 / out of stock=缺货
     */
    private ProductAvailability availability;

    /**
     * 商品介绍链接
     */
    private String link;

    /**
     * Meta 审核状态：PENDING=待审核 / REJECTED=已拒绝 / APPROVED=已通过 / OUTDATED=已过期；暂无审核状态时为 empty string（""）
     */
    private CatalogReviewStatus reviewStatus;

    /**
     * Meta 可见状态：VISIBLE=可见 / INVISIBLE=不可见
     */
    private CapabilityToVisitStatus capabilityToVisitStatus;

    /**
     * 创建时间（毫秒时间戳）
     */
    private Long createdAt;

    /**
     * 更新时间（毫秒时间戳）
     */
    private Long updatedAt;

    /**
     * 商品扩展字段定义列表
     */
    private java.util.List<CommerceOrderExtendFieldDefResponse> extendFields;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public CatalogProductResponse id(Long id) {
        this.id = id;
        return this;
    }

    public String getCatalogId() {
        return catalogId;
    }

    public void setCatalogId(String catalogId) {
        this.catalogId = catalogId;
    }

    public CatalogProductResponse catalogId(String catalogId) {
        this.catalogId = catalogId;
        return this;
    }

    public String getRetailerId() {
        return retailerId;
    }

    public void setRetailerId(String retailerId) {
        this.retailerId = retailerId;
    }

    public CatalogProductResponse retailerId(String retailerId) {
        this.retailerId = retailerId;
        return this;
    }

    public String getMetaProductId() {
        return metaProductId;
    }

    public void setMetaProductId(String metaProductId) {
        this.metaProductId = metaProductId;
    }

    public CatalogProductResponse metaProductId(String metaProductId) {
        this.metaProductId = metaProductId;
        return this;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public CatalogProductResponse title(String title) {
        this.title = title;
        return this;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public CatalogProductResponse imageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
        return this;
    }

    public String getImageKey() {
        return imageKey;
    }

    public void setImageKey(String imageKey) {
        this.imageKey = imageKey;
    }

    public CatalogProductResponse imageKey(String imageKey) {
        this.imageKey = imageKey;
        return this;
    }

    public ProductType getProductType() {
        return productType;
    }

    public void setProductType(ProductType productType) {
        this.productType = productType;
    }

    public CatalogProductResponse productType(ProductType productType) {
        this.productType = productType;
        return this;
    }

    public ProductCondition getProductCondition() {
        return productCondition;
    }

    public void setProductCondition(ProductCondition productCondition) {
        this.productCondition = productCondition;
    }

    public CatalogProductResponse productCondition(ProductCondition productCondition) {
        this.productCondition = productCondition;
        return this;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public CatalogProductResponse brand(String brand) {
        this.brand = brand;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public CatalogProductResponse description(String description) {
        this.description = description;
        return this;
    }

    public java.math.BigDecimal getPriceValue() {
        return priceValue;
    }

    public void setPriceValue(java.math.BigDecimal priceValue) {
        this.priceValue = priceValue;
    }

    public CatalogProductResponse priceValue(java.math.BigDecimal priceValue) {
        this.priceValue = priceValue;
        return this;
    }

    public String getPriceCurrency() {
        return priceCurrency;
    }

    public void setPriceCurrency(String priceCurrency) {
        this.priceCurrency = priceCurrency;
    }

    public CatalogProductResponse priceCurrency(String priceCurrency) {
        this.priceCurrency = priceCurrency;
        return this;
    }

    public ProductAvailability getAvailability() {
        return availability;
    }

    public void setAvailability(ProductAvailability availability) {
        this.availability = availability;
    }

    public CatalogProductResponse availability(ProductAvailability availability) {
        this.availability = availability;
        return this;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public CatalogProductResponse link(String link) {
        this.link = link;
        return this;
    }

    public CatalogReviewStatus getReviewStatus() {
        return reviewStatus;
    }

    public void setReviewStatus(CatalogReviewStatus reviewStatus) {
        this.reviewStatus = reviewStatus;
    }

    public CatalogProductResponse reviewStatus(CatalogReviewStatus reviewStatus) {
        this.reviewStatus = reviewStatus;
        return this;
    }

    public CapabilityToVisitStatus getCapabilityToVisitStatus() {
        return capabilityToVisitStatus;
    }

    public void setCapabilityToVisitStatus(CapabilityToVisitStatus capabilityToVisitStatus) {
        this.capabilityToVisitStatus = capabilityToVisitStatus;
    }

    public CatalogProductResponse capabilityToVisitStatus(CapabilityToVisitStatus capabilityToVisitStatus) {
        this.capabilityToVisitStatus = capabilityToVisitStatus;
        return this;
    }

    public Long getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Long createdAt) {
        this.createdAt = createdAt;
    }

    public CatalogProductResponse createdAt(Long createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    public Long getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Long updatedAt) {
        this.updatedAt = updatedAt;
    }

    public CatalogProductResponse updatedAt(Long updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    public java.util.List<CommerceOrderExtendFieldDefResponse> getExtendFields() {
        return extendFields;
    }

    public void setExtendFields(java.util.List<CommerceOrderExtendFieldDefResponse> extendFields) {
        this.extendFields = extendFields;
    }

    public CatalogProductResponse extendFields(java.util.List<CommerceOrderExtendFieldDefResponse> extendFields) {
        this.extendFields = extendFields;
        return this;
    }

}
