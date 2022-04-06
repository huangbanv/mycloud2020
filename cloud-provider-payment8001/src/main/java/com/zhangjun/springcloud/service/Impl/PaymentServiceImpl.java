package com.zhangjun.springcloud.service.Impl;

import com.zhangjun.springcloud.dao.PaymentDao;
import com.zhangjun.springcloud.entities.Payment;
import com.zhangjun.springcloud.service.PaymentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author 张钧
 * @Description
 * @create 2022-04-06 15:39
 */
@Service
public class PaymentServiceImpl implements PaymentService {
    @Resource
    private PaymentDao paymentDao;


    @Override
    public int create(Payment payment) {
        return paymentDao.create(payment);
    }

    @Override
    public Payment getPaymentById(Long id) {
        return paymentDao.getPaymentById(id);
    }
}
