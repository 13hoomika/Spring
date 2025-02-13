package com.xworkz.vedantu.service;

import com.xworkz.vedantu.dto.CourseEnrollmentDto;
import com.xworkz.vedantu.entity.CourseEnrollmentEntity;
import com.xworkz.vedantu.repository.CourseEnrollmentRepository;
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
public class CourseEnrollmentServiceImpl implements CourseEnrollmentService {

    @Autowired
    CourseEnrollmentRepository repository;

    @Override
    public void ValidateAndSAve(CourseEnrollmentDto dto) {
        ValidatorFactory validatorFactory = Validation.buildDefaultValidatorFactory();
        Validator validator = validatorFactory.getValidator();
        Set<ConstraintViolation<CourseEnrollmentDto>> validate = validator.validate(dto);
        if (validate.isEmpty()){
            CourseEnrollmentEntity entity = new CourseEnrollmentEntity();
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
