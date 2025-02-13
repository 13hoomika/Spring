package com.xworkz.eSanjeevani.service;

import com.xworkz.eSanjeevani.dto.PatientRecordDto;
import com.xworkz.eSanjeevani.entity.PatientRecordEntity;
import com.xworkz.eSanjeevani.repository.PatientRecordRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;
import java.util.Set;

@Component
public class PatientRecordServiceImpl implements PatientRecordService {

    @Autowired
    PatientRecordRepository repository;

    @Override
    public void ValidateAndSAve(PatientRecordDto dto) {
        ValidatorFactory validatorFactory = Validation.buildDefaultValidatorFactory();
        Validator validator = validatorFactory.getValidator();
        Set<ConstraintViolation<PatientRecordDto>> validate = validator.validate(dto);
        PatientRecordEntity entity = new PatientRecordEntity();
        BeanUtils.copyProperties(dto,entity);
        repository.save(entity);
        System.out.println(entity);
        System.out.println("Data saved successfully");
    }
}
