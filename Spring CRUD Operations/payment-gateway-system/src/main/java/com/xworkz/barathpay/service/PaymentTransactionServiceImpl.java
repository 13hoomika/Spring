package com.xworkz.barathpay.service;

import com.xworkz.barathpay.dto.PaymentTransactionDto;
import com.xworkz.barathpay.entity.PaymentTransactionEntity;
import com.xworkz.barathpay.repository.PaymentTransactionRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;
import java.util.Set;

@Component
public class PaymentTransactionServiceImpl implements PaymentTransactionService {

    @Autowired
    PaymentTransactionRepository repository;

    @Override
    public void ValidateAndSAve(PaymentTransactionDto dto) {
        ValidatorFactory validatorFactory = Validation.buildDefaultValidatorFactory();
        Validator validator = validatorFactory.getValidator();
        Set<ConstraintViolation<PaymentTransactionDto>> validate = validator.validate(dto);
        if (validate.isEmpty()){
            PaymentTransactionEntity entity = new PaymentTransactionEntity();
            try {
                BeanUtils.copyProperties(dto,entity);
                Boolean saved = repository.save(entity);
                if (saved){
                    System.out.println("Details saved successfully");
                    System.out.println(entity);
                }else System.out.println("Could not save data!! try again later");
            } catch (BeansException e) {
                System.out.println(e.getMessage());
            }

        }else validate.stream()
                .forEach(err -> System.out.println(err.getMessage()));

    }
}
