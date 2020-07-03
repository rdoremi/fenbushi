package com.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class SpringBootConSurmeDep80Application {
    public static void main(String[] args) {
        SpringApplication.run(SpringBootConSurmeDep80Application.class,args);
    }
}
