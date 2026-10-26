package com.meetbot.openapi.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * 事件上下文载荷；不同 eventType 使用不同字段子集。LEAD_SUBMITTED 类型强制 leadId + formId；REGISTRATION_COMPLETED 及其他类型强制 userId。各类型完整示例见本接口 Request body → Examples。买家姓名请放在 user.userFirstName/userLastName。
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class BizSyncEventData {

    /**
     * 外部用户 ID（LEAD_SUBMITTED 除外，其余事件类型必填）。与 user.id 建议保持一致。适用 eventType：CHECKOUT_STARTED、PRODUCT_ADDED_TO_CART、ORDER_PAID、ORDER_FULFILLED、ORDERS_CANCELLED、REFUNDS_CREATE、DELIVERED、REGISTRATION_COMPLETED。
     * Required.
     */
    private String userId;

    /**
     * 留资记录 ID，LEAD_SUBMITTED 事件必填，用于幂等。适用 eventType：LEAD_SUBMITTED。
     */
    private String leadId;

    /**
     * 表单标识，LEAD_SUBMITTED 事件必填。适用 eventType：LEAD_SUBMITTED。
     */
    private String formId;

    /**
     * 浏览器或设备侧客户端标识。适用 eventType：CHECKOUT_STARTED、PRODUCT_ADDED_TO_CART。
     */
    private String clientId;

    /**
     * 初始手机号，用户在结账或加购环节首次填写的联系电话。适用 eventType：CHECKOUT_STARTED、PRODUCT_ADDED_TO_CART、ORDER_PAID。
     */
    private String initPhone;

    /**
     * 下单联系人手机号，订单级联系电话（与订单同步字段 orderPhone 同源）。适用 eventType：CHECKOUT_STARTED、PRODUCT_ADDED_TO_CART、ORDER_PAID、ORDER_FULFILLED、ORDERS_CANCELLED、REFUNDS_CREATE、DELIVERED。
     */
    private String orderPhone;

    /**
     * 收货手机号，物流/收货地址关联的联系电话（与 order.shippingAddress.phone 同源）。适用 eventType：CHECKOUT_STARTED、PRODUCT_ADDED_TO_CART、ORDER_PAID、ORDER_FULFILLED、ORDERS_CANCELLED、REFUNDS_CREATE、DELIVERED。
     */
    private String addressPhone;

    /**
     * 适用 eventType：CHECKOUT_STARTED、PRODUCT_ADDED_TO_CART、DELIVERED。
     */
    private String country;

    /**
     * 关联订单的外部 ID（平铺字段）。持久化后供按订单回查；与 order.id 建议一致。适用 eventType：ORDER_PAID、ORDER_FULFILLED、ORDERS_CANCELLED、REFUNDS_CREATE、DELIVERED。
     */
    private String orderId;

    /**
     * 用户快照；userFirstName 与 userLastName 拼接后用于内容变量「订单买家姓名」。REGISTRATION_COMPLETED/LEAD_SUBMITTED 事件需传 user.mobile 或 user.userEmail 至少一个。适用 eventType：CHECKOUT_STARTED、PRODUCT_ADDED_TO_CART、ORDER_PAID、ORDER_FULFILLED、ORDERS_CANCELLED、REFUNDS_CREATE、DELIVERED、REGISTRATION_COMPLETED、LEAD_SUBMITTED。
     */
    private BizSyncUserData user;

    /**
     * 订单快照；建议含 id 与 updateTime 以便刷新订单热点。适用 eventType：ORDER_PAID、ORDER_FULFILLED、ORDERS_CANCELLED、REFUNDS_CREATE、DELIVERED。
     */
    private BizSyncOrderData order;

    /**
     * 履约快照列表。适用 eventType：ORDER_FULFILLED、DELIVERED。
     */
    private java.util.List<BizSyncFulfillmentSnapshot> fulfillments;

    /**
     * 购物车/结算商品快照。适用 eventType：CHECKOUT_STARTED、PRODUCT_ADDED_TO_CART。
     */
    private BizSyncCheckoutCommodity checkoutCommodity;

    /**
     * ORDERS_CANCELLED 事件：本次取消涉及的商品行，建议传 productId、title、sku、num；用于内容变量「订单商品&数量」。适用 eventType：ORDERS_CANCELLED。
     */
    private java.util.List<BizSyncSkuItem> cancelledLineItems;

    /**
     * REFUNDS_CREATE 事件：本次退款涉及的商品行，建议传 productId、title、sku、num；用于内容变量「退款商品数量」。适用 eventType：REFUNDS_CREATE。
     */
    private java.util.List<BizSyncSkuItem> refundLineItems;

    /**
     * REFUNDS_CREATE 事件：退款交易金额列表，amount 与 currencyCode 用于内容变量「退款金额」。适用 eventType：REFUNDS_CREATE。
     */
    private java.util.List<BizSyncMoney> refundTransactions;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public BizSyncEventData userId(String userId) {
        this.userId = userId;
        return this;
    }

    public String getLeadId() {
        return leadId;
    }

    public void setLeadId(String leadId) {
        this.leadId = leadId;
    }

    public BizSyncEventData leadId(String leadId) {
        this.leadId = leadId;
        return this;
    }

    public String getFormId() {
        return formId;
    }

    public void setFormId(String formId) {
        this.formId = formId;
    }

    public BizSyncEventData formId(String formId) {
        this.formId = formId;
        return this;
    }

    public String getClientId() {
        return clientId;
    }

    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    public BizSyncEventData clientId(String clientId) {
        this.clientId = clientId;
        return this;
    }

    public String getInitPhone() {
        return initPhone;
    }

    public void setInitPhone(String initPhone) {
        this.initPhone = initPhone;
    }

    public BizSyncEventData initPhone(String initPhone) {
        this.initPhone = initPhone;
        return this;
    }

    public String getOrderPhone() {
        return orderPhone;
    }

    public void setOrderPhone(String orderPhone) {
        this.orderPhone = orderPhone;
    }

    public BizSyncEventData orderPhone(String orderPhone) {
        this.orderPhone = orderPhone;
        return this;
    }

    public String getAddressPhone() {
        return addressPhone;
    }

    public void setAddressPhone(String addressPhone) {
        this.addressPhone = addressPhone;
    }

    public BizSyncEventData addressPhone(String addressPhone) {
        this.addressPhone = addressPhone;
        return this;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public BizSyncEventData country(String country) {
        this.country = country;
        return this;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public BizSyncEventData orderId(String orderId) {
        this.orderId = orderId;
        return this;
    }

    public BizSyncUserData getUser() {
        return user;
    }

    public void setUser(BizSyncUserData user) {
        this.user = user;
    }

    public BizSyncEventData user(BizSyncUserData user) {
        this.user = user;
        return this;
    }

    public BizSyncOrderData getOrder() {
        return order;
    }

    public void setOrder(BizSyncOrderData order) {
        this.order = order;
    }

    public BizSyncEventData order(BizSyncOrderData order) {
        this.order = order;
        return this;
    }

    public java.util.List<BizSyncFulfillmentSnapshot> getFulfillments() {
        return fulfillments;
    }

    public void setFulfillments(java.util.List<BizSyncFulfillmentSnapshot> fulfillments) {
        this.fulfillments = fulfillments;
    }

    public BizSyncEventData fulfillments(java.util.List<BizSyncFulfillmentSnapshot> fulfillments) {
        this.fulfillments = fulfillments;
        return this;
    }

    public BizSyncCheckoutCommodity getCheckoutCommodity() {
        return checkoutCommodity;
    }

    public void setCheckoutCommodity(BizSyncCheckoutCommodity checkoutCommodity) {
        this.checkoutCommodity = checkoutCommodity;
    }

    public BizSyncEventData checkoutCommodity(BizSyncCheckoutCommodity checkoutCommodity) {
        this.checkoutCommodity = checkoutCommodity;
        return this;
    }

    public java.util.List<BizSyncSkuItem> getCancelledLineItems() {
        return cancelledLineItems;
    }

    public void setCancelledLineItems(java.util.List<BizSyncSkuItem> cancelledLineItems) {
        this.cancelledLineItems = cancelledLineItems;
    }

    public BizSyncEventData cancelledLineItems(java.util.List<BizSyncSkuItem> cancelledLineItems) {
        this.cancelledLineItems = cancelledLineItems;
        return this;
    }

    public java.util.List<BizSyncSkuItem> getRefundLineItems() {
        return refundLineItems;
    }

    public void setRefundLineItems(java.util.List<BizSyncSkuItem> refundLineItems) {
        this.refundLineItems = refundLineItems;
    }

    public BizSyncEventData refundLineItems(java.util.List<BizSyncSkuItem> refundLineItems) {
        this.refundLineItems = refundLineItems;
        return this;
    }

    public java.util.List<BizSyncMoney> getRefundTransactions() {
        return refundTransactions;
    }

    public void setRefundTransactions(java.util.List<BizSyncMoney> refundTransactions) {
        this.refundTransactions = refundTransactions;
    }

    public BizSyncEventData refundTransactions(java.util.List<BizSyncMoney> refundTransactions) {
        this.refundTransactions = refundTransactions;
        return this;
    }

}
