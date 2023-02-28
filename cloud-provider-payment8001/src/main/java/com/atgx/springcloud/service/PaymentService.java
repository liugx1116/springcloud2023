package com.atgx.springcloud.service;

import com.atgx.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Param;

/**
 * @Author: liugx
 * @CreateTime: 2023-02-27  11:59
 * @Description: TODO
 * @Version: 1.0
 */
public interface PaymentService {
    public int create(Payment payment);
    public Payment getPaymentById(@Param("id") long id);
}
