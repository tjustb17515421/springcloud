package com.mou.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class consumer_8080 {
    public static void main(String[] args) {
        SpringApplication.run(consumer_8080.class,args);
    }
}
