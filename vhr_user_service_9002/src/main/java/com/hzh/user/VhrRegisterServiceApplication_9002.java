package com.hzh.user;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@MapperScan("com.hzh.mapper")
@SpringBootApplication
@EnableEurekaClient //本服务启动后会自动注册进eureka服务中
public class VhrRegisterServiceApplication_9002 {

    public static void main(String[] args) {
        SpringApplication.run(VhrRegisterServiceApplication_9002.class, args);
    }

}
