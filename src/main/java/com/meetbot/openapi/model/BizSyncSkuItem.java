package com.meetbot.openapi.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * 订单/退款/履约相关的商品行快照，标识某次交易中涉及的商品、SKU 与数量。
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class BizSyncSkuItem {

    /**
     * 外部商品或变体唯一标识。同一商品在全链路中应保持稳定，用于商品详情查询与系列条件。
     */
    private String productId;

    /**
     * 商品行展示名称。用于内容变量「订单商品&数量」「履约商品数量」等；有 title 时优先展示，缺失时可回退 sku。订单同步 skuPaid/skuRefunded 与事件行 cancelledLineItems/refundLineItems/fulfillments[].lineItems 均可携带。
     */
    private String title;

    /**
     * 库存单位编码（Stock Keeping Unit），商家自定义的 SKU 字符串；无 SKU 时可留空，但会影响按 SKU 维度的条件判断。
     */
    private String sku;

    /**
     * 该行商品数量，为正整数，表示订购、退款或发货的单位件数。
     */
    private Long num;

    /**
     * 该行商品的价格（双币种）。订单同步场景建议填写；事件行（取消/退款快照）可不填。
     */
    private BizSyncPriceSet priceSet;

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public BizSyncSkuItem productId(String productId) {
        this.productId = productId;
        return this;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public BizSyncSkuItem title(String title) {
        this.title = title;
        return this;
    }

    public String getSku() {
        return sku;
    }

    public void setSku(String sku) {
        this.sku = sku;
    }

    public BizSyncSkuItem sku(String sku) {
        this.sku = sku;
        return this;
    }

    public Long getNum() {
        return num;
    }

    public void setNum(Long num) {
        this.num = num;
    }

    public BizSyncSkuItem num(Long num) {
        this.num = num;
        return this;
    }

    public BizSyncPriceSet getPriceSet() {
        return priceSet;
    }

    public void setPriceSet(BizSyncPriceSet priceSet) {
        this.priceSet = priceSet;
    }

    public BizSyncSkuItem priceSet(BizSyncPriceSet priceSet) {
        this.priceSet = priceSet;
        return this;
    }

}
