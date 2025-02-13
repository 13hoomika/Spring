package com.xworkz.magicbricks.service;

import com.xworkz.magicbricks.dto.PropertyListDto;
import com.xworkz.magicbricks.entity.PropertyListEntity;
import com.xworkz.magicbricks.repository.PropertyListRepository;
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
public class PropertyListServiceImpl implements PropertyListService {

    @Autowired
    PropertyListRepository repository;

    @Override
    public void ValidateAndSAve(PropertyListDto dto) {
        ValidatorFactory validatorFactory = Validation.buildDefaultValidatorFactory();
        Validator validator = validatorFactory.getValidator();
        Set<ConstraintViolation<PropertyListDto>> validate = validator.validate(dto);
        if (validate.isEmpty()){
            PropertyListEntity entity = new PropertyListEntity();
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
