package com.meetbot.openapi.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * 货币金额对象，用于精确表示十进制金额并避免浮点误差。
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class BizSyncMoney {

    /**
     * 金额数值，以十进制字符串表示（如 "99.99"），保留原始精度，不使用浮点数。
     */
    private String amount;

    /**
     * ISO 4217 三位货币代码（如 USD、CNY、EUR），表示 amount 的计价币种。
     */
    private String currencyCode;

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public BizSyncMoney amount(String amount) {
        this.amount = amount;
        return this;
    }

    public String getCurrencyCode() {
        return currencyCode;
    }

    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }

    public BizSyncMoney currencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
        return this;
    }

}
