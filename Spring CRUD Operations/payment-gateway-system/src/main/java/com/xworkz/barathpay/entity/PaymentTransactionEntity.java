package com.xworkz.barathpay.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Getter
@Setter
@Entity
@ToString
@Table(name = "barathpay_details")
public class PaymentTransactionEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "transaction_id")
    private Integer transactionId;
    private Integer payerId;
    private Integer payeeId;
    private double amount;
    private String paymentMethod;
    private String paymentStatus;

}
