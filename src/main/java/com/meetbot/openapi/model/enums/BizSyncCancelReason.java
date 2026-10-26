package com.meetbot.openapi.model.enums;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * 订单取消原因分类；仅当订单已取消时有意义。取值：CUSTOMER（客户要求）、DECLINED（支付被拒）、FRAUD（欺诈风险）、INVENTORY（库存不足）、OTHER（其他）、STAFF（员工操作）。
 */
public enum BizSyncCancelReason {

    CUSTOMER("CUSTOMER"),
    DECLINED("DECLINED"),
    FRAUD("FRAUD"),
    INVENTORY("INVENTORY"),
    OTHER("OTHER"),
    STAFF("STAFF");

    private final String value;

    BizSyncCancelReason(String value) {
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
    public static BizSyncCancelReason fromValue(String value) {
        if (value == null) {
            return null;
        }
        for (BizSyncCancelReason e : values()) {
            if (e.value.equals(value)) {
                return e;
            }
        }
        return null;
    }
}
