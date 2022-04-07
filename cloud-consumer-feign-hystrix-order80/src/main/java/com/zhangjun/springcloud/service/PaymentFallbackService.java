package com.zhangjun.springcloud.service;

import org.springframework.stereotype.Component;

/**
 * @author 张钧
 * @Description
 * @create 2022-04-07 21:38
 */
@Component
public class PaymentFallbackService implements PaymentHystrixService{
    @Override
    public String paymentInfo_OK(Integer id) {
        return "ok的错误";
    }

    @Override
    public String paymentInfo_TimeOut(Integer id) {
        return "timeout的错误";
    }
}
