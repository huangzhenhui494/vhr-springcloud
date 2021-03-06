package com.hzh.user;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@MapperScan("com.hzh.mapper")
@SpringBootApplication
@EnableDiscoveryClient // 服务发现
@EnableEurekaClient    // 本服务启动后会自动注册进eureka服务中
@EnableCircuitBreaker  // 对hystrix熔断机制的支持
public class VhrRegisterServiceApplication_Hystrix_9001 {

    public static void main(String[] args) {
        SpringApplication.run(VhrRegisterServiceApplication_Hystrix_9001.class, args);
    }

}
