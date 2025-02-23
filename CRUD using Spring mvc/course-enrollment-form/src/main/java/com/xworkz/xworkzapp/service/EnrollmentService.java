package com.xworkz.xworkzapp.service;

import com.xworkz.xworkzapp.dto.EnrollmentDto;
import com.xworkz.xworkzapp.entity.EnrollmentEntity;

import java.lang.reflect.InvocationTargetException;
import java.util.List;

public interface EnrollmentService {
    void validateAndPersist(EnrollmentDto dto);
    List<EnrollmentDto> getAllEnrollments();
    void deleteEnrollments(int id);

    EnrollmentDto getById(int id);
    Boolean updateEnrollment(EnrollmentDto dto);
}
