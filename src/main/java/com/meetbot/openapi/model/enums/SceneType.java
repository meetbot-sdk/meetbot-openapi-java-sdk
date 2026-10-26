package com.meetbot.openapi.model.enums;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum SceneType {

    CUSTOMER_SERVICE_SESSION("CUSTOMER_SERVICE_SESSION"),
    MARKETING("MARKETING"),
    TRANSACTION_NOTIFICATION("TRANSACTION_NOTIFICATION"),
    PRIVATE_DOMAIN_PAYMENT("PRIVATE_DOMAIN_PAYMENT"),
    AUTHENTICATION("AUTHENTICATION"),
    NO_SCENE("NO_SCENE");

    private final String value;

    SceneType(String value) {
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
    public static SceneType fromValue(String value) {
        if (value == null) {
            return null;
        }
        for (SceneType e : values()) {
            if (e.value.equals(value)) {
                return e;
            }
        }
        return null;
    }
}
