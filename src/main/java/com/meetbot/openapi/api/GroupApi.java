package com.meetbot.openapi.api;

import com.fasterxml.jackson.core.type.TypeReference;
import com.meetbot.openapi.http.MeetbotHttpClient;
import com.meetbot.openapi.http.QueryParams;
import com.meetbot.openapi.model.ApiResponse;
import com.meetbot.openapi.model.MetaSuccessResult;
import com.meetbot.openapi.model.WhatsappGroupCreateRequest;
import com.meetbot.openapi.model.WhatsappGroupCreateResult;
import com.meetbot.openapi.model.WhatsappGroupDeleteRequest;
import com.meetbot.openapi.model.WhatsappGroupDetailsResult;
import com.meetbot.openapi.model.WhatsappGroupInviteLinkResetRequest;
import com.meetbot.openapi.model.WhatsappGroupInviteLinkResetResult;
import com.meetbot.openapi.model.WhatsappGroupInviteLinkResult;
import com.meetbot.openapi.model.WhatsappGroupJoinRequestApproveRequest;
import com.meetbot.openapi.model.WhatsappGroupJoinRequestListResult;
import com.meetbot.openapi.model.WhatsappGroupJoinRequestRejectRequest;
import com.meetbot.openapi.model.WhatsappGroupListResult;
import com.meetbot.openapi.model.WhatsappGroupParticipantsRemoveRequest;
import com.meetbot.openapi.model.WhatsappGroupUpdateRequest;

/** Group API。 */
public class GroupApi {

    private final MeetbotHttpClient http;

    public GroupApi(MeetbotHttpClient http) {
        this.http = http;
    }

    /**
     * 创建群组。
     *
     * <p>创建 WhatsApp 群组。Groups API 仅对符合 Meta 资格要求的 Cloud API 手机号码开放。参考[官方文档](https://developers.facebook.com/documentation/business-messaging/whatsapp/groups/get-started)。
     * <p>{@code POST /v1/whatsapp/group/create}
     * <p>Meetbot：<a href="https://developers.meetbot.com/#/operations/whatsappGroupCreate">whatsappGroupCreate</a>
     *
     * @param request 请求参数
     * @return 创建群组结果
     */
    public WhatsappGroupCreateResult create(WhatsappGroupCreateRequest request) {
        return http.post("/v1/whatsapp/group/create", request,
                new TypeReference<ApiResponse<WhatsappGroupCreateResult>>() {
                });
    }

    /**
     * 查询群组列表。
     *
     * <p>分页查询指定号码创建的群组。参考[官方文档](https://developers.facebook.com/documentation/business-messaging/whatsapp/groups/get-started)。
     * <p>{@code GET /v1/whatsapp/group/list}
     * <p>Meetbot：<a href="https://developers.meetbot.com/#/operations/whatsappGroupList">whatsappGroupList</a>
     *
     * @param phoneId WhatsApp 手机号码 ID（必填）
     * @param fields 返回字段列表（可选）
     * @param limit 每页数量（可选）
     * @param after 下一页游标（可选）
     * @return 查询群组列表结果
     */
    public WhatsappGroupListResult list(String phoneId, String fields, Long limit, String after) {
        return http.get("/v1/whatsapp/group/list", QueryParams.create()
                        .add("phoneId", phoneId)
                        .add("fields", fields)
                        .add("limit", limit)
                        .add("after", after)
                        .toMap(),
                new TypeReference<ApiResponse<WhatsappGroupListResult>>() {
                });
    }

    /**
     * 查询群组详情。
     *
     * <p>查询指定群组详情。参考[官方文档](https://developers.facebook.com/documentation/business-messaging/whatsapp/groups/get-started)。
     * <p>{@code GET /v1/whatsapp/group/details}
     * <p>Meetbot：<a href="https://developers.meetbot.com/#/operations/whatsappGroupDetails">whatsappGroupDetails</a>
     *
     * @param groupId 群组 ID（必填）
     * @param fields 返回字段列表（可选）
     * @return 查询群组详情结果
     */
    public WhatsappGroupDetailsResult details(String groupId, String fields) {
        return http.get("/v1/whatsapp/group/details", QueryParams.create()
                        .add("groupId", groupId)
                        .add("fields", fields)
                        .toMap(),
                new TypeReference<ApiResponse<WhatsappGroupDetailsResult>>() {
                });
    }

    /**
     * 更新群组。
     *
     * <p>更新群组名称或描述。参考[官方文档](https://developers.facebook.com/documentation/business-messaging/whatsapp/groups/get-started)。
     * <p>{@code POST /v1/whatsapp/group/update}
     * <p>Meetbot：<a href="https://developers.meetbot.com/#/operations/whatsappGroupUpdate">whatsappGroupUpdate</a>
     *
     * @param request 请求参数
     * @return 更新群组结果
     */
    public MetaSuccessResult update(WhatsappGroupUpdateRequest request) {
        return http.post("/v1/whatsapp/group/update", request,
                new TypeReference<ApiResponse<MetaSuccessResult>>() {
                });
    }

    /**
     * 删除群组。
     *
     * <p>删除指定群组。参考[官方文档](https://developers.facebook.com/documentation/business-messaging/whatsapp/groups/get-started)。
     * <p>{@code POST /v1/whatsapp/group/delete}
     * <p>Meetbot：<a href="https://developers.meetbot.com/#/operations/whatsappGroupDelete">whatsappGroupDelete</a>
     *
     * @param request 请求参数
     * @return 删除群组结果
     */
    public MetaSuccessResult delete(WhatsappGroupDeleteRequest request) {
        return http.post("/v1/whatsapp/group/delete", request,
                new TypeReference<ApiResponse<MetaSuccessResult>>() {
                });
    }

