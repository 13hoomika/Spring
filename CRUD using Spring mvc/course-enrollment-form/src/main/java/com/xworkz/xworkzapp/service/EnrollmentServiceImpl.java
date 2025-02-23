package com.xworkz.xworkzapp.service;

import com.xworkz.xworkzapp.dto.EnrollmentDto;
import com.xworkz.xworkzapp.entity.EnrollmentEntity;
import com.xworkz.xworkzapp.repo.EnrollmentRepo;
import com.xworkz.xworkzapp.repo.EnrollmentRepoImpl;
import org.apache.commons.beanutils.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
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
public class EnrollmentServiceImpl implements EnrollmentService{
    @Autowired
    EnrollmentRepo repo;

    @Override
    public void validateAndPersist(EnrollmentDto dto){
        ValidatorFactory validatorFactory = Validation.buildDefaultValidatorFactory();
        Validator validator = validatorFactory.getValidator();
        Set<ConstraintViolation<EnrollmentDto>> validate = validator.validate(dto);
        if (validate.isEmpty()){
            EnrollmentEntity entity = new EnrollmentEntity();
            try {
                BeanUtils.copyProperties(entity,dto);
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
    public List<EnrollmentDto> getAllEnrollments() {
        List<EnrollmentEntity> allEnrollments = repo.getAllEnrollments();
        System.out.println("Fetched enrollments: " + allEnrollments);

        List<EnrollmentDto> enrollmentDtos = new ArrayList<>();
        if (allEnrollments != null && !allEnrollments.isEmpty()) {
            for (EnrollmentEntity enrollment : allEnrollments) {
                EnrollmentDto dto = new EnrollmentDto();
                dto.setStudentId(enrollment.getStudentId());
                dto.setName(enrollment.getName());
                dto.setEmail(enrollment.getEmail());
                dto.setCourseName(enrollment.getCourseName());
                dto.setStartDate(enrollment.getStartDate());
                dto.setComments(enrollment.getComments());

                enrollmentDtos.add(dto);
            }
        } else {
            System.out.println("No records found!!");
        }
        return enrollmentDtos;
    }


    @Override
    public void deleteEnrollments(int id) {
        repo.delete(id);
        if (repo != null){
            System.out.println("Enrollment" +id + "deleted successfully");
        }else System.out.println("given id not found");
    }

    @Override
    public EnrollmentDto getById(int id) {
        EnrollmentDto enrollmentDto = new EnrollmentDto();
        EnrollmentEntity getByIdEntity = repo.getById(id);
        if (id > 0 || id != 0){
            try {
                BeanUtils.copyProperties(enrollmentDto,getByIdEntity);
            } catch (InvocationTargetException | IllegalAccessException e) {
                System.out.println(e.getMessage());
            }
        }
        return enrollmentDto;
    }

    @Override
    public Boolean updateEnrollment(EnrollmentDto dto) {
        EnrollmentEntity enrollmentEntity = new EnrollmentEntity();
        try {
            BeanUtils.copyProperties(enrollmentEntity,dto);
            boolean isUpdated = repo.updateEnrollment(enrollmentEntity);
            if (isUpdated){
                System.out.println("Enrollment updated successfully");
                return true;
            }else System.out.println("Updated unsuccessful!!");
        } catch (IllegalAccessException | InvocationTargetException e) {
            System.out.println(e.getMessage());
        }
        return false;
    }
}
