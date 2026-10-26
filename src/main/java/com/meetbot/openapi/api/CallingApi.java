package com.meetbot.openapi.api;

import com.fasterxml.jackson.core.type.TypeReference;
import com.meetbot.openapi.http.MeetbotHttpClient;
import com.meetbot.openapi.model.ApiResponse;
import com.meetbot.openapi.model.WhatsappCallingAcceptRequest;
import com.meetbot.openapi.model.WhatsappCallingConnectRequest;
import com.meetbot.openapi.model.WhatsappCallingPreAcceptRequest;
import com.meetbot.openapi.model.WhatsappCallingRejectRequest;
import com.meetbot.openapi.model.WhatsappCallingResult;
import com.meetbot.openapi.model.WhatsappCallingTerminateRequest;

/**
 * WhatsApp Calling 通话信令。
 *
 * <p>对应 Meetbot 文档「通话管理」：
 * <a href="https://developers.meetbot.com/#/operations/whatsappCallingConnect">whatsappCallingConnect</a>
 */
public class CallingApi {

    private final MeetbotHttpClient http;

    public CallingApi(MeetbotHttpClient http) {
        this.http = http;
    }

    /**
     * 商家向 WhatsApp 用户发起语音通话。外层 {@code phoneNumberId} 为 Meetbot 账号标识；
     * {@code param} 透传 Meta Calling API（{@code action=connect}），须携带本地 WebRTC 生成的 SDP Offer。
     * 成功后 {@code result.calls[0].id} 为通话 ID（wacid）。随后会收到 {@code calls_connect}（SDP Answer）
     * 以及 {@code calls_status}（RINGING / ACCEPTED）Webhook。
     *
     * <p>{@code POST /v1/whatsapp/calls/connect}
     *
     * <ul>
     *   <li>Meetbot：<a href="https://developers.meetbot.com/#/operations/whatsappCallingConnect">whatsappCallingConnect</a></li>
     *   <li>Meta：<a href="https://developers.facebook.com/documentation/business-messaging/whatsapp/calling/business-initiated-calls#endpoints-for-business-initiated-calling">Business-Initiated Calls</a></li>
     *   <li>Meta BSUID：<a href="https://developers.facebook.com/documentation/business-messaging/whatsapp/business-scoped-user-ids">Business-scoped user IDs</a></li>
     * </ul>
     *
     * @param request 发起通话请求
     * @return 含 wacid 的通话结果
     */
    public WhatsappCallingResult connect(WhatsappCallingConnectRequest request) {
        return http.post("/v1/whatsapp/calls/connect", request,
                new TypeReference<ApiResponse<WhatsappCallingResult>>() {
                });
    }

    /**
     * 用户来电预接听。收到 {@code calls_connect}（{@code direction=USER_INITIATED}，{@code sdp_type=offer}）后，
     * 先将 Offer 应用到本地 WebRTC，再调用本接口提交 SDP Answer（{@code action=pre_accept}），
     * 以提前建立媒体连接。预接听成功后再调用 {@link #accept}。
     *
     * <p>{@code POST /v1/whatsapp/calls/preAccept}
     *
     * <ul>
     *   <li>Meetbot：<a href="https://developers.meetbot.com/#/operations/whatsappCallingPreAccept">whatsappCallingPreAccept</a></li>
     *   <li>Meta：<a href="https://developers.facebook.com/documentation/business-messaging/whatsapp/calling/user-initiated-calls#pre-accept-call">Pre-accept Call</a></li>
     * </ul>
     *
     * @param request 预接听请求
     * @return 通话结果
     */
    public WhatsappCallingResult preAccept(WhatsappCallingPreAcceptRequest request) {
        return http.post("/v1/whatsapp/calls/preAccept", request,
                new TypeReference<ApiResponse<WhatsappCallingResult>>() {
                });
    }

    /**
     * 接听用户发起的来电。{@code param.action} 为 {@code accept}，须携带与 {@link #preAccept} 一致的 SDP Answer。
     *
     * <p>{@code POST /v1/whatsapp/calls/accept}
     *
     * <ul>
     *   <li>Meetbot：<a href="https://developers.meetbot.com/#/operations/whatsappCallingAccept">whatsappCallingAccept</a></li>
     *   <li>Meta：<a href="https://developers.facebook.com/documentation/business-messaging/whatsapp/calling/user-initiated-calls#accept-call">Accept Call</a></li>
     * </ul>
     *
     * @param request 接听请求
     * @return 通话结果
     */
    public WhatsappCallingResult accept(WhatsappCallingAcceptRequest request) {
        return http.post("/v1/whatsapp/calls/accept", request,
                new TypeReference<ApiResponse<WhatsappCallingResult>>() {
                });
    }

    /**
     * 拒绝用户发起的来电。{@code param} 只需 {@code messaging_product}、{@code call_id}、{@code action=reject}，无需 SDP。
     * 拒绝后会收到 {@code calls_terminate} 回调。
     *
     * <p>{@code POST /v1/whatsapp/calls/reject}
     *
     * <ul>
     *   <li>Meetbot：<a href="https://developers.meetbot.com/#/operations/whatsappCallingReject">whatsappCallingReject</a></li>
     *   <li>Meta：<a href="https://developers.facebook.com/documentation/business-messaging/whatsapp/calling/user-initiated-calls#reject-call">Reject Call</a></li>
     * </ul>
     *
     * @param request 拒绝请求
     * @return 通话结果
     */
    public WhatsappCallingResult reject(WhatsappCallingRejectRequest request) {
        return http.post("/v1/whatsapp/calls/reject", request,
                new TypeReference<ApiResponse<WhatsappCallingResult>>() {
                });
    }

    /**
     * 商家主动挂断通话，适用于用户来电与商家去电。{@code param.action} 为 {@code terminate}，无需 SDP。
     * 成功后会收到 {@code calls_terminate} 回调。
     *
     * <p>{@code POST /v1/whatsapp/calls/terminate}
     *
     * <ul>
     *   <li>Meetbot：<a href="https://developers.meetbot.com/#/operations/whatsappCallingTerminate">whatsappCallingTerminate</a></li>
     *   <li>Meta：<a href="https://developers.facebook.com/documentation/business-messaging/whatsapp/calling/user-initiated-calls#terminate-call">Terminate Call</a></li>
     * </ul>
     *
     * @param request 终止请求
     * @return 通话结果
     */
    public WhatsappCallingResult terminate(WhatsappCallingTerminateRequest request) {
        return http.post("/v1/whatsapp/calls/terminate", request,
                new TypeReference<ApiResponse<WhatsappCallingResult>>() {
                });
    }
}
