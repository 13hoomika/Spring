package com.xworkz.collegeapp.service;

import com.xworkz.collegeapp.dto.RegisterDto;
import com.xworkz.collegeapp.entity.RegisterEntity;
import com.xworkz.collegeapp.repository.RegisterRepo;
import com.xworkz.collegeapp.repository.RegisterRepoImpl;
import org.apache.commons.beanutils.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

@Service
public class RegisterServiceImpl implements RegisterService {
    @Autowired
    private RegisterRepo registerRepo;

    @Override
    public Boolean validateAndSave(RegisterDto dto) {
        ValidatorFactory validatorFactory = Validation.buildDefaultValidatorFactory();
        Validator validator = validatorFactory.getValidator();
        Set<ConstraintViolation<RegisterDto>> validate = validator.validate(dto);
        if (!validate.isEmpty()) {
            validate.stream().forEach(error -> System.out.println(error.getMessage()));
        } else {
            RegisterEntity registerEntity = new RegisterEntity();
            try {
                BeanUtils.copyProperties(registerEntity, dto);
                System.out.println(registerEntity);
            } catch (IllegalAccessException | InvocationTargetException e) {
                System.out.println(e.getMessage());
            }
            registerRepo.save(registerEntity);
            System.out.println("All fields are validated and saved");
        }
        return null;
    }

    @Override
    public List<RegisterDto> getAllData() {
        List<RegisterEntity> registerEntityList = registerRepo.getAllData();
        List<RegisterDto> registerDtoList = new ArrayList<>();

        if (registerEntityList != null){
            for(RegisterEntity registerEntity : registerEntityList){
                RegisterDto registerDto = new RegisterDto();

                registerDto.setId(registerEntity.getId());
                registerDto.setFullName(registerEntity.getFullName());
                registerDto.setUsn(registerEntity.getUsn());
                registerDto.setEmailId(registerEntity.getEmailId());
                registerDto.setQualification(registerEntity.getQualification());
                registerDto.setContactNumber(registerEntity.getContactNumber());
                registerDto.setYearOfPass(registerEntity.getYearOfPass());

                registerDtoList.add(registerDto);
            }
        }
        return  registerDtoList;
    }

    @Override
    public void deleteById(int id) {
        registerRepo.deleteById(id);
        if (registerRepo != null){
            System.out.println("Registration with id "+id +" deleted successfully");
        }else System.out.println("Given id not found");
    }

    @Override
    public RegisterDto getById(int id){
        RegisterDto dto = new RegisterDto();
        RegisterEntity registerEntity = registerRepo.getById(id);
        if (id>0){
            try {
                BeanUtils.copyProperties(dto,registerEntity);
            } catch (IllegalAccessException | InvocationTargetException e) {
                throw new RuntimeException(e);
            }
        }
        return dto;
    }

    @Override
    public Boolean update(RegisterDto dto){
        RegisterEntity registerEntity = new RegisterEntity();
        try {
            BeanUtils.copyProperties(registerEntity,dto);
            boolean isUpdated = registerRepo.update(registerEntity);
            if (isUpdated){
                System.out.println("Updated successfully");
                return true;
            }else System.out.println("update unsuccessful!! try again later");

        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }

        return false;
    }
}

