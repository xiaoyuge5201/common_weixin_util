package com.github.xiaoyuge5201;

import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author 小余哥
 **/
@ConditionalOnClass(WeiXinClient.class)
@Configuration
@EnableConfigurationProperties({WeiXinProperties.class,WeiXinUrlProperties.class})
public class WeiXinAutoConfiguration {

    @Bean
    public WeiXinClient weiXinClient(WeiXinProperties weiXinProperties, WeiXinUrlProperties urlProperties) {
        return WeiXinClient.create(weiXinProperties,urlProperties);
    }
}
