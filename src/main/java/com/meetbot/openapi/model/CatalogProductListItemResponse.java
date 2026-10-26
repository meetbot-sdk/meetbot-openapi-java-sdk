package com.meetbot.openapi.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.meetbot.openapi.model.enums.CapabilityToVisitStatus;
import com.meetbot.openapi.model.enums.CatalogReviewStatus;
import com.meetbot.openapi.model.enums.ProductAvailability;
import com.meetbot.openapi.model.enums.ProductCondition;
import com.meetbot.openapi.model.enums.ProductType;

@JsonIgnoreProperties(ignoreUnknown = true)
public class CatalogProductListItemResponse {

    /**
     * 商品扩展字段定义列表
     */
    private java.util.List<CommerceOrderExtendFieldDefResponse> extendFields;

    /**
     * 商品描述
     */
    private String description;

    /**
     * Meta 可见状态：VISIBLE=可见 / INVISIBLE=不可见
     */
    private CapabilityToVisitStatus capabilityToVisitStatus;

    /**
     * 创建时间（毫秒时间戳）
     */
    private Long createdAt;

    /**
     * 商品图片 storyKey
     */
    private String imageKey;

    /**
     * 商品图片 URL
     */
    private String imageUrl;

    /**
     * Meetbot 侧业务唯一 ID
     */
    private String retailerId;

    /**
     * 商品类型：PHYSICAL=实物商品 / VIRTUAL=虚拟商品
     */
    private ProductType productType;

    /**
     * 是否归档（已删除）
     */
    private Boolean archived;

    /**
     * 商品名称
     */
    private String title;

    /**
     * 更新时间（毫秒时间戳）
     */
    private Long updatedAt;

    /**
     * 商品价格
     */
    private java.math.BigDecimal priceValue;

    /**
     * Meta 审核状态：PENDING=待审核 / REJECTED=已拒绝 / APPROVED=已通过 / OUTDATED=已过期；暂无审核状态时为 empty string（""）
     */
    private CatalogReviewStatus reviewStatus;

    /**
     * 商品品牌
     */
    private String brand;

    /**
     * 商品成色（Meta code）：new=全新 / refurbished=翻新 / used=二手 / used_like_new=二手（几乎全新） / used_good=二手（成色好） / used_fair=二手（成色尚可）
     */
    private ProductCondition productCondition;

    /**
     * 主键
     */
    private Long id;

    /**
     * Meta Catalog ID
     */
    private String catalogId;

    /**
     * 价格币种
     */
    private String priceCurrency;

    /**
     * 商品介绍链接
     */
    private String link;

    /**
     * 库存状态（Meta code）：in stock=有货 / out of stock=缺货
     */
    private ProductAvailability availability;

    /**
     * Meta 商品 ID
     */
    private String metaProductId;

    public java.util.List<CommerceOrderExtendFieldDefResponse> getExtendFields() {
        return extendFields;
    }

    public void setExtendFields(java.util.List<CommerceOrderExtendFieldDefResponse> extendFields) {
        this.extendFields = extendFields;
    }

    public CatalogProductListItemResponse extendFields(java.util.List<CommerceOrderExtendFieldDefResponse> extendFields) {
        this.extendFields = extendFields;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public CatalogProductListItemResponse description(String description) {
        this.description = description;
        return this;
    }

    public CapabilityToVisitStatus getCapabilityToVisitStatus() {
        return capabilityToVisitStatus;
    }

    public void setCapabilityToVisitStatus(CapabilityToVisitStatus capabilityToVisitStatus) {
        this.capabilityToVisitStatus = capabilityToVisitStatus;
    }

    public CatalogProductListItemResponse capabilityToVisitStatus(CapabilityToVisitStatus capabilityToVisitStatus) {
        this.capabilityToVisitStatus = capabilityToVisitStatus;
        return this;
    }

    public Long getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Long createdAt) {
        this.createdAt = createdAt;
    }

    public CatalogProductListItemResponse createdAt(Long createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    public String getImageKey() {
        return imageKey;
    }

    public void setImageKey(String imageKey) {
        this.imageKey = imageKey;
    }

    public CatalogProductListItemResponse imageKey(String imageKey) {
        this.imageKey = imageKey;
        return this;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public CatalogProductListItemResponse imageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
        return this;
    }

    public String getRetailerId() {
        return retailerId;
    }

    public void setRetailerId(String retailerId) {
        this.retailerId = retailerId;
    }

    public CatalogProductListItemResponse retailerId(String retailerId) {
        this.retailerId = retailerId;
        return this;
    }

    public ProductType getProductType() {
        return productType;
    }

    public void setProductType(ProductType productType) {
        this.productType = productType;
    }

    public CatalogProductListItemResponse productType(ProductType productType) {
        this.productType = productType;
        return this;
    }

    public Boolean getArchived() {
        return archived;
    }

    public void setArchived(Boolean archived) {
        this.archived = archived;
    }

    public CatalogProductListItemResponse archived(Boolean archived) {
        this.archived = archived;
        return this;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public CatalogProductListItemResponse title(String title) {
        this.title = title;
        return this;
    }

    public Long getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Long updatedAt) {
        this.updatedAt = updatedAt;
    }

    public CatalogProductListItemResponse updatedAt(Long updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    public java.math.BigDecimal getPriceValue() {
        return priceValue;
    }

    public void setPriceValue(java.math.BigDecimal priceValue) {
        this.priceValue = priceValue;
    }

    public CatalogProductListItemResponse priceValue(java.math.BigDecimal priceValue) {
        this.priceValue = priceValue;
        return this;
    }

    public CatalogReviewStatus getReviewStatus() {
        return reviewStatus;
    }

    public void setReviewStatus(CatalogReviewStatus reviewStatus) {
        this.reviewStatus = reviewStatus;
    }

    public CatalogProductListItemResponse reviewStatus(CatalogReviewStatus reviewStatus) {
        this.reviewStatus = reviewStatus;
        return this;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public CatalogProductListItemResponse brand(String brand) {
        this.brand = brand;
        return this;
    }

    public ProductCondition getProductCondition() {
        return productCondition;
    }

    public void setProductCondition(ProductCondition productCondition) {
        this.productCondition = productCondition;
    }

    public CatalogProductListItemResponse productCondition(ProductCondition productCondition) {
        this.productCondition = productCondition;
        return this;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public CatalogProductListItemResponse id(Long id) {
        this.id = id;
        return this;
    }

    public String getCatalogId() {
        return catalogId;
    }

    public void setCatalogId(String catalogId) {
        this.catalogId = catalogId;
    }

    public CatalogProductListItemResponse catalogId(String catalogId) {
        this.catalogId = catalogId;
        return this;
    }

    public String getPriceCurrency() {
        return priceCurrency;
    }

    public void setPriceCurrency(String priceCurrency) {
        this.priceCurrency = priceCurrency;
    }

    public CatalogProductListItemResponse priceCurrency(String priceCurrency) {
        this.priceCurrency = priceCurrency;
        return this;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public CatalogProductListItemResponse link(String link) {
        this.link = link;
        return this;
    }

    public ProductAvailability getAvailability() {
        return availability;
    }

    public void setAvailability(ProductAvailability availability) {
        this.availability = availability;
    }

    public CatalogProductListItemResponse availability(ProductAvailability availability) {
        this.availability = availability;
        return this;
    }

    public String getMetaProductId() {
        return metaProductId;
    }

    public void setMetaProductId(String metaProductId) {
        this.metaProductId = metaProductId;
    }

    public CatalogProductListItemResponse metaProductId(String metaProductId) {
        this.metaProductId = metaProductId;
        return this;
    }

}
