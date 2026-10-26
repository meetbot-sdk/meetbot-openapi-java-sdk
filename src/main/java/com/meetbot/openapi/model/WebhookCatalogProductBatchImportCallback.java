package com.meetbot.openapi.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class WebhookCatalogProductBatchImportCallback {

    /**
     * 任务 ID，与 `/open/catalog/product/batchImport` 返回的 result 一致
     * Required.
     */
    private Long id;

    /**
     * 回调类型：OpenAPI 批量导入 Catalog 商品任务完成
     * Required.
     */
    private String type;

    /** Required. */
    private CatalogProductUploadResultMessage msg;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public WebhookCatalogProductBatchImportCallback id(Long id) {
        this.id = id;
        return this;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public WebhookCatalogProductBatchImportCallback type(String type) {
        this.type = type;
        return this;
    }

    public CatalogProductUploadResultMessage getMsg() {
        return msg;
    }

    public void setMsg(CatalogProductUploadResultMessage msg) {
        this.msg = msg;
    }

    public WebhookCatalogProductBatchImportCallback msg(CatalogProductUploadResultMessage msg) {
        this.msg = msg;
        return this;
    }

}
