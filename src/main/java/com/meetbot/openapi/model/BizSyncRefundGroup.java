package com.meetbot.openapi.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * 单次退款操作的分组记录，包含退款标识、发生时间及本次退款涉及的商品行明细。
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class BizSyncRefundGroup {

    /**
     * 外部退款单唯一 ID，同一退款多次上报时应保持不变，便于幂等与对账。
     */
    private String refundId;

    /**
     * 退款完成或退款记录创建的时间（毫秒时间戳）。
     */
    private Long refundTime;

    /**
     * 本次退款涉及的商品行列表，每行含 productId、sku、num 及可选 priceSet。
     */
    private java.util.List<BizSyncSkuItem> items;

    public String getRefundId() {
        return refundId;
    }

    public void setRefundId(String refundId) {
        this.refundId = refundId;
    }

    public BizSyncRefundGroup refundId(String refundId) {
        this.refundId = refundId;
        return this;
    }

    public Long getRefundTime() {
        return refundTime;
    }

    public void setRefundTime(Long refundTime) {
        this.refundTime = refundTime;
    }

    public BizSyncRefundGroup refundTime(Long refundTime) {
        this.refundTime = refundTime;
        return this;
    }

    public java.util.List<BizSyncSkuItem> getItems() {
        return items;
    }

    public void setItems(java.util.List<BizSyncSkuItem> items) {
        this.items = items;
    }

    public BizSyncRefundGroup items(java.util.List<BizSyncSkuItem> items) {
        this.items = items;
        return this;
    }

}
