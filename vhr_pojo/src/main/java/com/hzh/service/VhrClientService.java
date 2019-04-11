package com.hzh.service;

import com.hzh.pojo.Employee;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

/**
 * @Author huangzhenhui
 * @Date 2019/4/9 0:24
 * @Version 1.0
 */
//@FeignClient(value = "VHR-REGISTER-SERVICE")
@FeignClient(value = "VHR-REGISTER-SERVICE",fallbackFactory = VhrClientServiceFallbackFactory.class)
// 让客户端在服务器不可用时也会获得提示信息而不会挂起耗死服务器
public interface VhrClientService {

    @RequestMapping(value = "/employee/findList",method = RequestMethod.GET)
    public List<Employee> findList();

    @RequestMapping(value = "/employee/findById/{id}",method = RequestMethod.GET)
    public Employee findById(@PathVariable("id") Long id);


}
