package com.xworkz.uidaiapp.service;

import com.xworkz.uidaiapp.dto.AadhaarAuthDto;
import com.xworkz.uidaiapp.entity.AadhaarAuthEntity;
import com.xworkz.uidaiapp.repository.AadhaarAuthRepository;
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
public class AadhaarAuthServiceImpl implements AadhaarAuthService {

    @Autowired
    AadhaarAuthRepository repository;

    @Override
    public void ValidateAndSAve(AadhaarAuthDto dto) {
        ValidatorFactory validatorFactory = Validation.buildDefaultValidatorFactory();
        Validator validator = validatorFactory.getValidator();
        Set<ConstraintViolation<AadhaarAuthDto>> validate = validator.validate(dto);
        if (validate.isEmpty()){
            AadhaarAuthEntity entity = new AadhaarAuthEntity();
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
