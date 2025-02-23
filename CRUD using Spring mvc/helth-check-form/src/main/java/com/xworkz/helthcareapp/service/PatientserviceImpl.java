package com.xworkz.helthcareapp.service;

import com.xworkz.helthcareapp.dto.PatientDto;
import com.xworkz.helthcareapp.entity.PatientEntity;
import com.xworkz.helthcareapp.repo.PatientRepository;
import com.xworkz.helthcareapp.repo.PatientRepositoryImpl;
import org.apache.commons.beanutils.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;
import java.lang.reflect.InvocationTargetException;
import java.util.Set;
@Service
public class PatientserviceImpl implements PatientService{
    @Autowired
    PatientRepository repository;
    @Override
    public void validateAndSave(PatientDto dto) {
        ValidatorFactory validatorFactory = Validation.buildDefaultValidatorFactory();
        Validator validator = validatorFactory.getValidator();
        Set<ConstraintViolation<PatientDto>> validate = validator.validate(dto);
        if (validate.isEmpty()){
            PatientEntity patientEntity = new PatientEntity();
            try {
                BeanUtils.copyProperties(patientEntity,dto);
                repository.save(patientEntity);
                System.out.println(patientEntity);
            } catch (IllegalAccessException e) {
                throw new RuntimeException(e);
            } catch (InvocationTargetException e) {
                throw new RuntimeException(e);
            }
        }else validate.stream().forEach(err -> System.out.println(err.getMessage()));

    }
}
