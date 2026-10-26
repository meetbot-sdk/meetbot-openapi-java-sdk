package com.meetbot.openapi.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * 商品下的 SKU 变体与库存数量摘要。
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class BizSyncVariantSku {

    /**
     * 所属商品 ID，与商品同步接口中的 id 一致。
     */
    private String productId;

    /**
     * 变体 SKU 编码。
     */
    private String sku;

    /**
     * 库存数量，以字符串传递（如 "100"），表示当前可售或账面库存件数；与订单行 quantity（整数）语义不同。
     */
    private String num;

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public BizSyncVariantSku productId(String productId) {
        this.productId = productId;
        return this;
    }

    public String getSku() {
        return sku;
    }

    public void setSku(String sku) {
        this.sku = sku;
    }

    public BizSyncVariantSku sku(String sku) {
        this.sku = sku;
        return this;
    }

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }

    public BizSyncVariantSku num(String num) {
        this.num = num;
        return this;
    }

}
