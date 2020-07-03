package com.springcloud.controller;

import com.sc.api.pojo.Dept;
import com.sc.api.service.DeptClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
public class DeptConsumerController {

    //@Autowired
    //private RestTemplate restTemplate;

    //private static final String REST_URL_PREFIS = "http://localhost:8001";
    //private static final String REST_URL_PREFIS = "http://SPRINGCLOUD-PROVID-DEPT";

    /*
    * Feign实现负载均衡
    * */

    @Autowired
    private DeptClientService deptClientService = null;

    @PostMapping("/add")
    public Dept add(Dept dept){
        //return restTemplate.postForObject(REST_URL_PREFIS+"/add",dept,Dept.class);
       return deptClientService.addDept(dept);
    }

    @RequestMapping("/getbyid/{id}")
    public Dept get(@PathVariable("id")Long id){
        //System.out.println(id);
        //return restTemplate.getForObject(REST_URL_PREFIS+"/getbyid/"+id,Dept.class);
        return deptClientService.queryBy(id);
    }

    @RequestMapping("/getlist")
    public List<Dept> getList(){
        //return restTemplate.getForObject(REST_URL_PREFIS+"/getList",List.class);
        return deptClientService.queryAll();
    }

}
