package com.springcloud.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class SpringEureka7003Application {
    public static void main(String[] args) {
        SpringApplication.run(SpringEureka7003Application.class,args);
    }
}
