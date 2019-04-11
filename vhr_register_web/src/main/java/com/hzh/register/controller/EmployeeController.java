package com.hzh.register.controller;

import com.hzh.pojo.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * @Author huangzhenhui
 * @Date 2019/4/8 18:39
 * @Version 1.0
 */
@RestController
@RequestMapping("/test")
public class EmployeeController {
    /**
     * 使用
     * （url,RequestMap,ResponseBean.class）
     * 请求地址，参数，http响应被转换成的对象类型
     */
    private static final String REST_URL_PREFIX = "http://VHR-REGISTER-SERVICE";

    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping("/findList")
    public List<Employee> findList(){
        return (List<Employee>) restTemplate.getForObject(REST_URL_PREFIX+"/employee/findList",List.class);
    }

    @RequestMapping("/findById/{id}")
    public Employee findById(@PathVariable("id") Long id){
        return restTemplate.getForObject(REST_URL_PREFIX+"/employee/findById/"+id,Employee.class);
    }

}
