package com.xworkz.barathpay.repository;

import com.xworkz.barathpay.entity.PaymentTransactionEntity;

public interface PaymentTransactionRepository {
    Boolean save(PaymentTransactionEntity entity);
}
