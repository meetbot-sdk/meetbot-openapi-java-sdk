package com.meetbot.openapi.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * 商品（Product）主数据，含标题、状态、标签、类型及下属 SKU 变体列表。
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class BizSyncProductData {

    /**
     * 外部商品唯一 ID，在本渠道内稳定不变，供订单行、系列与事件中的 productId 引用。
     * Required.
     */
    private String id;

    /**
     * 商品记录最后变更时间（毫秒），必填，用于防乱序。
     * Required.
     */
    private Long updateTime;

    /**
     * 商品 URL handle，通常为全小写、连字符分隔的 slug（如 red-cotton-shirt），在店铺内唯一。
     */
    private String productHandle;

    /**
     * 商品对外展示标题，出现在商品详情与购物车等场景。
     */
    private String productTitle;

    /**
     * 商品生命周期状态。常见取值：ACTIVE（在售）、ARCHIVED（已归档不可售）、DRAFT（草稿未发布）。接口层不校验枚举，但建议与源系统状态一致。
     */
    private String productStatus;

    /**
     * 商品标签字符串列表，用于分类、检索与 PRODUCT_TAG 类聚合条件。
     */
    private java.util.List<String> productTags;

    /**
     * 商品所属系列（Collection）的外部 ID 列表，与商品系列同步接口中的 id 对应。
     */
    private java.util.List<String> collections;

    /**
     * 商家自定义的商品类型分类（如 Apparel、Electronics），用于筛选与 PRODUCT_TYPE 条件。
     */
    private String productType;

    /**
     * 该商品下各 SKU 变体及库存数量。
     */
    private java.util.List<BizSyncVariantSku> variantsSkus;

    /**
     * 商品在源系统中首次创建的时间（毫秒）。
     */
    private Long productCreateTime;

    /**
     * 该条同步记录在源系统中的创建时间（毫秒），可选。
     */
    private Long createTime;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public BizSyncProductData id(String id) {
        this.id = id;
        return this;
    }

    public Long getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Long updateTime) {
        this.updateTime = updateTime;
    }

    public BizSyncProductData updateTime(Long updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    public String getProductHandle() {
        return productHandle;
    }

    public void setProductHandle(String productHandle) {
        this.productHandle = productHandle;
    }

    public BizSyncProductData productHandle(String productHandle) {
        this.productHandle = productHandle;
        return this;
    }

    public String getProductTitle() {
        return productTitle;
    }

    public void setProductTitle(String productTitle) {
        this.productTitle = productTitle;
    }

    public BizSyncProductData productTitle(String productTitle) {
        this.productTitle = productTitle;
        return this;
    }

    public String getProductStatus() {
        return productStatus;
    }

    public void setProductStatus(String productStatus) {
        this.productStatus = productStatus;
    }

    public BizSyncProductData productStatus(String productStatus) {
        this.productStatus = productStatus;
        return this;
    }

    public java.util.List<String> getProductTags() {
        return productTags;
    }

    public void setProductTags(java.util.List<String> productTags) {
        this.productTags = productTags;
    }

    public BizSyncProductData productTags(java.util.List<String> productTags) {
        this.productTags = productTags;
        return this;
    }

    public java.util.List<String> getCollections() {
        return collections;
    }

    public void setCollections(java.util.List<String> collections) {
        this.collections = collections;
    }

    public BizSyncProductData collections(java.util.List<String> collections) {
        this.collections = collections;
        return this;
    }

    public String getProductType() {
        return productType;
    }

    public void setProductType(String productType) {
        this.productType = productType;
    }

    public BizSyncProductData productType(String productType) {
        this.productType = productType;
        return this;
    }

    public java.util.List<BizSyncVariantSku> getVariantsSkus() {
        return variantsSkus;
    }

    public void setVariantsSkus(java.util.List<BizSyncVariantSku> variantsSkus) {
        this.variantsSkus = variantsSkus;
    }

    public BizSyncProductData variantsSkus(java.util.List<BizSyncVariantSku> variantsSkus) {
        this.variantsSkus = variantsSkus;
        return this;
    }

    public Long getProductCreateTime() {
        return productCreateTime;
    }

    public void setProductCreateTime(Long productCreateTime) {
        this.productCreateTime = productCreateTime;
    }

    public BizSyncProductData productCreateTime(Long productCreateTime) {
        this.productCreateTime = productCreateTime;
        return this;
    }

    public Long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }

    public BizSyncProductData createTime(Long createTime) {
        this.createTime = createTime;
        return this;
    }

}
