package com.meetbot.openapi.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * Meta Conversions API 回传参数。
 *
 * @see <a href="https://developers.facebook.com/documentation/marketing-api/conversions-api">Conversions API</a>
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class CtwaConversionPostbackParam extends ExtensibleDto {

    /**
     * 转化事件数组。
     * Required.
     */
    private List<ConversionEvent> data;

    @JsonProperty("test_event_code")
    private String testEventCode;

    public List<ConversionEvent> getData() {
        return data;
    }

    public void setData(List<ConversionEvent> data) {
        this.data = data;
    }

    public CtwaConversionPostbackParam data(List<ConversionEvent> data) {
        this.data = data;
        return this;
    }

    public String getTestEventCode() {
        return testEventCode;
    }

    public void setTestEventCode(String testEventCode) {
        this.testEventCode = testEventCode;
    }

    public CtwaConversionPostbackParam testEventCode(String testEventCode) {
        this.testEventCode = testEventCode;
        return this;
    }
}
