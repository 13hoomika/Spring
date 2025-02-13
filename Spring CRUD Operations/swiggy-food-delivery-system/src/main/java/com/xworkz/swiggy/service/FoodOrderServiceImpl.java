package com.xworkz.swiggy.service;

import com.xworkz.swiggy.dto.FoodOrderDto;
import com.xworkz.swiggy.entity.FoodOrderEntity;
import com.xworkz.swiggy.repository.FoodOrderRepository;
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
public class FoodOrderServiceImpl implements FoodOrderService {

    @Autowired
    FoodOrderRepository repository;

    @Override
    public void ValidateAndSAve(FoodOrderDto dto) {
        ValidatorFactory validatorFactory = Validation.buildDefaultValidatorFactory();
        Validator validator = validatorFactory.getValidator();
        Set<ConstraintViolation<FoodOrderDto>> validate = validator.validate(dto);
        if (validate.isEmpty()){
            FoodOrderEntity entity = new FoodOrderEntity();
            try {
                BeanUtils.copyProperties(dto,entity);
                repository.save(entity);
                System.out.println("Details saved successfully");
                System.out.println(entity);
            } catch (BeansException e) {
                System.out.println(e.getMessage());
            }

        }else validate.stream()
                .forEach(err -> System.out.println(err.getMessage()));

    }
}
