package com.github.xiaoyuge5201;

/**
 * 微信客户端
 * @author yugb
 */
public class WeiXinClient {

    private final WeiXinProperties properties;

    private final WeiXinUrlProperties urlProperties;

    public WeiXinClient(WeiXinProperties properties, WeiXinUrlProperties urlProperties) {
        this.properties = properties;
        this.urlProperties = urlProperties;
    }

    static WeiXinClient create(WeiXinProperties properties, WeiXinUrlProperties urlProperties) {
        return new WeiXinClient(properties, urlProperties);
    }
}
