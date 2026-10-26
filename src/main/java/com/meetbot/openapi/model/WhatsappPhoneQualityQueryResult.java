package com.meetbot.openapi.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * 查询号码质量结果；保留 Meta 扩展字段。
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class WhatsappPhoneQualityQueryResult extends ExtensibleDto {

    /**
     * id
     */
    private String id;

    /**
     * quality_rating
     */
    @JsonProperty("quality_rating")
    private String qualityRating;

    /**
     * throughput
     */
    private WhatsappPhoneQualityQueryResultThroughput throughput;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public WhatsappPhoneQualityQueryResult id(String id) {
        this.id = id;
        return this;
    }

    public String getQualityRating() {
        return qualityRating;
    }

    public void setQualityRating(String qualityRating) {
        this.qualityRating = qualityRating;
    }

    public WhatsappPhoneQualityQueryResult qualityRating(String qualityRating) {
        this.qualityRating = qualityRating;
        return this;
    }

    public WhatsappPhoneQualityQueryResultThroughput getThroughput() {
        return throughput;
    }

    public void setThroughput(WhatsappPhoneQualityQueryResultThroughput throughput) {
        this.throughput = throughput;
    }

    public WhatsappPhoneQualityQueryResult throughput(WhatsappPhoneQualityQueryResultThroughput throughput) {
        this.throughput = throughput;
        return this;
    }
}
