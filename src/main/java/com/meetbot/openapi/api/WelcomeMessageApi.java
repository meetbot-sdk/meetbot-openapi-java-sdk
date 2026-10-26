package com.meetbot.openapi.api;

import com.fasterxml.jackson.core.type.TypeReference;
import com.meetbot.openapi.http.MeetbotHttpClient;
import com.meetbot.openapi.http.QueryParams;
import com.meetbot.openapi.model.ApiResponse;
import com.meetbot.openapi.model.MetaSuccessResult;
import com.meetbot.openapi.model.StringIdResult;
import com.meetbot.openapi.model.WhatsappWelcomeMessageCreateRequest;
import com.meetbot.openapi.model.WhatsappWelcomeMessageDeleteRequest;
import com.meetbot.openapi.model.WhatsappWelcomeMessageListResult;
import com.meetbot.openapi.model.WhatsappWelcomeMessageUpdateRequest;

/** WelcomeMessage API。 */
public class WelcomeMessageApi {

    private final MeetbotHttpClient http;

    public WelcomeMessageApi(MeetbotHttpClient http) {
        this.http = http;
    }

    /**
     * 创建欢迎消息序列。
     *
     * <p>为指定 WABA 创建欢迎消息序列。序列至少需要提供预填消息或常见问题。
     * <p>{@code POST /v1/whatsapp/welcomeMessage/create}
     * <p>Meetbot：<a href="https://developers.meetbot.com/#/operations/whatsappWelcomeMessageCreate">whatsappWelcomeMessageCreate</a>
     *
     * @param request 请求参数
     * @return 创建欢迎消息序列结果
     */
    public StringIdResult create(WhatsappWelcomeMessageCreateRequest request) {
        return http.post("/v1/whatsapp/welcomeMessage/create", request,
                new TypeReference<ApiResponse<StringIdResult>>() {
                });
    }

    /**
     * 查询欢迎消息序列。
     *
     * <p>分页查询指定 WABA 的欢迎消息序列。
     * <p>{@code GET /v1/whatsapp/welcomeMessage/list}
     * <p>Meetbot：<a href="https://developers.meetbot.com/#/operations/whatsappWelcomeMessageList">whatsappWelcomeMessageList</a>
     *
     * @param wabaId WhatsApp 业务账号 ID（必填）
     * @param sequenceId 欢迎消息序列 ID（可选）
     * @param limit 每页数量（可选）
     * @param after 下一页游标（可选）
     * @return 查询欢迎消息序列结果
     */
    public WhatsappWelcomeMessageListResult list(String wabaId, String sequenceId, Long limit, String after) {
        return http.get("/v1/whatsapp/welcomeMessage/list", QueryParams.create()
                        .add("wabaId", wabaId)
                        .add("sequenceId", sequenceId)
                        .add("limit", limit)
                        .add("after", after)
                        .toMap(),
                new TypeReference<ApiResponse<WhatsappWelcomeMessageListResult>>() {
                });
    }

    /**
     * 更新欢迎消息序列。
     *
     * <p>更新指定欢迎消息序列。
     * <p>{@code POST /v1/whatsapp/welcomeMessage/update}
     * <p>Meetbot：<a href="https://developers.meetbot.com/#/operations/whatsappWelcomeMessageUpdate">whatsappWelcomeMessageUpdate</a>
     *
     * @param request 请求参数
     * @return 更新欢迎消息序列结果
     */
    public MetaSuccessResult update(WhatsappWelcomeMessageUpdateRequest request) {
        return http.post("/v1/whatsapp/welcomeMessage/update", request,
                new TypeReference<ApiResponse<MetaSuccessResult>>() {
                });
    }

    /**
     * 删除欢迎消息序列。
     *
     * <p>删除指定欢迎消息序列。
     * <p>{@code POST /v1/whatsapp/welcomeMessage/delete}
     * <p>Meetbot：<a href="https://developers.meetbot.com/#/operations/whatsappWelcomeMessageDelete">whatsappWelcomeMessageDelete</a>
     *
     * @param request 请求参数
     * @return 删除欢迎消息序列结果
     */
    public MetaSuccessResult delete(WhatsappWelcomeMessageDeleteRequest request) {
        return http.post("/v1/whatsapp/welcomeMessage/delete", request,
                new TypeReference<ApiResponse<MetaSuccessResult>>() {
                });
    }
}
