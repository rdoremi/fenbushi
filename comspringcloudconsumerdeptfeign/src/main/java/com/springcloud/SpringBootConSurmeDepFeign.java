package com.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients(basePackages = {"com.sc.api"})
@ComponentScan(basePackages = {"com.springcloud"})
public class SpringBootConSurmeDepFeign {
    public static void main(String[] args) {
        SpringApplication.run(SpringBootConSurmeDepFeign.class,args);
    }
}
