package com.meetbot.openapi.api;

import com.fasterxml.jackson.core.type.TypeReference;
import com.meetbot.openapi.http.MeetbotHttpClient;
import com.meetbot.openapi.http.QueryParams;
import com.meetbot.openapi.model.ApiResponse;
import com.meetbot.openapi.model.MetaSuccessResult;
import com.meetbot.openapi.model.WhatAppAccountBusinessInfoRequest;
import com.meetbot.openapi.model.WhatAppAccountBusinessManagerInfoRequest;
import com.meetbot.openapi.model.WhatAppAccountPhoneNumbersRequest;
import com.meetbot.openapi.model.WhatAppAccountProfileRequest;
import com.meetbot.openapi.model.WhatsAppAccountPhoneVerifyCheckRequest;
import com.meetbot.openapi.model.WhatsAppAccountPhoneVerifySendRequest;
import com.meetbot.openapi.model.WhatsAppAccountProfileUpdateRequest;
import com.meetbot.openapi.model.WhatsappAccountProfileResult;
import com.meetbot.openapi.model.WhatsappBusinessAccountResult;
import com.meetbot.openapi.model.WhatsappBusinessManagerResult;
import com.meetbot.openapi.model.WhatsappBusinessProfileUpdateParam;
import com.meetbot.openapi.model.WhatsappPhoneNumbersResult;
import com.meetbot.openapi.model.WhatsappPhoneQualityQueryResult;
import com.meetbot.openapi.model.WhatsappPreverifiedPhoneListResult;

/**
 * WhatsApp 账号管理：商业资料、手机号、WABA、BM、号码验证。
 *
 * <p>对应 Meetbot 文档「账号管理」：
 * <a href="https://developers.meetbot.com/#/operations/whatsappAccountProfile">whatsappAccountProfile</a>
 */
public class AccountApi {

    private final MeetbotHttpClient http;

    public AccountApi(MeetbotHttpClient http) {
        this.http = http;
    }

    /**
     * WhatsApp 账号详情（商业资料）。响应字段以 Meta 官方文档为准。
     *
     * <p>{@code POST /open/whatsapp/account/profile}
     *
     * <ul>
     *   <li>Meetbot：<a href="https://developers.meetbot.com/#/operations/whatsappAccountProfile">whatsappAccountProfile</a></li>
     *   <li>Meta：<a href="https://developers.facebook.com/documentation/business-messaging/whatsapp/business-phone-numbers/business-profiles#get-your-business-profile">Get your business profile</a></li>
     * </ul>
     *
     * @param request 含 {@code phoneNumberId}，可选 {@code fields}
     * @return 商业资料列表
     */
    public WhatsappAccountProfileResult getProfile(WhatAppAccountProfileRequest request) {
        return http.post("/open/whatsapp/account/profile", request,
                new TypeReference<ApiResponse<WhatsappAccountProfileResult>>() {
                });
    }

    /**
     * WhatsApp 账号信息编辑（更新商业资料）。{@code param} 为 Meta 官方字段。
     *
     * <p>{@code POST /open/whatsapp/account/update/profile}
     *
     * <ul>
     *   <li>Meetbot：<a href="https://developers.meetbot.com/#/operations/whatsappAccountProfileUpdate">whatsappAccountProfileUpdate</a></li>
     *   <li>Meta：<a href="https://developers.facebook.com/documentation/business-messaging/whatsapp/business-phone-numbers/business-profiles">Business profiles</a></li>
     * </ul>
     *
     * @param request 含 {@code phoneNumberId} 与 {@link WhatsappBusinessProfileUpdateParam}
     * @return Meta success 结果
     */
    public MetaSuccessResult updateProfile(WhatsAppAccountProfileUpdateRequest request) {
        return http.post("/open/whatsapp/account/update/profile", request,
                new TypeReference<ApiResponse<MetaSuccessResult>>() {
                });
    }

    /**
     * 更新商业资料（便捷重载）。
     *
     * @param phoneNumberId 手机号 ID
     * @param param         Meta 商业资料更新对象
     * @return Meta success 结果
     */
    public MetaSuccessResult updateProfile(String phoneNumberId, WhatsappBusinessProfileUpdateParam param) {
        return updateProfile(new WhatsAppAccountProfileUpdateRequest().phoneNumberId(phoneNumberId).param(param));
    }

    /**
     * WhatsApp 账号信息和状态查询（WABA 下手机号列表）。
     *
     * <p>{@code POST /open/whatsapp/account/phone/numbers}
     *
     * <ul>
     *   <li>Meetbot：<a href="https://developers.meetbot.com/#/operations/whatsappAccountPhoneNumbers">whatsappAccountPhoneNumbers</a></li>
     *   <li>Meta：<a href="https://developers.facebook.com/documentation/business-messaging/whatsapp/business-phone-numbers">Business phone numbers</a></li>
     * </ul>
     *
     * @param request 含 {@code whatsappBusinessAccountId}，可选 {@code fields}
     * @return 手机号列表及分页
     */
    public WhatsappPhoneNumbersResult listPhoneNumbers(WhatAppAccountPhoneNumbersRequest request) {
        return http.post("/open/whatsapp/account/phone/numbers", request,
                new TypeReference<ApiResponse<WhatsappPhoneNumbersResult>>() {
                });
    }

