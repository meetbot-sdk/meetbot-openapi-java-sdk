package com.meetbot.openapi.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * Meta 地理位置消息对象。
 *
 * @see <a href="https://developers.facebook.com/documentation/business-messaging/whatsapp/messages/send-messages">Send messages</a>
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class WhatsappLocationObject extends ExtensibleDto {

    /** Required. */
    private Double longitude;

    /** Required. */
    private Double latitude;

    private String name;
    private String address;

    public Double getLongitude() {
        return longitude;
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    public WhatsappLocationObject longitude(Double longitude) {
        this.longitude = longitude;
        return this;
    }

    public Double getLatitude() {
        return latitude;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    public WhatsappLocationObject latitude(Double latitude) {
        this.latitude = latitude;
        return this;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public WhatsappLocationObject name(String name) {
        this.name = name;
        return this;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public WhatsappLocationObject address(String address) {
        this.address = address;
        return this;
    }
}
