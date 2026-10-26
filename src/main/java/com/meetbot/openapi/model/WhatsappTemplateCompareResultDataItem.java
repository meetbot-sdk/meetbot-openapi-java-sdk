package com.meetbot.openapi.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * WhatsappTemplateCompareResultDataItem
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class WhatsappTemplateCompareResultDataItem extends ExtensibleDto {

    /**
     * metric
     */
    private String metric;

    /**
     * order_by_relative_metric
     */
    @JsonProperty("order_by_relative_metric")
    private java.util.List<String> orderByRelativeMetric;

    public String getMetric() {
        return metric;
    }

    public void setMetric(String metric) {
        this.metric = metric;
    }

    public WhatsappTemplateCompareResultDataItem metric(String metric) {
        this.metric = metric;
        return this;
    }

    public java.util.List<String> getOrderByRelativeMetric() {
        return orderByRelativeMetric;
    }

    public void setOrderByRelativeMetric(java.util.List<String> orderByRelativeMetric) {
        this.orderByRelativeMetric = orderByRelativeMetric;
    }

    public WhatsappTemplateCompareResultDataItem orderByRelativeMetric(java.util.List<String> orderByRelativeMetric) {
        this.orderByRelativeMetric = orderByRelativeMetric;
        return this;
    }
}