    /**
     * WABA 信息和状态查询。
     *
     * <p>{@code POST /open/whatsapp/account/whatsapp/business/info}
     *
     * <ul>
     *   <li>Meetbot：<a href="https://developers.meetbot.com/#/operations/whatsappAccountBusinessInfo">whatsappAccountBusinessInfo</a></li>
     *   <li>Meta：<a href="https://developers.facebook.com/documentation/business-messaging/whatsapp/accounts">WhatsApp accounts</a></li>
     * </ul>
     *
     * @param request 含 {@code whatsappBusinessAccountId}，可选 {@code fields}
     * @return WABA 信息
     */
    public WhatsappBusinessAccountResult getWhatsappBusinessInfo(WhatAppAccountBusinessInfoRequest request) {
        return http.post("/open/whatsapp/account/whatsapp/business/info", request,
                new TypeReference<ApiResponse<WhatsappBusinessAccountResult>>() {
                });
    }

    /**
     * BM（Business Manager）信息查询。
     *
     * <p>{@code POST /open/whatsapp/account/business/info}
     *
     * <ul>
     *   <li>Meetbot：<a href="https://developers.meetbot.com/#/operations/whatsappAccountBusinessManagerInfo">whatsappAccountBusinessManagerInfo</a></li>
     *   <li>Meta：<a href="https://developers.facebook.com/documentation/business-management-apis">Business Management APIs</a></li>
     * </ul>
     *
     * @param request 含 {@code businessId}，可选 {@code fields}
     * @return BM 信息
     */
    public WhatsappBusinessManagerResult getBusinessManagerInfo(WhatAppAccountBusinessManagerInfoRequest request) {
        return http.post("/open/whatsapp/account/business/info", request,
                new TypeReference<ApiResponse<WhatsappBusinessManagerResult>>() {
                });
    }

    /**
     * WhatsApp 电话号码请求验证码。
     *
     * <p>{@code POST /open/whatsapp/account/phone/verify/send}
     *
     * <ul>
     *   <li>Meetbot：<a href="https://developers.meetbot.com/#/operations/whatsappAccountPhoneVerifySend">whatsappAccountPhoneVerifySend</a></li>
     *   <li>Meta：<a href="https://developers.facebook.com/documentation/business-messaging/whatsapp/business-phone-numbers/phone-numbers#verify-phone-numbers">Verify phone numbers</a></li>
     * </ul>
     *
     * @param request 发码请求
     * @return Meta success 结果
     */
    public MetaSuccessResult sendPhoneVerify(WhatsAppAccountPhoneVerifySendRequest request) {
        return http.post("/open/whatsapp/account/phone/verify/send", request,
                new TypeReference<ApiResponse<MetaSuccessResult>>() {
                });
    }

    /**
     * WhatsApp 电话号码验证（校验验证码）。
     *
     * <p>{@code POST /open/whatsapp/account/phone/verify/check}
     *
     * <ul>
     *   <li>Meetbot：<a href="https://developers.meetbot.com/#/operations/whatsappAccountPhoneVerifyCheck">whatsappAccountPhoneVerifyCheck</a></li>
     *   <li>Meta：<a href="https://developers.facebook.com/documentation/business-messaging/whatsapp/business-phone-numbers/phone-numbers#verify-phone-numbers">Verify phone numbers</a></li>
     * </ul>
     *
     * @param request 验码请求
     * @return Meta success 结果
     */
    public MetaSuccessResult checkPhoneVerify(WhatsAppAccountPhoneVerifyCheckRequest request) {
        return http.post("/open/whatsapp/account/phone/verify/check", request,
                new TypeReference<ApiResponse<MetaSuccessResult>>() {
                });
    }

    /**
     * 查询号码质量。
     *
     * <p>查询 WhatsApp 手机号码的质量评级和吞吐量。参考[官方文档](https://developers.facebook.com/documentation/business-messaging/whatsapp/phone-numbers)。
     * <p>{@code GET /v1/whatsapp/phone/number/quality}
     * <p>Meetbot：<a href="https://developers.meetbot.com/#/operations/whatsappPhoneQualityQuery">whatsappPhoneQualityQuery</a>
     *
     * @param phoneId WhatsApp 手机号码 ID（必填）
     * @return 查询号码质量结果
     */
    public WhatsappPhoneQualityQueryResult getPhoneQuality(String phoneId) {
        return http.get("/v1/whatsapp/phone/number/quality", QueryParams.create()
                        .add("phoneId", phoneId)
                        .toMap(),
                new TypeReference<ApiResponse<WhatsappPhoneQualityQueryResult>>() {
                });
    }

    /**
     * 查询预验证号码。
     *
     * <p>分页查询指定商务管理平台账号下的预验证电话号码。
     * <p>{@code GET /v1/whatsapp/phone/preVerified}
     * <p>Meetbot：<a href="https://developers.meetbot.com/#/operations/whatsappPreverifiedPhoneList">whatsappPreverifiedPhoneList</a>
     *
     * @param businessId Meta 商务管理平台账号 ID（必填）
     * @param codeVerificationStatus 验证码验证状态（可选）
     * @param limit 每页数量（可选）
     * @param after 下一页游标（可选）
     * @return 查询预验证号码结果
     */
    public WhatsappPreverifiedPhoneListResult listPreverifiedPhones(String businessId, String codeVerificationStatus, Long limit, String after) {
        return http.get("/v1/whatsapp/phone/preVerified", QueryParams.create()
                        .add("businessId", businessId)
                        .add("codeVerificationStatus", codeVerificationStatus)
                        .add("limit", limit)
                        .add("after", after)
                        .toMap(),
                new TypeReference<ApiResponse<WhatsappPreverifiedPhoneListResult>>() {
                });
    }
}
