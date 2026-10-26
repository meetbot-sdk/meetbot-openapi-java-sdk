package com.meetbot.openapi.model.enums;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * 订单在管理端的财务展示状态，反映付款与退款进度。取值：AUTHORIZED（已授权，支付信息已通过校验）、PENDING（待支付）、PAID（已支付）、PARTIALLY_PAID（部分支付）、PARTIALLY_REFUNDED（部分退款）、REFUNDED（已全额退款）、VOIDED（已作废，通常为未支付订单被手动关闭）。
 */
public enum BizSyncFinancialStatus {

    AUTHORIZED("AUTHORIZED"),
    PENDING("PENDING"),
    PAID("PAID"),
    PARTIALLY_PAID("PARTIALLY_PAID"),
    PARTIALLY_REFUNDED("PARTIALLY_REFUNDED"),
    REFUNDED("REFUNDED"),
    VOIDED("VOIDED");

    private final String value;

    BizSyncFinancialStatus(String value) {
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
    public static BizSyncFinancialStatus fromValue(String value) {
        if (value == null) {
            return null;
        }
        for (BizSyncFinancialStatus e : values()) {
            if (e.value.equals(value)) {
                return e;
            }
        }
        return null;
    }
}
