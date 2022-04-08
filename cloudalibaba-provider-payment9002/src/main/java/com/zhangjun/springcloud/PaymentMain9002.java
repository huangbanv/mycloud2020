package com.zhangjun.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author 张钧
 * @Description
 * @create 2022-04-08 21:39
 */
@EnableDiscoveryClient
@SpringBootApplication
public class PaymentMain9002
{
    public static void main(String[] args) {
        SpringApplication.run(PaymentMain9002.class, args);
    }
}

