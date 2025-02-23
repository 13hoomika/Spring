package com.xworkz.hotelapp.service;

import com.xworkz.hotelapp.dto.BookingDto;
import com.xworkz.hotelapp.entity.BookingEntity;
import com.xworkz.hotelapp.repository.BookingRepository;
import com.xworkz.hotelapp.repository.BookingRepositoryImpl;
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
public class BookingServiceImpl implements BookingService{
    @Autowired
    BookingRepository repository;
    @Override
    public void ValidateAndSave(BookingDto dto) {
        ValidatorFactory validatorFactory = Validation.buildDefaultValidatorFactory();
        Validator validator = validatorFactory.getValidator();
        Set<ConstraintViolation<BookingDto>> validate = validator.validate(dto);
        if (validate.isEmpty()){
            BookingEntity entity = new BookingEntity();
            try {
                BeanUtils.copyProperties(entity,dto);
                repository.save(entity);
                System.out.println(entity);
            } catch (IllegalAccessException e) {
                throw new RuntimeException(e);
            } catch (InvocationTargetException e) {
                throw new RuntimeException(e);
            }
        }else validate.stream().forEach(err-> System.out.println(err.getMessage()));
    }
}
