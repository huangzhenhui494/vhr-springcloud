package com.hzh.user.controller;

import com.hzh.pojo.Employee;
import com.hzh.user.service.EmployeeService;
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
        return employeeService.findList();
    }

    @RequestMapping(value = "/employee/findById/{id}",method = RequestMethod.GET)
    public Employee findById(@PathVariable("id") Long id){
        return employeeService.findById(id);
    }
}
