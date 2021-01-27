package com.github.xiaoyuge5201;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties("weixin.config")
public class WeiXinProperties {

    private String appid;

    private String security;

    private String no;

    private String loginUrl;

    private String signature;

    private String server;

    private String serverUrl;

    private Integer qy;

    private String aesKey;

    /**
     * redis中存储的微信token信息
     */
    private String redis_qy_access_token = "qy_access_token";
    /**
     * 过期时间（设置小一点） 原大小为  6000s
     */
    private Integer qy_token_expires_in = 6000;

    /**
     * redis中存储的微信token 的key值
     */
    private String redis_access_token = "bo_weixin_access_token";

    /**
     * 过期时间（设置小一点） 原大小为  6000s
     */
    private Integer redis_token_expires_in = 6000;
    /**
     * jsapi_ticket
     * 微信页面引入js时，签名所需要的参数之一
     * 同access_token一样，需要缓存。
     * 过期时间与access_token相同
     */
    private String redis_sjapi_ticket = "bo_weixin_sjapi_ticket";
    /**
     * openid所在地址在redis中存放的key值
     */
    private String redis_openid_location = "bo_weixin_openid_location";

    public String getRedis_qy_access_token() {
        return redis_qy_access_token;
    }

    public void setRedis_qy_access_token(String redis_qy_access_token) {
        this.redis_qy_access_token = redis_qy_access_token;
    }

    public Integer getQy_token_expires_in() {
        return qy_token_expires_in;
    }

    public void setQy_token_expires_in(Integer qy_token_expires_in) {
        this.qy_token_expires_in = qy_token_expires_in;
    }

    public String getRedis_access_token() {
        return redis_access_token;
    }

    public void setRedis_access_token(String redis_access_token) {
        this.redis_access_token = redis_access_token;
    }

    public Integer getRedis_token_expires_in() {
        return redis_token_expires_in;
    }

    public void setRedis_token_expires_in(Integer redis_token_expires_in) {
        this.redis_token_expires_in = redis_token_expires_in;
    }

    public String getRedis_sjapi_ticket() {
        return redis_sjapi_ticket;
    }

    public void setRedis_sjapi_ticket(String redis_sjapi_ticket) {
        this.redis_sjapi_ticket = redis_sjapi_ticket;
    }

    public String getRedis_openid_location() {
        return redis_openid_location;
    }

    public void setRedis_openid_location(String redis_openid_location) {
        this.redis_openid_location = redis_openid_location;
    }

    public String getAppid() {
        return appid;
    }

    public void setAppid(String appid) {
        this.appid = appid;
    }

    public String getSecurity() {
        return security;
    }

    public void setSecurity(String security) {
        this.security = security;
    }

    public String getNo() {
        return no;
    }

    public void setNo(String no) {
        this.no = no;
    }

    public String getLoginUrl() {
        return loginUrl;
    }

    public void setLoginUrl(String loginUrl) {
        this.loginUrl = loginUrl;
    }

    public String getSignature() {
        return signature;
    }

    public void setSignature(String signature) {
        this.signature = signature;
    }

    public String getServer() {
        return server;
    }

    public void setServer(String server) {
        this.server = server;
    }

    public String getServerUrl() {
        return serverUrl;
    }

    public void setServerUrl(String serverUrl) {
        this.serverUrl = serverUrl;
    }

    public Integer getQy() {
        return qy;
    }

    public void setQy(Integer qy) {
        this.qy = qy;
    }

    public String getAesKey() {
        return aesKey;
    }

    public void setAesKey(String aesKey) {
        this.aesKey = aesKey;
    }
}
