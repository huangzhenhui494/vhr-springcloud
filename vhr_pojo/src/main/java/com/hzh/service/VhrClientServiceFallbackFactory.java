package com.hzh.service;

import com.hzh.pojo.Employee;
import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @Author huangzhenhui
 * @Date 2019/4/10 19:57
 * @Version 1.0
 */

/**
 * 服务降级接口,统一熔断,与controller实现解耦
 *
 */
@Component // 千万不要忘记添加
public class VhrClientServiceFallbackFactory implements FallbackFactory<VhrClientService> {
    @Override
    public VhrClientService create(Throwable throwable) {
        return new VhrClientService() {
            @Override
            public List<Employee> findList() {
                return null;
            }

            @Override
            public Employee findById(Long id) {
                return new Employee().setName("没有信息,Comsumer客户端提供的降级信息,此时Provider已关闭").setId(Integer.parseInt(String.valueOf(id)));
            }
        };
    }
}
