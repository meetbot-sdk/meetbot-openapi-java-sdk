package com.meetbot.openapi.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Meta Conversions API {@code user_data}。字段名与官方一致（hashed PII 字段如 em/ph 等）。
 *
 * @see <a href="https://developers.facebook.com/documentation/marketing-api/conversions-api">Conversions API</a>
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class ConversionUserData extends ExtensibleDto {

    private java.util.List<String> em;
    private java.util.List<String> ph;
    private java.util.List<String> fn;
    private java.util.List<String> ln;
    private java.util.List<String> ge;
    private java.util.List<String> db;
    private java.util.List<String> ct;
    private java.util.List<String> st;
    private java.util.List<String> zp;
    private java.util.List<String> country;

    @JsonProperty("external_id")
    private java.util.List<String> externalId;

    @JsonProperty("client_ip_address")
    private String clientIpAddress;

    @JsonProperty("client_user_agent")
    private String clientUserAgent;

    private String fbc;
    private String fbp;

    @JsonProperty("subscription_id")
    private String subscriptionId;

    @JsonProperty("fb_login_id")
    private String fbLoginId;

    @JsonProperty("lead_id")
    private String leadId;

    @JsonProperty("ctwa_clid")
    private String ctwaClid;

    public java.util.List<String> getEm() {
        return em;
    }

    public void setEm(java.util.List<String> em) {
        this.em = em;
    }

    public ConversionUserData em(java.util.List<String> em) {
        this.em = em;
        return this;
    }

    public java.util.List<String> getPh() {
        return ph;
    }

    public void setPh(java.util.List<String> ph) {
        this.ph = ph;
    }

    public ConversionUserData ph(java.util.List<String> ph) {
        this.ph = ph;
        return this;
    }

    public java.util.List<String> getFn() {
        return fn;
    }

    public void setFn(java.util.List<String> fn) {
        this.fn = fn;
    }

    public ConversionUserData fn(java.util.List<String> fn) {
        this.fn = fn;
        return this;
    }

    public java.util.List<String> getLn() {
        return ln;
    }

    public void setLn(java.util.List<String> ln) {
        this.ln = ln;
    }

    public ConversionUserData ln(java.util.List<String> ln) {
        this.ln = ln;
        return this;
    }

    public java.util.List<String> getGe() {
        return ge;
    }

    public void setGe(java.util.List<String> ge) {
        this.ge = ge;
    }

    public ConversionUserData ge(java.util.List<String> ge) {
        this.ge = ge;
        return this;
    }

    public java.util.List<String> getDb() {
        return db;
    }

    public void setDb(java.util.List<String> db) {
        this.db = db;
    }

    public ConversionUserData db(java.util.List<String> db) {
        this.db = db;
        return this;
    }

    public java.util.List<String> getCt() {
        return ct;
    }

    public void setCt(java.util.List<String> ct) {
        this.ct = ct;
    }

    public ConversionUserData ct(java.util.List<String> ct) {
        this.ct = ct;
        return this;
    }

    public java.util.List<String> getSt() {
        return st;
    }

    public void setSt(java.util.List<String> st) {
        this.st = st;
    }

    public ConversionUserData st(java.util.List<String> st) {
        this.st = st;
        return this;
    }

    public java.util.List<String> getZp() {
        return zp;
    }

    public void setZp(java.util.List<String> zp) {
        this.zp = zp;
    }

    public ConversionUserData zp(java.util.List<String> zp) {
        this.zp = zp;
        return this;
    }

    public java.util.List<String> getCountry() {
        return country;
    }

    public void setCountry(java.util.List<String> country) {
        this.country = country;
    }

    public ConversionUserData country(java.util.List<String> country) {
        this.country = country;
        return this;
    }

    public java.util.List<String> getExternalId() {
        return externalId;
    }

    public void setExternalId(java.util.List<String> externalId) {
        this.externalId = externalId;
    }

    public ConversionUserData externalId(java.util.List<String> externalId) {
        this.externalId = externalId;
        return this;
    }

    public String getClientIpAddress() {
        return clientIpAddress;
    }

    public void setClientIpAddress(String clientIpAddress) {
        this.clientIpAddress = clientIpAddress;
    }

    public ConversionUserData clientIpAddress(String clientIpAddress) {
        this.clientIpAddress = clientIpAddress;
        return this;
    }

    public String getClientUserAgent() {
        return clientUserAgent;
    }

    public void setClientUserAgent(String clientUserAgent) {
        this.clientUserAgent = clientUserAgent;
    }

    public ConversionUserData clientUserAgent(String clientUserAgent) {
        this.clientUserAgent = clientUserAgent;
        return this;
    }

    public String getFbc() {
        return fbc;
    }

    public void setFbc(String fbc) {
        this.fbc = fbc;
    }

    public ConversionUserData fbc(String fbc) {
        this.fbc = fbc;
        return this;
    }

    public String getFbp() {
        return fbp;
    }

    public void setFbp(String fbp) {
        this.fbp = fbp;
    }

    public ConversionUserData fbp(String fbp) {
        this.fbp = fbp;
        return this;
    }

    public String getSubscriptionId() {
        return subscriptionId;
    }

    public void setSubscriptionId(String subscriptionId) {
        this.subscriptionId = subscriptionId;
    }

    public ConversionUserData subscriptionId(String subscriptionId) {
        this.subscriptionId = subscriptionId;
        return this;
    }

    public String getFbLoginId() {
        return fbLoginId;
    }

    public void setFbLoginId(String fbLoginId) {
        this.fbLoginId = fbLoginId;
    }

    public ConversionUserData fbLoginId(String fbLoginId) {
        this.fbLoginId = fbLoginId;
        return this;
    }

    public String getLeadId() {
        return leadId;
    }

    public void setLeadId(String leadId) {
        this.leadId = leadId;
    }

    public ConversionUserData leadId(String leadId) {
        this.leadId = leadId;
        return this;
    }

    public String getCtwaClid() {
        return ctwaClid;
    }

    public void setCtwaClid(String ctwaClid) {
        this.ctwaClid = ctwaClid;
    }

    public ConversionUserData ctwaClid(String ctwaClid) {
        this.ctwaClid = ctwaClid;
        return this;
    }
}
