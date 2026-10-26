package com.meetbot.openapi.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ProductBatchImportOpenRequest {

    /**
     * Catalog ID
     * Required.
     */
    private String catalogId;

    /**
     * 导入 Excel 文件下载 URL。文件首行须包含必填表头：商品名称、商品图片、商品类型、商品状态、商品品牌、价格币种、价格、库存状态、商品描述、商品介绍链接；可选表头：商品编码（填写时为更新）。缺表头时任务失败，原因格式为 `表头缺失: {列名}`。
     * Required.
     */
    private String url;

    public String getCatalogId() {
        return catalogId;
    }

    public void setCatalogId(String catalogId) {
        this.catalogId = catalogId;
    }

    public ProductBatchImportOpenRequest catalogId(String catalogId) {
        this.catalogId = catalogId;
        return this;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public ProductBatchImportOpenRequest url(String url) {
        this.url = url;
        return this;
    }

}
