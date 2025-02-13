package com.xworkz.nammametro.service;

import com.xworkz.nammametro.dto.MetroTicketDto;
import com.xworkz.nammametro.entity.MetroTicketEntity;
import com.xworkz.nammametro.repository.MetroTicketRepository;
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
public class MetroTicketServiceImpl implements MetroTicketService {

    @Autowired
    MetroTicketRepository repository;

    @Override
    public void ValidateAndSAve(MetroTicketDto dto) {
        ValidatorFactory validatorFactory = Validation.buildDefaultValidatorFactory();
        Validator validator = validatorFactory.getValidator();
        Set<ConstraintViolation<MetroTicketDto>> validate = validator.validate(dto);
        if (validate.isEmpty()){
            MetroTicketEntity entity = new MetroTicketEntity();
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
