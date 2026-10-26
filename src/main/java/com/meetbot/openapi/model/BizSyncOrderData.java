package com.meetbot.openapi.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.meetbot.openapi.model.enums.BizSyncCancelReason;
import com.meetbot.openapi.model.enums.BizSyncFinancialStatus;
import com.meetbot.openapi.model.enums.BizSyncFulfillmentStatus;

/**
 * 订单主数据快照，覆盖订单身份、金额、地址、商品行与退款记录等，供订单查询、热点缓存与事件关联使用。
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class BizSyncOrderData {

    /**
     * 外部订单唯一 ID，在本渠道内全局唯一；与 userId 组合定位一笔交易。
     * Required.
     */
    private String id;

    /**
     * 下单用户的外部 ID，须与已同步的用户 id 一致。Guest 结账场景也须传占位或匿名用户 ID，不可省略。
     * Required.
     */
    private String userId;

    /** Required. */
    private BizSyncFinancialStatus financialStatus;

    private BizSyncFulfillmentStatus fulfillmentStatus;

    private BizSyncCancelReason cancelReason;

    /**
     * 订单当前应付/已付总额（含折扣与退款后的净值），双币种表示；内容变量「订单金额(+币种)」。
     */
    private BizSyncPriceSet totalPriceSet;

    /**
     * 订单在源系统中创建的时间（毫秒）。
     */
    private Long orderCreateTime;

    /**
     * 订单支付完成时间（毫秒时间戳）。用于记录订单实际付款时点、交易行为圈选的时间范围判断等。未支付或待支付订单可不传；已支付订单建议填写。
     */
    private Long orderPayTime;

    /**
     * 订单取消时间（毫秒）；未取消订单不传或传 null。
     */
    private Long orderCancelTime;

    /**
     * 订单名/展示编号，常见为带 # 前缀的序号（如 "#1001"），用于内容变量「订单编号」；非幂等键，与 id 可不同。
     */
    private String orderName;

    /**
     * 下单联系人手机号，订单级联系电话。建议含国际区号（如 +12025550123）。
     */
    private String orderPhone;

    /**
     * 账单地址关联的电话号码。
     */
    private String billingPhone;

    /**
     * 买家在下单流程中填写的订单联系邮箱，用于订单通知、买家识别与触达。与 user.userEmail 可不同：访客下单或未登录场景下，订单邮箱可能尚未与用户账户绑定。
     */
    private String contactEmail;

    private BizSyncShippingAddress shippingAddress;

    /**
     * 已支付/已确认的商品行列表，描述订单包含哪些 SKU 及数量、行价。
     */
    private java.util.List<BizSyncSkuItem> skuPaid;

    /**
     * 历史退款记录列表，按 refundId 分组；用于退款时间聚合与订单财务态展示。
     */
    private java.util.List<BizSyncRefundGroup> skuRefunded;

    /**
     * 买家可访问的订单状态页 URL，用于内容变量「订单详情链接」。
     */
    private String orderStatusUrl;

    /**
     * 该条记录在源系统中的首次写入时间（毫秒），可选。
     */
    private Long createTime;

    /**
     * 该条订单记录在源系统中的最后变更时间（毫秒），必填；用于防乱序，须随每次变更递增。
     * Required.
     */
    private Long updateTime;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public BizSyncOrderData id(String id) {
        this.id = id;
        return this;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public BizSyncOrderData userId(String userId) {
        this.userId = userId;
        return this;
    }

    public BizSyncFinancialStatus getFinancialStatus() {
        return financialStatus;
    }

    public void setFinancialStatus(BizSyncFinancialStatus financialStatus) {
        this.financialStatus = financialStatus;
    }

    public BizSyncOrderData financialStatus(BizSyncFinancialStatus financialStatus) {
        this.financialStatus = financialStatus;
        return this;
    }

    public BizSyncFulfillmentStatus getFulfillmentStatus() {
        return fulfillmentStatus;
    }

    public void setFulfillmentStatus(BizSyncFulfillmentStatus fulfillmentStatus) {
        this.fulfillmentStatus = fulfillmentStatus;
    }

    public BizSyncOrderData fulfillmentStatus(BizSyncFulfillmentStatus fulfillmentStatus) {
        this.fulfillmentStatus = fulfillmentStatus;
        return this;
    }

    public BizSyncCancelReason getCancelReason() {
        return cancelReason;
    }

    public void setCancelReason(BizSyncCancelReason cancelReason) {
        this.cancelReason = cancelReason;
    }

    public BizSyncOrderData cancelReason(BizSyncCancelReason cancelReason) {
        this.cancelReason = cancelReason;
        return this;
    }

    public BizSyncPriceSet getTotalPriceSet() {
        return totalPriceSet;
    }

    public void setTotalPriceSet(BizSyncPriceSet totalPriceSet) {
        this.totalPriceSet = totalPriceSet;
    }

    public BizSyncOrderData totalPriceSet(BizSyncPriceSet totalPriceSet) {
        this.totalPriceSet = totalPriceSet;
        return this;
    }

    public Long getOrderCreateTime() {
        return orderCreateTime;
    }

    public void setOrderCreateTime(Long orderCreateTime) {
        this.orderCreateTime = orderCreateTime;
    }

    public BizSyncOrderData orderCreateTime(Long orderCreateTime) {
        this.orderCreateTime = orderCreateTime;
        return this;
    }

    public Long getOrderPayTime() {
        return orderPayTime;
    }

    public void setOrderPayTime(Long orderPayTime) {
        this.orderPayTime = orderPayTime;
    }

    public BizSyncOrderData orderPayTime(Long orderPayTime) {
        this.orderPayTime = orderPayTime;
        return this;
    }

    public Long getOrderCancelTime() {
        return orderCancelTime;
    }

    public void setOrderCancelTime(Long orderCancelTime) {
        this.orderCancelTime = orderCancelTime;
    }

    public BizSyncOrderData orderCancelTime(Long orderCancelTime) {
        this.orderCancelTime = orderCancelTime;
        return this;
    }

    public String getOrderName() {
        return orderName;
    }

    public void setOrderName(String orderName) {
        this.orderName = orderName;
    }

    public BizSyncOrderData orderName(String orderName) {
        this.orderName = orderName;
        return this;
    }

    public String getOrderPhone() {
        return orderPhone;
    }

    public void setOrderPhone(String orderPhone) {
        this.orderPhone = orderPhone;
    }

    public BizSyncOrderData orderPhone(String orderPhone) {
        this.orderPhone = orderPhone;
        return this;
    }

    public String getBillingPhone() {
        return billingPhone;
    }

    public void setBillingPhone(String billingPhone) {
        this.billingPhone = billingPhone;
    }

    public BizSyncOrderData billingPhone(String billingPhone) {
        this.billingPhone = billingPhone;
        return this;
    }

    public String getContactEmail() {
        return contactEmail;
    }

    public void setContactEmail(String contactEmail) {
        this.contactEmail = contactEmail;
    }

    public BizSyncOrderData contactEmail(String contactEmail) {
        this.contactEmail = contactEmail;
        return this;
    }

    public BizSyncShippingAddress getShippingAddress() {
        return shippingAddress;
    }

    public void setShippingAddress(BizSyncShippingAddress shippingAddress) {
        this.shippingAddress = shippingAddress;
    }

    public BizSyncOrderData shippingAddress(BizSyncShippingAddress shippingAddress) {
        this.shippingAddress = shippingAddress;
        return this;
    }

    public java.util.List<BizSyncSkuItem> getSkuPaid() {
        return skuPaid;
    }

    public void setSkuPaid(java.util.List<BizSyncSkuItem> skuPaid) {
        this.skuPaid = skuPaid;
    }

    public BizSyncOrderData skuPaid(java.util.List<BizSyncSkuItem> skuPaid) {
        this.skuPaid = skuPaid;
        return this;
    }

    public java.util.List<BizSyncRefundGroup> getSkuRefunded() {
        return skuRefunded;
    }

    public void setSkuRefunded(java.util.List<BizSyncRefundGroup> skuRefunded) {
        this.skuRefunded = skuRefunded;
    }

    public BizSyncOrderData skuRefunded(java.util.List<BizSyncRefundGroup> skuRefunded) {
        this.skuRefunded = skuRefunded;
        return this;
    }

    public String getOrderStatusUrl() {
        return orderStatusUrl;
    }

    public void setOrderStatusUrl(String orderStatusUrl) {
        this.orderStatusUrl = orderStatusUrl;
    }

    public BizSyncOrderData orderStatusUrl(String orderStatusUrl) {
        this.orderStatusUrl = orderStatusUrl;
        return this;
    }

    public Long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }

    public BizSyncOrderData createTime(Long createTime) {
        this.createTime = createTime;
        return this;
    }

    public Long getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Long updateTime) {
        this.updateTime = updateTime;
    }

    public BizSyncOrderData updateTime(Long updateTime) {
        this.updateTime = updateTime;
        return this;
    }

}
