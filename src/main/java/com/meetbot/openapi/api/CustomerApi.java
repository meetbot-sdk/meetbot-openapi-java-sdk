package com.meetbot.openapi.api;

import com.fasterxml.jackson.core.type.TypeReference;
import com.meetbot.openapi.http.MeetbotHttpClient;
import com.meetbot.openapi.model.ApiResponse;
import com.meetbot.openapi.model.CustomerChannelUserAddRequest;
import com.meetbot.openapi.model.CustomerChatStatusRequest;
import com.meetbot.openapi.model.CustomerChatStatusResponse;
import com.meetbot.openapi.model.CustomerConsultantAllocationAddUserRequest;
import com.meetbot.openapi.model.EmptyResult;
import com.meetbot.openapi.model.UserSeatResponse;
import com.meetbot.openapi.model.UserSeatSessionRequest;

/**
 * 客户管理：渠道用户添加、专属客服分配。
 *
 * <p>对应 Meetbot 文档「客户管理」：
 * <a href="https://developers.meetbot.com/#/operations/customerChannelUserAdd">customerChannelUserAdd</a>
 */
public class CustomerApi {

    private final MeetbotHttpClient http;

    public CustomerApi(MeetbotHttpClient http) {
        this.http = http;
    }

    /**
     * 渠道用户添加。
     *
     * <p>{@code POST /customer/channel/user/add}
     *
     * <ul>
     *   <li>Meetbot：<a href="https://developers.meetbot.com/#/operations/customerChannelUserAdd">customerChannelUserAdd</a></li>
     *   <li>Meta：本接口为 Meetbot 自有能力，无对应 Meta 文档</li>
     * </ul>
     *
     * @param request 渠道用户信息
     * @return 空业务结果
     */
    public EmptyResult addChannelUser(CustomerChannelUserAddRequest request) {
        return http.post("/customer/channel/user/add", request,
                new TypeReference<ApiResponse<EmptyResult>>() {
                });
    }

    /**
     * 专属客户用户添加（将用户分配给顾问/客服）。
     *
     * <p>{@code POST /consultant/allocation/add/user}
     *
     * <ul>
     *   <li>Meetbot：<a href="https://developers.meetbot.com/#/operations/customerConsultantAllocationAddUser">customerConsultantAllocationAddUser</a></li>
     *   <li>Meta：本接口为 Meetbot 自有能力，无对应 Meta 文档</li>
     * </ul>
     *
     * @param request 专属分配请求
     * @return 空业务结果
     */
    public EmptyResult addConsultantAllocationUser(CustomerConsultantAllocationAddUserRequest request) {
        return http.post("/consultant/allocation/add/user", request,
                new TypeReference<ApiResponse<EmptyResult>>() {
                });
    }

    /**
     * 客服列表。
     *
     * <p>
     * <p>{@code GET /open/user/seat/list}
     * <p>Meetbot：<a href="https://developers.meetbot.com/#/operations/userSeatList">userSeatList</a>
     *
     * @return 客服列表结果
     */
    public java.util.List<UserSeatResponse> listSeats() {
        return http.get("/open/user/seat/list", new TypeReference<ApiResponse<java.util.List<UserSeatResponse>>>() {
                });
    }

    /**
     * 查询客户会话状态。
     *
     * <p>查询指定客户当前会话是人工还是机器人。渠道固定为 WhatsApp。
     * <p>{@code POST /open/user/chatStatus}
     * <p>Meetbot：<a href="https://developers.meetbot.com/#/operations/userChatStatus">userChatStatus</a>
     *
     * @param request 请求参数
     * @return 查询客户会话状态结果
     */
    public CustomerChatStatusResponse getChatStatus(CustomerChatStatusRequest request) {
        return http.post("/open/user/chatStatus", request,
                new TypeReference<ApiResponse<CustomerChatStatusResponse>>() {
                });
    }

    /**
     * 创建会话。
     *
     * <p>为指定客户创建客服会话。店铺由 APIKEY 解析。渠道固定为 WhatsApp。
     * <p>{@code POST /open/user/seat/createSession}
     * <p>Meetbot：<a href="https://developers.meetbot.com/#/operations/userSeatCreateSession">userSeatCreateSession</a>
     *
     * @param request 请求参数
     * @return 创建会话结果
     */
    public Boolean createSession(UserSeatSessionRequest request) {
        return http.post("/open/user/seat/createSession", request,
                new TypeReference<ApiResponse<Boolean>>() {
                });
    }

    /**
     * 关闭会话。
     *
     * <p>关闭指定客户的当前客服会话。店铺由 APIKEY 解析。渠道固定为 WhatsApp。
     * <p>{@code POST /open/user/seat/closeSession}
     * <p>Meetbot：<a href="https://developers.meetbot.com/#/operations/userSeatCloseSession">userSeatCloseSession</a>
     *
     * @param request 请求参数
     * @return 关闭会话结果
     */
    public Boolean closeSession(UserSeatSessionRequest request) {
        return http.post("/open/user/seat/closeSession", request,
                new TypeReference<ApiResponse<Boolean>>() {
                });
    }
}
