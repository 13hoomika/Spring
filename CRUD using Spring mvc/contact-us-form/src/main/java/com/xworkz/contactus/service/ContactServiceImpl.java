package com.xworkz.contactus.service;

import com.xworkz.contactus.dto.ContactDto;
import com.xworkz.contactus.entity.ContactEntity;
import com.xworkz.contactus.repository.ContactRepository;
import com.xworkz.contactus.repository.ContactRepositoryImpl;
import org.apache.commons.beanutils.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

@Service
public class ContactServiceImpl implements ContactService {
    @Autowired
    ContactRepository repository;

    @Override
    public void processAndSave(ContactDto dto) {
        ValidatorFactory validatorFactory = Validation.buildDefaultValidatorFactory();
        Validator validator = validatorFactory.getValidator();
        Set<ConstraintViolation<ContactDto>> validate = validator.validate(dto);
        if (validate.isEmpty()){
            ContactEntity entity = new ContactEntity();
            try {
                BeanUtils.copyProperties(entity,dto);
                repository.save(entity);
                System.out.println(entity);
            } catch (IllegalAccessException e) {
                throw new RuntimeException(e);
            } catch (InvocationTargetException e) {
                throw new RuntimeException(e);
            }
        }else validate.stream().forEach(err -> System.out.println(err.getMessage()));

    }

    @Override
    public List<ContactDto> getAllRequests() {
        List<ContactEntity> allRequests = repository.getContactRequests();
        List<ContactDto> contactDtos = new ArrayList<>();
        if (allRequests != null){
            for (ContactEntity contactEntity: allRequests){
                ContactDto contactDto = new ContactDto();

                contactDto.setRequesterId(contactEntity.getRequesterId());
                contactDto.setName(contactEntity.getName());
                contactDto.setPhone(contactEntity.getPhone());
                contactDto.setMessage(contactEntity.getMessage());
                contactDto.setEmail(contactEntity.getEmail());
                contactDto.setCategory(contactEntity.getCategory());

                contactDtos.add(contactDto);
            }
        }else {
            System.out.println("No requests found.");
        }
        return contactDtos;
    }

    @Override
    public void deleteRequests(int id) {
        repository.deleteData(id);
        if (repository != null){
            System.out.println("Requester id "+id +" deleted successfully");
        }else System.out.println("Given id not found");
    }

    @Override
    public ContactDto getById(int id) {
        ContactDto dto = new ContactDto();
        ContactEntity byIdEntity = repository.getById(id);
        if (id > 0 || id != 0){
            try {
                BeanUtils.copyProperties(dto,byIdEntity);
            } catch (IllegalAccessException | InvocationTargetException e) {
                throw new RuntimeException(e);
            }
        }
        return dto;
    }

    @Override
    public Boolean updateRequest(ContactDto dto) {
        ContactEntity entity = new ContactEntity();
        try {
            BeanUtils.copyProperties(entity,dto);
            boolean isUpdated = repository.update(entity);
            if (isUpdated){
                System.out.println("Contact request updated successfully");
                return true;
            }else System.out.println("Contact request could not be updated!!");
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
        return false;
    }
}
