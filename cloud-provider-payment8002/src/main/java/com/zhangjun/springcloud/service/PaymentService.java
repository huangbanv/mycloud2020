package com.zhangjun.springcloud.service;

import com.zhangjun.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Param;

/**
 * @author 张钧
 * @Description
 * @create 2022-04-06 15:38
 */
public interface PaymentService {
    public int create(Payment payment);

    public Payment getPaymentById(@Param("id") Long id);

}
