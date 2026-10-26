package com.meetbot.openapi.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * result 为空或不返回业务字段的成功响应。
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class EmptyResult {
}
