package com.hzh.register;

import com.hzh.register.config.MySelfRule;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

@SpringBootApplication
@EnableEurekaClient  // Ribbon需要
// 自定义将VHR-REGISTER-SERVICE加上负载均衡
// Ribbon:微服务名字获得调用地址
// Feign:接口+注解,面向接口编程
@RibbonClient(name = "VHR-REGISTER-SERVICE",configuration = MySelfRule.class)
public class VhrRegisterWebApplication {

    public static void main(String[] args) {
        SpringApplication.run(VhrRegisterWebApplication.class, args);
    }

}
