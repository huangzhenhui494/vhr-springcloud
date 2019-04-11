package com.hzh.user.controller;

import com.hzh.pojo.Employee;
import com.hzh.user.service.EmployeeService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Author huangzhenhui
 * @Date 2019/4/8 20:25
 * @Version 1.0
 */

/**
 * 微服务提供者
 */
@RestController
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @RequestMapping(value = "/employee/findList",method = RequestMethod.GET)
    public List<Employee> findList(){
        List<Employee> list = employeeService.findList();
        if(list == null){
            throw new RuntimeException("没有东西");
        }
        return list;
    }

    @RequestMapping(value = "/employee/findById/{id}",method = RequestMethod.GET)
    @HystrixCommand(fallbackMethod = "processHystrix_Get")
    public Employee findById(@PathVariable("id") Long id){
        Employee employee = employeeService.findById(id);
        if(employee == null){
            throw new RuntimeException("没有东西");
        }
        return employee;
    }

    public Employee processHystrix_Get(@PathVariable("id") Long id){
        Employee employee = new Employee();
        employee.setName("滚");
        employee.setId(Integer.parseInt(String.valueOf(id)));
        return employee;
    }
}
