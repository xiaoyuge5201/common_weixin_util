package com.github.xiaoyuge5201;

/**
 * 微信客户端
 * @author yugb
 */
public class WeiXinClient {

    private WeiXinProperties properties;

    private WeiXinUrlProperties urlProperties;

    public WeiXinProperties getProperties() {
        return properties;
    }

    public void setProperties(WeiXinProperties properties) {
        this.properties = properties;
    }

    public WeiXinUrlProperties getUrlProperties() {
        return urlProperties;
    }

    public void setUrlProperties(WeiXinUrlProperties urlProperties) {
        this.urlProperties = urlProperties;
    }

    public WeiXinClient(WeiXinProperties properties, WeiXinUrlProperties urlProperties) {
        this.properties = properties;
        this.urlProperties = urlProperties;
    }

    static WeiXinClient create(WeiXinProperties properties, WeiXinUrlProperties urlProperties) {
        return new WeiXinClient(properties, urlProperties);
    }
}
