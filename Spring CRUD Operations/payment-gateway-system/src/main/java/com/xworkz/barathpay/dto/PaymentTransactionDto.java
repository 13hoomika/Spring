package com.xworkz.barathpay.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class PaymentTransactionDto {
    private Integer transactionId;
    private Integer payerId;
    private Integer payeeId;
    private double amount;
    private String paymentMethod;
    private String paymentStatus;
}

