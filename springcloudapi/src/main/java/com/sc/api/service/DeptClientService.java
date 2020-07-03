package com.sc.api.service;

import com.sc.api.pojo.Dept;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Component
@FeignClient(value = "SPRINGCLOUD-PROVID-DEPT")
public interface DeptClientService {

    @GetMapping("/getbyid/{id}")
    public Dept queryBy(Long id);
    @GetMapping("/getList")  // getList同 8001 8002 8003一样
    public List<Dept> queryAll();
    @PostMapping("/add")
    public Dept addDept(Dept dept);

}
