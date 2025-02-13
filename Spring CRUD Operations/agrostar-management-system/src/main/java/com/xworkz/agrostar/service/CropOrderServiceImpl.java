package com.xworkz.agrostar.service;

import com.xworkz.agrostar.dto.CropOrderDto;
import com.xworkz.agrostar.entity.CropOrderEntity;
import com.xworkz.agrostar.repository.CropOrderRepository;
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
public class CropOrderServiceImpl implements CropOrderService {

    @Autowired
    CropOrderRepository repository;

    @Override
    public void ValidateAndSAve(CropOrderDto dto) {
        ValidatorFactory validatorFactory = Validation.buildDefaultValidatorFactory();
        Validator validator = validatorFactory.getValidator();
        Set<ConstraintViolation<CropOrderDto>> validate = validator.validate(dto);
        if (validate.isEmpty()){
            CropOrderEntity entity = new CropOrderEntity();
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
