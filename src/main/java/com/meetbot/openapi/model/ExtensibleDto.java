package com.meetbot.openapi.model;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * 反序列化时吸收文档未列出的扩展字段；序列化时仅把这些字段摊平到 JSON 同级，
 * 不会输出名为 {@code additionalProperties} 的属性，空 Map 也不写入请求体。
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public abstract class ExtensibleDto {

    @JsonIgnore
    private final Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        additionalProperties.put(name, value);
    }

    /**
     * Jackson {@code @JsonAnyGetter} 会将条目摊平为同级 JSON 字段，而不是 {@code additionalProperties} 对象。
     */
    @JsonAnyGetter
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public Map<String, Object> any() {
        return additionalProperties;
    }

    /**
     * 只读查看扩展字段；不参与 JSON 序列化。
     */
    @JsonIgnore
    public Map<String, Object> getAdditionalProperties() {
        return additionalProperties;
    }
}
