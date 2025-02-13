package com.xworkz.fssai.service;

import com.xworkz.fssai.dto.FoodCertificationDto;
import com.xworkz.fssai.entity.FoodCertificationEntity;
import com.xworkz.fssai.repository.FoodCertificationRepository;
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
public class FoodCertificationServiceImpl implements FoodCertificationService {

    @Autowired
    FoodCertificationRepository repository;

    @Override
    public void ValidateAndSAve(FoodCertificationDto dto) {
        ValidatorFactory validatorFactory = Validation.buildDefaultValidatorFactory();
        Validator validator = validatorFactory.getValidator();
        Set<ConstraintViolation<FoodCertificationDto>> validate = validator.validate(dto);
        if (validate.isEmpty()){
            FoodCertificationEntity entity = new FoodCertificationEntity();
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
