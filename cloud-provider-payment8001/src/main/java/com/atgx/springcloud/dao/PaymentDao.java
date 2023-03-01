package com.atgx.springcloud.dao;

import com.atgx.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @Author: liugx
 * @CreateTime: 2023-02-27  11:54
 * @Description: 支付dao
 * @Version: 1.0
 */
@Mapper
public interface PaymentDao {
    public int create(Payment payment);
    public Payment getPaymentById(@Param("id") long id);
}
