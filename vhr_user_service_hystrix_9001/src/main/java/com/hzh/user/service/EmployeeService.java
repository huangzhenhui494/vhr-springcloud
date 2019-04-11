package com.hzh.user.service;

import com.hzh.pojo.Employee;

import java.util.List;

/**
 * @Author huangzhenhui
 * @Date 2019/4/8 16:57
 * @Version 1.0
 */
public interface EmployeeService {

    List<Employee> findList();

    Employee findById(Long id);
}
