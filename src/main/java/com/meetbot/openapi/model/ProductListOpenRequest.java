package com.meetbot.openapi.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.meetbot.openapi.model.enums.CapabilityToVisitStatus;
import com.meetbot.openapi.model.enums.CatalogReviewStatus;
import com.meetbot.openapi.model.enums.ProductAvailability;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ProductListOpenRequest {

    /**
     * Catalog ID
     * Required.
     */
    private String catalogId;

    /**
     * 商品名称（模糊匹配）
     */
    private String title;

    /**
     * Meetbot 侧业务唯一 ID
     */
    private String retailerId;

    /**
     * 库存状态（Meta code）：in stock=有货 / out of stock=缺货
     */
    private ProductAvailability availability;

    /**
     * Meta 审核状态筛选：PENDING=待审核 / REJECTED=已拒绝 / APPROVED=已通过 / OUTDATED=已过期。响应结果中 reviewStatus 还可能为空字符串（暂无审核状态）。
     */
    private CatalogReviewStatus reviewStatus;

    /**
     * Meta 可见状态：VISIBLE=可见 / INVISIBLE=不可见
     */
    private CapabilityToVisitStatus capabilityToVisitStatus;

    /**
     * 页码，默认 1
     */
    private Long pageNum;

    /**
     * 每页数量，默认 10
     */
    private Long pageSize;

    public String getCatalogId() {
        return catalogId;
    }

    public void setCatalogId(String catalogId) {
        this.catalogId = catalogId;
    }

    public ProductListOpenRequest catalogId(String catalogId) {
        this.catalogId = catalogId;
        return this;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public ProductListOpenRequest title(String title) {
        this.title = title;
        return this;
    }

    public String getRetailerId() {
        return retailerId;
    }

    public void setRetailerId(String retailerId) {
        this.retailerId = retailerId;
    }

    public ProductListOpenRequest retailerId(String retailerId) {
        this.retailerId = retailerId;
        return this;
    }

    public ProductAvailability getAvailability() {
        return availability;
    }

    public void setAvailability(ProductAvailability availability) {
        this.availability = availability;
    }

    public ProductListOpenRequest availability(ProductAvailability availability) {
        this.availability = availability;
        return this;
    }

    public CatalogReviewStatus getReviewStatus() {
        return reviewStatus;
    }

    public void setReviewStatus(CatalogReviewStatus reviewStatus) {
        this.reviewStatus = reviewStatus;
    }

    public ProductListOpenRequest reviewStatus(CatalogReviewStatus reviewStatus) {
        this.reviewStatus = reviewStatus;
        return this;
    }

    public CapabilityToVisitStatus getCapabilityToVisitStatus() {
        return capabilityToVisitStatus;
    }

    public void setCapabilityToVisitStatus(CapabilityToVisitStatus capabilityToVisitStatus) {
        this.capabilityToVisitStatus = capabilityToVisitStatus;
    }

    public ProductListOpenRequest capabilityToVisitStatus(CapabilityToVisitStatus capabilityToVisitStatus) {
        this.capabilityToVisitStatus = capabilityToVisitStatus;
        return this;
    }

    public Long getPageNum() {
        return pageNum;
    }

    public void setPageNum(Long pageNum) {
        this.pageNum = pageNum;
    }

    public ProductListOpenRequest pageNum(Long pageNum) {
        this.pageNum = pageNum;
        return this;
    }

    public Long getPageSize() {
        return pageSize;
    }

    public void setPageSize(Long pageSize) {
        this.pageSize = pageSize;
    }

    public ProductListOpenRequest pageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }

}
