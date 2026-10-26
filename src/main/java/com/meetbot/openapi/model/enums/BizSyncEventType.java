package com.meetbot.openapi.model.enums;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * 业务事件类型。CHECKOUT_STARTED：开始结账；PRODUCT_ADDED_TO_CART：加入购物车；ORDER_PAID：订单已支付；ORDER_FULFILLED：订单已履约；ORDERS_CANCELLED：订单已取消；REFUNDS_CREATE：退款已创建；DELIVERED：配送已送达；REGISTRATION_COMPLETED：注册完成；LEAD_SUBMITTED：留资提交。
 */
public enum BizSyncEventType {

    CHECKOUT_STARTED("CHECKOUT_STARTED"),
    PRODUCT_ADDED_TO_CART("PRODUCT_ADDED_TO_CART"),
    ORDER_PAID("ORDER_PAID"),
    ORDER_FULFILLED("ORDER_FULFILLED"),
    ORDERS_CANCELLED("ORDERS_CANCELLED"),
    REFUNDS_CREATE("REFUNDS_CREATE"),
    DELIVERED("DELIVERED"),
    REGISTRATION_COMPLETED("REGISTRATION_COMPLETED"),
    LEAD_SUBMITTED("LEAD_SUBMITTED");

    private final String value;

    BizSyncEventType(String value) {
        this.value = value;
    }

    @JsonValue
    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return value;
    }

    @JsonCreator
    public static BizSyncEventType fromValue(String value) {
        if (value == null) {
            return null;
        }
        for (BizSyncEventType e : values()) {
            if (e.value.equals(value)) {
                return e;
            }
        }
        return null;
    }
}
