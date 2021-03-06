package com.mou.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;


@SpringBootApplication
@EnableEurekaClient//在服务启动后自动注入到Eureka中
public class DeptProvider_8003 {
    public static void main(String[] args) {
       SpringApplication.run(DeptProvider_8003.class,args);
    }
}
