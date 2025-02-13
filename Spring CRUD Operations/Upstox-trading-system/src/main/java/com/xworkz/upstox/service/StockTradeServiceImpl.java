package com.xworkz.upstox.service;

import com.xworkz.upstox.dto.StockTradeDto;
import com.xworkz.upstox.entity.StockTradeEntity;
import com.xworkz.upstox.repository.StockTradeRepository;
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
public class StockTradeServiceImpl implements StockTradeService {

    @Autowired
    StockTradeRepository repository;

    @Override
    public void ValidateAndSAve(StockTradeDto dto) {
        ValidatorFactory validatorFactory = Validation.buildDefaultValidatorFactory();
        Validator validator = validatorFactory.getValidator();
        Set<ConstraintViolation<StockTradeDto>> validate = validator.validate(dto);
        if (validate.isEmpty()){
            StockTradeEntity entity = new StockTradeEntity();
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
