package com.xworkz.barathpay.runner;

import com.xworkz.barathpay.configuration.SpringConfiguration;
import com.xworkz.barathpay.dto.PaymentTransactionDto;
import com.xworkz.barathpay.service.PaymentTransactionService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SaveRunner {
    public static void main(String[] args) {
        ApplicationContext ac = new AnnotationConfigApplicationContext(SpringConfiguration.class);
        PaymentTransactionService productService = ac.getBean(PaymentTransactionService.class);
        PaymentTransactionDto dto = new PaymentTransactionDto();
        dto.setPayerId(101);
        dto.setPayeeId(202);
        dto.setAmount(50.00);
        dto.setPaymentMethod("Barath Pay");
        dto.setPaymentStatus("canceled");
        productService.ValidateAndSAve(dto);
    }
}
