package com.meetbot.openapi.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.meetbot.openapi.model.enums.MessageOriginType;

/**
 * MessageOriginItemResponse
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class MessageOriginItemResponse {

    /**
     * 渠道消息 ID；WhatsApp 消息为 wamid，不是业务系统消息 ID
     * Required.
     */
    private String channelMid;

    /**
     * 发送场景码，取值为 MessageOriginTypeEnum.name()。完整映射：OPEN_API=开放API接口；GROUP_SEND=群发；EDIT_TEST=编辑测试；TEST=测试；DEFAULT_REPLY=默认回复；QUICK_SHOT_MENTION=快拍提及；CUSTOM_KEYWORD=自定义对话-关键词；CUSTOM_NLP=自定义对话-NLP语义；CUSTOM_EVENT=自定义对话-事件；SEATS=客服座席；COMMENT=评论后msg回复；FACEBOOK_POST_COMMENT=facebook评论下回复；INSTAGRAM_POST_COMMENT=instagram评论下回复；INSTAGRAM_STORY_MENTION=instagram快拍提及；USER_INPUT=客户输入；REFERRAL=外链；SHORTLINK=短链接；CUSTOMER_CHAT=聊天插件；AD=广告；CHECKBOX=复选框/优惠卷插件；SEND_TO_MESSENGER=发送消息插件；BUTTON_CLICK=按钮点击；QUICK_REPLY_CLICK=快捷回复点击；OPTIN=OTN等optin；WELCOME=欢迎消息；MARKETING_CAMPAIGN=营销活动；MARKETING_CAMPAIGN_PRE_ORDER=营销活动预支付订单；SYSTEM=系统；SMPP=SMPP发送；ORDER_NOTICE_STRATEGY=订单通知策略；SHOPIFY_MARKETING_PLUGIN=shopify营销插件；ABANDONED_PURCHASE_STRATEGY=弃购挽回策略；ORDER_UPDATE_NOTICE_STRATEGY=订单更新推送；PERIODIC_GROUP_CUSTOMER_STRATEGY=定期触达策略；NEW_CUSTOMER_ACTIVATION_STRATEGY=新客触达策略；USER_INFO_STRATEGY=用户信息营销策略；APP_SYNC=WhatsApp Business App；CTWA_SESSION_OPENED_STRATEGY=广告会话开启策略；OPEN_API_V2=Open-API接口V2；OPEN_API_V2_CUSTOMIZE=Open-API接口V2-自定义消息；CUSTOM_PERIODICALLY=自定义对话-时间段；OTHER_APP=其它平台；DIALOGUE=对话
     * Required.
     */
    private MessageOriginType sendSceneCode;

    /**
     * 发送场景名称，与sendSceneCode对应
     * Required.
     */
    private String sendScene;

    /**
     * 发送场景业务ID；不同发送场景下含义不同
     * Required.
     */
    private String sendSceneBusinessId;

    public String getChannelMid() {
        return channelMid;
    }

    public void setChannelMid(String channelMid) {
        this.channelMid = channelMid;
    }

    public MessageOriginItemResponse channelMid(String channelMid) {
        this.channelMid = channelMid;
        return this;
    }

    public MessageOriginType getSendSceneCode() {
        return sendSceneCode;
    }

    public void setSendSceneCode(MessageOriginType sendSceneCode) {
        this.sendSceneCode = sendSceneCode;
    }

    public MessageOriginItemResponse sendSceneCode(MessageOriginType sendSceneCode) {
        this.sendSceneCode = sendSceneCode;
        return this;
    }

    public String getSendScene() {
        return sendScene;
    }

    public void setSendScene(String sendScene) {
        this.sendScene = sendScene;
    }

    public MessageOriginItemResponse sendScene(String sendScene) {
        this.sendScene = sendScene;
        return this;
    }

    public String getSendSceneBusinessId() {
        return sendSceneBusinessId;
    }

    public void setSendSceneBusinessId(String sendSceneBusinessId) {
        this.sendSceneBusinessId = sendSceneBusinessId;
    }

    public MessageOriginItemResponse sendSceneBusinessId(String sendSceneBusinessId) {
        this.sendSceneBusinessId = sendSceneBusinessId;
        return this;
    }
}
