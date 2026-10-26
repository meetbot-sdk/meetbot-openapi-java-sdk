package com.meetbot.openapi.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class WhatsappTemplateFileUplodRequest {

    /**
     * WhatsApp Business Account Id(wabaId)
     * Required.
     */
    private String whatsappBusinessAccountId;

    /**
     * 文件url地址
     * Required.
     */
    private String fileUrl;

    /**
     * 文件的 MIME 类型。有效值为：application/pdf、image/jpeg、image/jpg、image/png 和 video/mp4
     * Required.
     */
    private String fileType;

    /**
     * 文件的大小，以字节为单位
     * Required.
     */
    private Long fileLength;

    public String getWhatsappBusinessAccountId() {
        return whatsappBusinessAccountId;
    }

    public void setWhatsappBusinessAccountId(String whatsappBusinessAccountId) {
        this.whatsappBusinessAccountId = whatsappBusinessAccountId;
    }

    public WhatsappTemplateFileUplodRequest whatsappBusinessAccountId(String whatsappBusinessAccountId) {
        this.whatsappBusinessAccountId = whatsappBusinessAccountId;
        return this;
    }

    public String getFileUrl() {
        return fileUrl;
    }

    public void setFileUrl(String fileUrl) {
        this.fileUrl = fileUrl;
    }

    public WhatsappTemplateFileUplodRequest fileUrl(String fileUrl) {
        this.fileUrl = fileUrl;
        return this;
    }

    public String getFileType() {
        return fileType;
    }

    public void setFileType(String fileType) {
        this.fileType = fileType;
    }

    public WhatsappTemplateFileUplodRequest fileType(String fileType) {
        this.fileType = fileType;
        return this;
    }

    public Long getFileLength() {
        return fileLength;
    }

    public void setFileLength(Long fileLength) {
        this.fileLength = fileLength;
    }

    public WhatsappTemplateFileUplodRequest fileLength(Long fileLength) {
        this.fileLength = fileLength;
        return this;
    }

}
