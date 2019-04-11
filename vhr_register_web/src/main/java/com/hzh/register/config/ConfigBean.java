package com.hzh.register.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @Author huangzhenhui
 * @Date 2019/4/8 18:39
 * @Version 1.0
 */
@Configuration
public class ConfigBean {

    @Bean
    @LoadBalanced  // Rest时加入Ribbon的配置
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }
}
