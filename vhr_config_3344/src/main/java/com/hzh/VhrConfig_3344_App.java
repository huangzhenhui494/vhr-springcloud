package com.hzh;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * @Author huangzhenhui
 * @Date 2019/4/11 11:25
 * @Version 1.0
 */
@SpringBootApplication
@EnableConfigServer
public class VhrConfig_3344_App {
    public static void main(String[] args) {
        SpringApplication.run(VhrConfig_3344_App.class,args);
    }
}