    /**
     * 移除群组成员。
     *
     * <p>从群组中移除成员。参考[官方文档](https://developers.facebook.com/documentation/business-messaging/whatsapp/groups/get-started)。
     * <p>{@code POST /v1/whatsapp/group/participants/remove}
     * <p>Meetbot：<a href="https://developers.meetbot.com/#/operations/whatsappGroupParticipantsRemove">whatsappGroupParticipantsRemove</a>
     *
     * @param request 请求参数
     * @return 移除群组成员结果
     */
    public MetaSuccessResult participantsRemove(WhatsappGroupParticipantsRemoveRequest request) {
        return http.post("/v1/whatsapp/group/participants/remove", request,
                new TypeReference<ApiResponse<MetaSuccessResult>>() {
                });
    }

    /**
     * 查询群组邀请链接。
     *
     * <p>查询群组当前邀请链接。参考[官方文档](https://developers.facebook.com/documentation/business-messaging/whatsapp/groups/get-started)。
     * <p>{@code GET /v1/whatsapp/group/inviteLink}
     * <p>Meetbot：<a href="https://developers.meetbot.com/#/operations/whatsappGroupInviteLink">whatsappGroupInviteLink</a>
     *
     * @param groupId 群组 ID（必填）
     * @return 查询群组邀请链接结果
     */
    public WhatsappGroupInviteLinkResult inviteLink(String groupId) {
        return http.get("/v1/whatsapp/group/inviteLink", QueryParams.create()
                        .add("groupId", groupId)
                        .toMap(),
                new TypeReference<ApiResponse<WhatsappGroupInviteLinkResult>>() {
                });
    }

    /**
     * 重置群组邀请链接。
     *
     * <p>使旧邀请链接失效并生成新链接。参考[官方文档](https://developers.facebook.com/documentation/business-messaging/whatsapp/groups/get-started)。
     * <p>{@code POST /v1/whatsapp/group/inviteLink/reset}
     * <p>Meetbot：<a href="https://developers.meetbot.com/#/operations/whatsappGroupInviteLinkReset">whatsappGroupInviteLinkReset</a>
     *
     * @param request 请求参数
     * @return 重置群组邀请链接结果
     */
    public WhatsappGroupInviteLinkResetResult inviteLinkReset(WhatsappGroupInviteLinkResetRequest request) {
        return http.post("/v1/whatsapp/group/inviteLink/reset", request,
                new TypeReference<ApiResponse<WhatsappGroupInviteLinkResetResult>>() {
                });
    }

    /**
     * 查询群组加入申请。
     *
     * <p>分页查询群组加入申请。参考[官方文档](https://developers.facebook.com/documentation/business-messaging/whatsapp/groups/get-started)。
     * <p>{@code GET /v1/whatsapp/group/joinRequests}
     * <p>Meetbot：<a href="https://developers.meetbot.com/#/operations/whatsappGroupJoinRequestList">whatsappGroupJoinRequestList</a>
     *
     * @param groupId 群组 ID（必填）
     * @param limit 每页数量（可选）
     * @param after 下一页游标（可选）
     * @return 查询群组加入申请结果
     */
    public WhatsappGroupJoinRequestListResult joinRequestList(String groupId, Long limit, String after) {
        return http.get("/v1/whatsapp/group/joinRequests", QueryParams.create()
                        .add("groupId", groupId)
                        .add("limit", limit)
                        .add("after", after)
                        .toMap(),
                new TypeReference<ApiResponse<WhatsappGroupJoinRequestListResult>>() {
                });
    }

    /**
     * 批准群组加入申请。
     *
     * <p>批准指定用户加入群组。参考[官方文档](https://developers.facebook.com/documentation/business-messaging/whatsapp/groups/get-started)。
     * <p>{@code POST /v1/whatsapp/group/joinRequests/approve}
     * <p>Meetbot：<a href="https://developers.meetbot.com/#/operations/whatsappGroupJoinRequestApprove">whatsappGroupJoinRequestApprove</a>
     *
     * @param request 请求参数
     * @return 批准群组加入申请结果
     */
    public MetaSuccessResult joinRequestApprove(WhatsappGroupJoinRequestApproveRequest request) {
        return http.post("/v1/whatsapp/group/joinRequests/approve", request,
                new TypeReference<ApiResponse<MetaSuccessResult>>() {
                });
    }

    /**
     * 拒绝群组加入申请。
     *
     * <p>拒绝指定用户的群组加入申请。参考[官方文档](https://developers.facebook.com/documentation/business-messaging/whatsapp/groups/get-started)。
     * <p>{@code POST /v1/whatsapp/group/joinRequests/reject}
     * <p>Meetbot：<a href="https://developers.meetbot.com/#/operations/whatsappGroupJoinRequestReject">whatsappGroupJoinRequestReject</a>
     *
     * @param request 请求参数
     * @return 拒绝群组加入申请结果
     */
    public MetaSuccessResult joinRequestReject(WhatsappGroupJoinRequestRejectRequest request) {
        return http.post("/v1/whatsapp/group/joinRequests/reject", request,
                new TypeReference<ApiResponse<MetaSuccessResult>>() {
                });
    }
}
