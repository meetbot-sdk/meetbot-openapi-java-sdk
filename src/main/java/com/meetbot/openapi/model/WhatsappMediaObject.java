package com.meetbot.openapi.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * Meta 媒体对象（image / audio / document / video / sticker）。{@code id} 与 {@code link} 二选一。
 *
 * @see <a href="https://developers.facebook.com/documentation/business-messaging/whatsapp/business-phone-numbers/media">Media</a>
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class WhatsappMediaObject extends ExtensibleDto {

    /** 已上传到 Meta 的 media id。 */
    private String id;

    /** 媒体公网 URL。 */
    private String link;

    /** 可选说明（image / video / document）。 */
    private String caption;

    /** 可选文件名（document）。 */
    private String filename;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public WhatsappMediaObject id(String id) {
        this.id = id;
        return this;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public WhatsappMediaObject link(String link) {
        this.link = link;
        return this;
    }

    public String getCaption() {
        return caption;
    }

    public void setCaption(String caption) {
        this.caption = caption;
    }

    public WhatsappMediaObject caption(String caption) {
        this.caption = caption;
        return this;
    }

    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }

    public WhatsappMediaObject filename(String filename) {
        this.filename = filename;
        return this;
    }
}
