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
