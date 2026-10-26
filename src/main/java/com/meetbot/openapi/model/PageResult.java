package com.meetbot.openapi.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

/**
 * 分页查询结果。
 *
 * @param <T> 列表元素类型
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class PageResult<T> {

    private Long total;
    private List<T> list;

    public Long getTotal() {
        return total;
    }

    public void setTotal(Long total) {
        this.total = total;
    }

    public List<T> getList() {
        return list;
    }

    public void setList(List<T> list) {
        this.list = list;
    }
}
