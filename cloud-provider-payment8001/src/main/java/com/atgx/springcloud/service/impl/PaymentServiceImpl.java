package com.atgx.springcloud.service.impl;

import com.atgx.springcloud.dao.PaymentDao;
import com.atgx.springcloud.entities.Payment;
import com.atgx.springcloud.service.PaymentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @Author: liugx
 * @CreateTime: 2023-02-27  12:01
 * @Description: TODO
 * @Version: 1.0
 */
@Service
public class PaymentServiceImpl implements PaymentService {
    @Resource
    PaymentDao paymentDao;

    @Override
    public int create(Payment payment) {
        return paymentDao.create(payment);
    }

    @Override
    public Payment getPaymentById(long id) {
        return paymentDao.getPaymentById(id);
    }
}
