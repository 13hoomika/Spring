package com.xworkz.irctc.service;

import com.xworkz.irctc.dto.TicketBookingDto;
import com.xworkz.irctc.entity.TicketBookingEntity;
import com.xworkz.irctc.repository.TicketBookingRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;
import java.util.Set;

@Component
public class TicketBookingServiceImpl implements TicketBookingService {
    @Autowired
    TicketBookingRepository repository;

    @Override
    public void validateAndSave(TicketBookingDto dto) {
        ValidatorFactory validatorFactory = Validation.buildDefaultValidatorFactory();
        Validator validator = validatorFactory.getValidator();
        Set<ConstraintViolation<TicketBookingDto>> validate = validator.validate(dto);
        if (validate.isEmpty()){
            TicketBookingEntity entity = new TicketBookingEntity();
            BeanUtils.copyProperties(dto,entity);
            repository.save(entity);
            System.out.println(entity);
            System.out.println("Data saved successfully");
        }else validate.stream().forEach(err -> System.out.println(err.getMessage()));

    }
}
