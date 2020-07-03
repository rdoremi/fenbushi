package com.sc.api.service;

import com.sc.api.pojo.Dept;
import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

import java.util.List;

//降级

@Component
public class DeptClientServiceFallbackFactory implements FallbackFactory {
    @Override
    public DeptClientService create(Throwable throwable) {

        return new DeptClientService() {
            @Override
            public Dept queryBy(Long id) {
                return new Dept().setDeptno(id)
                        .setDname("id -> "+id+" 没有对应的信息，客户提供了降级的信息，这个服务已关闭")
                        .setDb_source("没有数据");
            }

            @Override
            public List<Dept> queryAll() {
                return null;
            }

            @Override
            public Dept addDept(Dept dept) {
                return null;
            }
        };
    }
}
