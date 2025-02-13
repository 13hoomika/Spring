package com.xworkz.bigbasket.service;

import com.xworkz.bigbasket.dto.GroceryOrderDto;
import com.xworkz.bigbasket.entity.GroceryOrderEntity;
import com.xworkz.bigbasket.repository.GroceryOrderRepository;
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
public class GroceryOrderServiceImpl implements GroceryOrderService {

    @Autowired
    GroceryOrderRepository repository;

    @Override
    public void ValidateAndSAve(GroceryOrderDto dto) {
        ValidatorFactory validatorFactory = Validation.buildDefaultValidatorFactory();
        Validator validator = validatorFactory.getValidator();
        Set<ConstraintViolation<GroceryOrderDto>> validate = validator.validate(dto);
        if (validate.isEmpty()){
            GroceryOrderEntity entity = new GroceryOrderEntity();
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
