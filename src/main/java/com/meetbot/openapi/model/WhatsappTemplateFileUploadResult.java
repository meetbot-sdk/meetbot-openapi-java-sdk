package com.meetbot.openapi.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * 模板文件上传响应。
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class WhatsappTemplateFileUploadResult {

    /** 媒体素材 handle，创建/编辑模板 HEADER 时使用 */
    private String headerHandle;

    public String getHeaderHandle() {
        return headerHandle;
    }

    public void setHeaderHandle(String headerHandle) {
        this.headerHandle = headerHandle;
    }
}
