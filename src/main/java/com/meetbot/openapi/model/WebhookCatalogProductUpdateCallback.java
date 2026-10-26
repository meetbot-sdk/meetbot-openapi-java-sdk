package com.meetbot.openapi.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class WebhookCatalogProductUpdateCallback {

    /**
     * 任务 ID，与 `/open/catalog/product/edit` 返回的 result 一致
     * Required.
     */
    private Long id;

    /**
     * 回调类型：OpenAPI 单条编辑 Catalog 商品任务完成
     * Required.
     */
    private String type;

    /** Required. */
    private CatalogProductHandleResultMessage msg;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public WebhookCatalogProductUpdateCallback id(Long id) {
        this.id = id;
        return this;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public WebhookCatalogProductUpdateCallback type(String type) {
        this.type = type;
        return this;
    }

    public CatalogProductHandleResultMessage getMsg() {
        return msg;
    }

    public void setMsg(CatalogProductHandleResultMessage msg) {
        this.msg = msg;
    }

    public WebhookCatalogProductUpdateCallback msg(CatalogProductHandleResultMessage msg) {
        this.msg = msg;
        return this;
    }

}
