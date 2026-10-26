package com.meetbot.openapi.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * UserSeatSessionRequest
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class UserSeatSessionRequest {

    /**
     * 客服用户 id
     * Required.
     */
    private Long seatId;

    /**
     * 客户用户 id
     * Required.
     */
    private String customerId;

    public Long getSeatId() {
        return seatId;
    }

    public void setSeatId(Long seatId) {
        this.seatId = seatId;
    }

    public UserSeatSessionRequest seatId(Long seatId) {
        this.seatId = seatId;
        return this;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public UserSeatSessionRequest customerId(String customerId) {
        this.customerId = customerId;
        return this;
    }
}
