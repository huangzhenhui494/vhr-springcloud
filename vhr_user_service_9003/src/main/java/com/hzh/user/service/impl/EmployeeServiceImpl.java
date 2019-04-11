package com.hzh.user.service.impl;

import com.hzh.mapper.EmployeeMapper;
import com.hzh.pojo.Employee;
import com.hzh.pojo.EmployeeExample;
import com.hzh.user.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author huangzhenhui
 * @Date 2019/4/8 16:57
 * @Version 1.0
 */
@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeMapper employeeMapper;


    @Override
    public List<Employee> findList() {
        return employeeMapper.selectByExample(new EmployeeExample());
    }

    @Override
    public Employee findById(Long id) {
        return employeeMapper.selectByPrimaryKey(Integer.parseInt(String.valueOf(id)));
    }
}
