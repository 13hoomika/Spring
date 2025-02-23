package com.xworkz.collegeapp.repository;

import com.xworkz.collegeapp.entity.RegisterEntity;

import java.util.List;

public interface RegisterRepo {
    Boolean save(RegisterEntity registerEntity);
    List<RegisterEntity> getAllData();
    boolean deleteById(int id);

    RegisterEntity getById(int id);
    Boolean update(RegisterEntity entity);
}
