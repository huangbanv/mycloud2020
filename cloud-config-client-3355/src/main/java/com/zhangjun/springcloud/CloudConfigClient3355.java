package com.zhangjun.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author 张钧的电脑
 */
@SpringBootApplication
@EnableEurekaClient
public class CloudConfigClient3355 {
    public static void main(String[] args) {
        SpringApplication.run(CloudConfigClient3355.class, args);
    }

}
