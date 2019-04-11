package com.hzh.register.config;

import com.netflix.loadbalancer.IRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Author huangzhenhui
 * @Date 2019/4/8 23:26
 * @Version 1.0
 */
@Configuration
public class MySelfRule {
    @Bean
    public IRule myRule(){
//        return new RandomRule();  达到的目的，用我们重新选择的随机算法替代默认的轮询
        return new RandomRule_ZY(); // 自定义
    }
}
