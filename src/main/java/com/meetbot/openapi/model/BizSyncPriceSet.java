package com.meetbot.openapi.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * 双币种价格集合：同时给出商店本位币与买家展示币两种口径的金额，便于跨境或多币种场景对账与展示。
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class BizSyncPriceSet {

    /**
     * 商店本位币金额，通常为商家后台结算与报表使用的币种。
     */
    private BizSyncMoney shopMoney;

    /**
     * 买家侧展示币种金额，通常为结账页与订单确认邮件中展示的币种与数额。
     */
    private BizSyncMoney presentmentMoney;

    public BizSyncMoney getShopMoney() {
        return shopMoney;
    }

    public void setShopMoney(BizSyncMoney shopMoney) {
        this.shopMoney = shopMoney;
    }

    public BizSyncPriceSet shopMoney(BizSyncMoney shopMoney) {
        this.shopMoney = shopMoney;
        return this;
    }

    public BizSyncMoney getPresentmentMoney() {
        return presentmentMoney;
    }

    public void setPresentmentMoney(BizSyncMoney presentmentMoney) {
        this.presentmentMoney = presentmentMoney;
    }

    public BizSyncPriceSet presentmentMoney(BizSyncMoney presentmentMoney) {
        this.presentmentMoney = presentmentMoney;
        return this;
    }

}
