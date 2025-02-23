package com.xworkz.flipkart.service;

import com.xworkz.flipkart.dto.SupportDto;
import com.xworkz.flipkart.entity.SupportEntity;
import com.xworkz.flipkart.repository.SupportRepo;
import com.xworkz.flipkart.repository.SupportRepoImpl;
import org.apache.commons.beanutils.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.imageio.spi.ServiceRegistry;
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
public class SupportServiceImpl implements SupportService{
    @Autowired
    SupportRepo repo;
    @Override
    public void validateAndSave(SupportDto dto) {
        ValidatorFactory vf = Validation.buildDefaultValidatorFactory();
        Validator validator = vf.getValidator();
        Set<ConstraintViolation<SupportDto>> validate = validator.validate(dto);
        if (validate.isEmpty()){
            SupportEntity entity = new SupportEntity();
            try {
                BeanUtils.copyProperties(entity, dto);
                repo.save(entity);
                System.out.println(entity);
            } catch (IllegalAccessException e) {
                throw new RuntimeException(e);
            } catch (InvocationTargetException e) {
                throw new RuntimeException(e);
            }
        }else {
            validate.stream().forEach(err -> System.out.println(err.getMessage()));
        }
    }

    @Override
    public List<SupportDto> getAllRequests() {
        List<SupportEntity> allRequests = repo.getRequests();
        List<SupportDto> dtoList = new ArrayList<>();
        if (allRequests != null){
            for (SupportEntity entity: allRequests){
                SupportDto dto = new SupportDto();

                dto.setCustomerId(entity.getCustomerId());
                dto.setName(entity.getName());
                dto.setEmail(entity.getEmail());
                dto.setOrderId(entity.getOrderId());
                dto.setIssueType(entity.getIssueType());
                dto.setDescription(entity.getDescription());

                dtoList.add(dto);
            }
        }else {
            System.out.println("No requests found.");
        }
        return dtoList;
    }

    @Override
    public void deleteRequests(int id) {
        repo.deleteRequest(id);
        if (repo != null){
            System.out.println("customer id" + id + " deleted successfully");
        }else System.out.println("Given id not found");
    }

    @Override
    public SupportDto getById(int id) {
        SupportDto dto = new SupportDto();
        if (id > 0){
            SupportEntity byIdEntity = repo.findById(id);
            try {
                BeanUtils.copyProperties(dto,byIdEntity);
            } catch (InvocationTargetException | IllegalAccessException e) {
                System.out.println(e.getMessage());
            }

        }
        return dto;
    }

    @Override
    public Boolean updateForm(SupportDto supportDto) {
        SupportEntity supportEntity = new SupportEntity();
        try {
            BeanUtils.copyProperties(supportEntity,supportDto);
            boolean isUpdated = repo.updateForm(supportEntity);
            if (isUpdated){
                System.out.println("Form updated");
                return true;
            }else System.out.println("Update unsuccessful");
        } catch (IllegalAccessException | InvocationTargetException e) {
            System.out.println(e.getMessage());
        }
        return false;
    }
}
