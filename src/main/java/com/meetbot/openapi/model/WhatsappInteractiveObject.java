package com.meetbot.openapi.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * Meta 交互消息 {@code interactive} 对象（list / button / cta_url / flow / product 等）。
 *
 * @see <a href="https://developers.facebook.com/documentation/business-messaging/whatsapp/messages/send-messages">Send messages</a>
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class WhatsappInteractiveObject extends ExtensibleDto {

    /**
     * {@code list} / {@code button} / {@code product} / {@code product_list} / {@code cta_url} /
     * {@code flow} / {@code location_request_message} / {@code voice_call} / {@code address_message}。
     * Required.
     */
    private String type;

    private WhatsappInteractiveHeader header;
    private WhatsappInteractiveBody body;
    private WhatsappInteractiveFooter footer;
    private WhatsappInteractiveAction action;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public WhatsappInteractiveObject type(String type) {
        this.type = type;
        return this;
    }

    public WhatsappInteractiveHeader getHeader() {
        return header;
    }

    public void setHeader(WhatsappInteractiveHeader header) {
        this.header = header;
    }

    public WhatsappInteractiveObject header(WhatsappInteractiveHeader header) {
        this.header = header;
        return this;
    }

    public WhatsappInteractiveBody getBody() {
        return body;
    }

    public void setBody(WhatsappInteractiveBody body) {
        this.body = body;
    }

    public WhatsappInteractiveObject body(WhatsappInteractiveBody body) {
        this.body = body;
        return this;
    }

    public WhatsappInteractiveFooter getFooter() {
        return footer;
    }

    public void setFooter(WhatsappInteractiveFooter footer) {
        this.footer = footer;
    }

    public WhatsappInteractiveObject footer(WhatsappInteractiveFooter footer) {
        this.footer = footer;
        return this;
    }

    public WhatsappInteractiveAction getAction() {
        return action;
    }

    public void setAction(WhatsappInteractiveAction action) {
        this.action = action;
    }

    public WhatsappInteractiveObject action(WhatsappInteractiveAction action) {
        this.action = action;
        return this;
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class WhatsappInteractiveHeader extends ExtensibleDto {
        private String type;
        private String text;
        private WhatsappMediaObject image;
        private WhatsappMediaObject video;
        private WhatsappMediaObject document;

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public WhatsappInteractiveHeader type(String type) {
            this.type = type;
            return this;
        }

        public String getText() {
            return text;
        }

        public void setText(String text) {
            this.text = text;
        }

        public WhatsappInteractiveHeader text(String text) {
            this.text = text;
            return this;
        }

        public WhatsappMediaObject getImage() {
            return image;
        }

        public void setImage(WhatsappMediaObject image) {
            this.image = image;
        }

        public WhatsappInteractiveHeader image(WhatsappMediaObject image) {
            this.image = image;
            return this;
        }

        public WhatsappMediaObject getVideo() {
            return video;
        }

        public void setVideo(WhatsappMediaObject video) {
            this.video = video;
        }

        public WhatsappInteractiveHeader video(WhatsappMediaObject video) {
            this.video = video;
            return this;
        }

        public WhatsappMediaObject getDocument() {
            return document;
        }

        public void setDocument(WhatsappMediaObject document) {
            this.document = document;
        }

        public WhatsappInteractiveHeader document(WhatsappMediaObject document) {
            this.document = document;
            return this;
        }
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class WhatsappInteractiveBody extends ExtensibleDto {
        private String text;

        public String getText() {
            return text;
        }

        public void setText(String text) {
            this.text = text;
        }

        public WhatsappInteractiveBody text(String text) {
            this.text = text;
            return this;
        }
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class WhatsappInteractiveFooter extends ExtensibleDto {
        private String text;

        public String getText() {
            return text;
        }

        public void setText(String text) {
            this.text = text;
        }

        public WhatsappInteractiveFooter text(String text) {
            this.text = text;
            return this;
        }
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class WhatsappInteractiveAction extends ExtensibleDto {
        private String button;
        private List<WhatsappInteractiveButton> buttons;
        private List<WhatsappInteractiveSection> sections;
        private String name;
        @JsonProperty("catalog_id")
        private String catalogId;
        @JsonProperty("product_retailer_id")
        private String productRetailerId;

        public String getButton() {
            return button;
        }

        public void setButton(String button) {
            this.button = button;
        }

        public WhatsappInteractiveAction button(String button) {
            this.button = button;
            return this;
        }

        public List<WhatsappInteractiveButton> getButtons() {
            return buttons;
        }

        public void setButtons(List<WhatsappInteractiveButton> buttons) {
            this.buttons = buttons;
        }

        public WhatsappInteractiveAction buttons(List<WhatsappInteractiveButton> buttons) {
            this.buttons = buttons;
            return this;
        }

        public List<WhatsappInteractiveSection> getSections() {
            return sections;
        }

        public void setSections(List<WhatsappInteractiveSection> sections) {
            this.sections = sections;
        }

        public WhatsappInteractiveAction sections(List<WhatsappInteractiveSection> sections) {
            this.sections = sections;
            return this;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public WhatsappInteractiveAction name(String name) {
            this.name = name;
            return this;
        }

        public String getCatalogId() {
            return catalogId;
        }

        public void setCatalogId(String catalogId) {
            this.catalogId = catalogId;
        }

        public WhatsappInteractiveAction catalogId(String catalogId) {
            this.catalogId = catalogId;
            return this;
        }

        public String getProductRetailerId() {
            return productRetailerId;
        }

        public void setProductRetailerId(String productRetailerId) {
            this.productRetailerId = productRetailerId;
        }

        public WhatsappInteractiveAction productRetailerId(String productRetailerId) {
            this.productRetailerId = productRetailerId;
            return this;
        }
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class WhatsappInteractiveButton extends ExtensibleDto {
        private String type;
        private String title;
        private String id;

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public WhatsappInteractiveButton type(String type) {
            this.type = type;
            return this;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public WhatsappInteractiveButton title(String title) {
            this.title = title;
            return this;
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public WhatsappInteractiveButton id(String id) {
            this.id = id;
            return this;
        }
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class WhatsappInteractiveSection extends ExtensibleDto {
        private String title;
        private List<WhatsappInteractiveRow> rows;

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public WhatsappInteractiveSection title(String title) {
            this.title = title;
            return this;
        }

        public List<WhatsappInteractiveRow> getRows() {
            return rows;
        }

        public void setRows(List<WhatsappInteractiveRow> rows) {
            this.rows = rows;
        }

        public WhatsappInteractiveSection rows(List<WhatsappInteractiveRow> rows) {
            this.rows = rows;
            return this;
        }
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class WhatsappInteractiveRow extends ExtensibleDto {
        private String id;
        private String title;
        private String description;

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public WhatsappInteractiveRow id(String id) {
            this.id = id;
            return this;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public WhatsappInteractiveRow title(String title) {
            this.title = title;
            return this;
        }

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        public WhatsappInteractiveRow description(String description) {
            this.description = description;
            return this;
        }
    }
}
