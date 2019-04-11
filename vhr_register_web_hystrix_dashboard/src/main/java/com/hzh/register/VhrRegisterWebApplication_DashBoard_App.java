package com.hzh.register;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

@SpringBootApplication
@EnableHystrixDashboard // 开启DashBoard,此时服务要有actuator监控
public class VhrRegisterWebApplication_DashBoard_App {
    public static void main(String[] args) {
        SpringApplication.run(VhrRegisterWebApplication_DashBoard_App.class, args);
    }

}
