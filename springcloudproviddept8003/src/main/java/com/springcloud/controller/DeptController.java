package com.springcloud.controller;

import com.sc.api.pojo.Dept;
import com.springcloud.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DeptController {

    @Autowired
    private DeptService deptService;

    @Autowired
    private DiscoveryClient discoveryClient;

    @PostMapping("/add")
    public String addDept(Dept dept){
        Dept dep = deptService.insert(dept);
        return dep.toString();
    }

    @GetMapping("/getList")
    public List<Dept> getList(){
        return deptService.queryAllByLimit(0,10);
    }
    @GetMapping("/getbyid/{id}")
    public Dept getById(@PathVariable("id") Long id){
        Dept dept = deptService.queryById(id);
        System.out.println(dept);
        return dept;
    }

    @RequestMapping("/dep/discovery")
    public Object discovery(){
        List<String> services = discoveryClient.getServices();
        System.out.println("service ->"+services);
        List<ServiceInstance> instances = discoveryClient.getInstances("SPRINGCLOUD-PROVID-DEPT");

        for (ServiceInstance instance : instances) {
            System.out.println(
                    instance.getHost()+"\t"+
                            instance.getPort()+"\t"+
                            instance.getUri()+"\t"+
                            instance.getServiceId()
            );
        }
        return discoveryClient;
    }
}
