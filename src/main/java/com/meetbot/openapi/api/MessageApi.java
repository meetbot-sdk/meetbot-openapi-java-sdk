package com.meetbot.openapi.api;

import com.fasterxml.jackson.core.type.TypeReference;
import com.meetbot.openapi.http.MeetbotHttpClient;
import com.meetbot.openapi.model.ApiResponse;
import com.meetbot.openapi.model.DownloadUrlResult;
import com.meetbot.openapi.model.EventTaskIdResult;
import com.meetbot.openapi.model.MediaFileDownloadRequest;
import com.meetbot.openapi.model.MediaFileUploadRequest;
import com.meetbot.openapi.model.MediaIdResult;
import com.meetbot.openapi.model.MessageIdResult;
import com.meetbot.openapi.model.MessageOriginBatchQueryRequest;
import com.meetbot.openapi.model.MessageOriginBatchQueryResponse;
import com.meetbot.openapi.model.MetaSuccessResult;
import com.meetbot.openapi.model.SendBlockMessageRequest;
import com.meetbot.openapi.model.SendMessageRequest;
import com.meetbot.openapi.model.WhatsappMediaDeleteRequest;
import com.meetbot.openapi.model.WhatsappMessageSendParam;

/**
 * 消息管理：发送内容/自定义消息、媒体上传下载。
 *
 * <p>对应 Meetbot 文档「消息管理」：
 * <a href="https://developers.meetbot.com/#/operations/sendMessage">sendMessage</a>
 */
public class MessageApi {

    private final MeetbotHttpClient http;

    public MessageApi(MeetbotHttpClient http) {
        this.http = http;
    }

    /**
     * 发送内容消息（Meetbot 内容/Block）。
     *
     * <p>{@code POST /open/whatsapp/message/send/block}
     *
     * <ul>
     *   <li>Meetbot：<a href="https://developers.meetbot.com/#/operations/sendBlockMessage">sendBlockMessage</a></li>
     *   <li>Meta：<a href="https://developers.facebook.com/documentation/business-messaging/whatsapp/messages/send-messages">Send messages</a></li>
     * </ul>
     *
     * @param request 内容发送请求
     * @return 事件任务 ID
     */
    public EventTaskIdResult sendBlock(SendBlockMessageRequest request) {
        return http.post("/open/whatsapp/message/send/block", request,
                new TypeReference<ApiResponse<EventTaskIdResult>>() {
                });
    }

    /**
     * 发送自定义消息。{@code param} 为 Meta Cloud API 消息体。
     *
     * <p>{@code POST /open/whatsapp/message/send}
     *
     * <ul>
     *   <li>Meetbot：<a href="https://developers.meetbot.com/#/operations/sendMessage">sendMessage</a></li>
     *   <li>Meta：<a href="https://developers.facebook.com/documentation/business-messaging/whatsapp/messages/send-messages">Send messages</a></li>
     *   <li>Meta BSUID：<a href="https://developers.facebook.com/documentation/business-messaging/whatsapp/business-scoped-user-ids">Business-scoped user IDs</a></li>
     * </ul>
     *
     * @param request 含 {@code phoneNumberId} 与 {@link WhatsappMessageSendParam}
     * @return Meetbot 消息 ID
     */
    public MessageIdResult send(SendMessageRequest request) {
        return http.post("/open/whatsapp/message/send", request,
                new TypeReference<ApiResponse<MessageIdResult>>() {
                });
    }

    /**
     * 发送自定义消息（便捷重载）。
     *
     * <p>对应 {@code POST /open/whatsapp/message/send}，见
     * {@link #send(SendMessageRequest)}。
     *
     * <ul>
     *   <li>Meetbot：<a href="https://developers.meetbot.com/#/operations/sendMessage">sendMessage</a></li>
     *   <li>Meta：<a href="https://developers.facebook.com/documentation/business-messaging/whatsapp/messages/send-messages">Send messages</a></li>
     *   <li>Meta BSUID：<a href="https://developers.facebook.com/documentation/business-messaging/whatsapp/business-scoped-user-ids">Business-scoped user IDs</a></li>
     * </ul>
     *
     * @param phoneNumberId WABA 手机号 ID
     * @param param         Meta Cloud API 消息对象
     * @return Meetbot 消息 ID
     */
    public MessageIdResult send(String phoneNumberId, WhatsappMessageSendParam param) {
        return send(new SendMessageRequest().phoneNumberId(phoneNumberId).param(param));
    }

    /**
     * 媒体文件上传，返回 WhatsApp mediaId。
     *
     * <p>{@code POST /open/whatsapp/file/upload/url}
     *
     * <ul>
     *   <li>Meetbot：<a href="https://developers.meetbot.com/#/operations/mediaFileUpload">mediaFileUpload</a></li>
     *   <li>Meta：<a href="https://developers.facebook.com/documentation/business-messaging/whatsapp/business-phone-numbers/media">Media</a></li>
     * </ul>
     *
     * @param request 含文件 URL、手机号 ID 与 MIME 类型
     * @return WhatsApp mediaId
     */
    public MediaIdResult upload(MediaFileUploadRequest request) {
        return http.post("/open/whatsapp/file/upload/url", request,
                new TypeReference<ApiResponse<MediaIdResult>>() {
                });
    }

    /**
     * 媒体文件下载，返回文件 URL。
     *
     * <p>{@code POST /open/whatsapp/file/download}
     *
     * <ul>
     *   <li>Meetbot：<a href="https://developers.meetbot.com/#/operations/mediaFileDownload">mediaFileDownload</a></li>
     *   <li>Meta：<a href="https://developers.facebook.com/documentation/business-messaging/whatsapp/business-phone-numbers/media">Media</a></li>
     * </ul>
     *
     * @param request 媒体下载请求
     * @return 文件下载 URL
     */
    public DownloadUrlResult download(MediaFileDownloadRequest request) {
        return http.post("/open/whatsapp/file/download", request,
                new TypeReference<ApiResponse<DownloadUrlResult>>() {
                });
    }

    /**
     * 批量查询消息发送来源。
     *
     * <p>根据 WhatsApp 渠道消息 ID 批量查询商户侧消息的发送场景。仅返回当前店铺下查询命中的商户侧发送消息；未命中或用户发送的消息不会出现在结果中。
     * <p>{@code POST /open/whatsapp/message/origin/batchQuery}
     * <p>Meetbot：<a href="https://developers.meetbot.com/#/operations/batchQueryMessageOrigin">batchQueryMessageOrigin</a>
     *
     * @param request 请求参数
     * @return 批量查询消息发送来源结果
     */
    public MessageOriginBatchQueryResponse batchQueryOrigin(MessageOriginBatchQueryRequest request) {
        return http.post("/open/whatsapp/message/origin/batchQuery", request,
                new TypeReference<ApiResponse<MessageOriginBatchQueryResponse>>() {
                });
    }

    /**
     * 删除媒体文件。
     *
     * <p>删除已上传到 Meta 的媒体文件。
     * <p>{@code POST /v1/whatsapp/file/delete}
     * <p>Meetbot：<a href="https://developers.meetbot.com/#/operations/whatsappMediaDelete">whatsappMediaDelete</a>
     *
     * @param request 请求参数
     * @return 删除媒体文件结果
     */
    public MetaSuccessResult deleteMedia(WhatsappMediaDeleteRequest request) {
        return http.post("/v1/whatsapp/file/delete", request,
                new TypeReference<ApiResponse<MetaSuccessResult>>() {
                });
    }
}
