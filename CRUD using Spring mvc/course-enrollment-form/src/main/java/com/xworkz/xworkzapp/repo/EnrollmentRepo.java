package com.xworkz.xworkzapp.repo;

import com.xworkz.xworkzapp.entity.EnrollmentEntity;

import java.util.List;

public interface EnrollmentRepo {
    Boolean save(EnrollmentEntity entity);
    List<EnrollmentEntity> getAllEnrollments();
    Boolean delete(int id);

    EnrollmentEntity getById(int id);
    Boolean updateEnrollment(EnrollmentEntity entity);

}
