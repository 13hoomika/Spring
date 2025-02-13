package com.xworkz.barathpay.service;

import com.xworkz.barathpay.dto.PaymentTransactionDto;

public interface PaymentTransactionService {
    void ValidateAndSAve(PaymentTransactionDto dto);
}
