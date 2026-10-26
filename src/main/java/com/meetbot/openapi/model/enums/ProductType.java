package com.meetbot.openapi.model.enums;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * 商品类型：PHYSICAL=实物商品 / VIRTUAL=虚拟商品
 */
public enum ProductType {

    PHYSICAL("PHYSICAL"),
    VIRTUAL("VIRTUAL");

    private final String value;

    ProductType(String value) {
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
    public static ProductType fromValue(String value) {
        if (value == null) {
            return null;
        }
        for (ProductType e : values()) {
            if (e.value.equals(value)) {
                return e;
            }
        }
        return null;
    }
}
