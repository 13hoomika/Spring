package com.xworkz.indiapost.service;

import com.xworkz.indiapost.dto.ParcelTrackingDto;
import com.xworkz.indiapost.entity.ParcelTrackingEntity;
import com.xworkz.indiapost.repository.ParcelTrackingRepository;
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
public class ParcelTrackingServiceImpl implements ParcelTrackingService {

    @Autowired
    ParcelTrackingRepository repository;

    @Override
    public void ValidateAndSAve(ParcelTrackingDto dto) {
        ValidatorFactory validatorFactory = Validation.buildDefaultValidatorFactory();
        Validator validator = validatorFactory.getValidator();
        Set<ConstraintViolation<ParcelTrackingDto>> validate = validator.validate(dto);
        if (validate.isEmpty()){
            ParcelTrackingEntity entity = new ParcelTrackingEntity();
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
