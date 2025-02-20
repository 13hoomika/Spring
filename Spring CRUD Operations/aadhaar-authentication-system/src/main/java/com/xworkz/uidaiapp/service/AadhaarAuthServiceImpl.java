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
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
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

    @Override
    public List<AadhaarAuthDto> getAllAadhaar() {
        List<AadhaarAuthEntity> entityList = repository.getAllAadhaar();
        List<AadhaarAuthDto> dtoList = new ArrayList<>();
        if (entityList != null){
            for (AadhaarAuthEntity entity : entityList){
                AadhaarAuthDto dto = new AadhaarAuthDto();
                dto.setUidaiId(entity.getUidaiId());
                dto.setName(entity.getName());
                dto.setAadhaarNumber(entity.getAadhaarNumber());
                dto.setDob(entity.getDob());
                dto.setAddress(entity.getAddress());

                dtoList.add(dto);
                // print in terminal
                System.out.println(entity);
            }
        }else System.out.println("could not show any details try again!!");
        return dtoList;
    }

    @Override
    public AadhaarAuthEntity getAadhaarById(int id) {
        AadhaarAuthEntity entity = repository.getById(id);
        if (entity != null){
            System.out.println("Aadhaar with id " + id + " found\n" + entity);
        }else System.out.println("Aadhaar with id not found");

        return entity;
    }

    @Override
    public AadhaarAuthEntity getAadhaarByName(String name) {
        if (name == null && name.isEmpty()){
            System.out.println("Error: Invalid Name. Please ensure it is not blank or null.");
        }
        AadhaarAuthEntity entity = repository.getByName(name);
        if (entity != null){
            System.out.println("Aadhaar found: " + entity);
        }else System.out.println("Aadhaar name not found. Please ensure your name matches the one registered with Aadhaar");
    return entity;
    }

    @Override
    public AadhaarAuthEntity getAadhaarByNumber(Long aNumber) {
        if (aNumber == 0) {
            System.out.println("Error: Invalid Aadhaar Number. Please ensure it is not blank or null.");
            return null;
        }
        AadhaarAuthEntity entity = repository.getByAadhaarNumber(aNumber);
        if (entity != null) {
            System.out.println("Aadhaar found: " + entity);
        } else {
            System.out.println("Invalid Aadhaar number. Please verify and try again.");
        }
        return entity;
    }

    @Override
    public void updateDobById(int id, String dateOfBirth) {
        Integer row = repository.updateDobById(id, dateOfBirth);
        if (row > 0){
            System.out.println(row +" row Updated successfully");
        }else System.out.println("Update failed");
    }

    @Override
    public Integer updateAddressByName(String name, String address) {
        Integer row = repository.updateAddressByName(name, address);
        if (row > 0){
            System.out.println( row + " row Updated successfully");
        }else System.out.println("Update failed");
        return row;
    }

    @Override
    public void deleteAadhaarById(int id) {
        Integer row = repository.deleteAadhaarById(id);
        if (row > 0) {
            System.out.println("Aadhaar with Id " + id + " is deleted");
        }else System.out.println("Aadhaar with Id " + id + " could not be deleted");
    }
}
