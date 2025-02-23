package com.xworkz.jobhuntapp.service;

import com.xworkz.jobhuntapp.dto.ApplicationDto;
import com.xworkz.jobhuntapp.entity.ApplicationEntity;
import com.xworkz.jobhuntapp.repo.ApplicationRepo;
import com.xworkz.jobhuntapp.repo.ApplicationRepoImpl;
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
public class ApplicationServiceImpl implements ApplicationService{
    @Autowired
    ApplicationRepo applicationRepo;
    @Override
    public void ValidateAndStore(ApplicationDto dto) {
        ValidatorFactory validatorFactory = Validation.buildDefaultValidatorFactory();
        Validator validator = validatorFactory.getValidator();
        Set<ConstraintViolation<ApplicationDto>> validate = validator.validate(dto);
        if (validate.isEmpty()){
            ApplicationEntity entity = new ApplicationEntity();
            try {
                BeanUtils.copyProperties(entity,dto);
                applicationRepo.store(entity);
                System.out.println(entity);
            } catch (IllegalAccessException e) {
                throw new RuntimeException(e);
            } catch (InvocationTargetException e) {
                throw new RuntimeException(e);
            }
        }else validate.stream().forEach(err -> System.out.println(err.getMessage()));

    }
}
