package com.meetbot.openapi.model.enums;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * 库存状态（Meta code）：in stock=有货 / out of stock=缺货
 */
public enum ProductAvailability {

    IN_STOCK("in stock"),
    OUT_OF_STOCK("out of stock");

    private final String value;

    ProductAvailability(String value) {
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
    public static ProductAvailability fromValue(String value) {
        if (value == null) {
            return null;
        }
        for (ProductAvailability e : values()) {
            if (e.value.equals(value)) {
                return e;
            }
        }
        return null;
    }
}
