package com.hzh.register.controller;

import com.hzh.pojo.Employee;
import com.hzh.service.VhrClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Author huangzhenhui
 * @Date 2019/4/8 18:39
 * @Version 1.0
 */
@RestController
        public class EmployeeController {

            @Autowired
            private VhrClientService vhrClientService;

            @RequestMapping(value = "/feign/findList",method = RequestMethod.GET)
            public List<Employee> findList(){
                return vhrClientService.findList();
            }

            @RequestMapping("/findById/{id}")
            public Employee findById(@PathVariable("id") Long id){
                return vhrClientService.findById(id);
    }
}
