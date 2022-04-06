package com.zhangjun.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author 张钧
 * @Description
 * @create 2022-04-06 17:16
 */
@SpringBootApplication
@EnableEurekaClient
public class MainApp80 {
    public static void main(String[] args) {
        SpringApplication.run(MainApp80.class,args);
    }
}
