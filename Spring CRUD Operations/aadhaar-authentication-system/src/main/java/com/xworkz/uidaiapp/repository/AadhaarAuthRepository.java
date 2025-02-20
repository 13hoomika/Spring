package com.xworkz.uidaiapp.repository;

import com.xworkz.uidaiapp.entity.AadhaarAuthEntity;

import java.util.List;

public interface AadhaarAuthRepository {
    Boolean save(AadhaarAuthEntity entity);
    List<AadhaarAuthEntity> getAllAadhaar();
    AadhaarAuthEntity getById(int id);
    AadhaarAuthEntity getByName(String name);
    AadhaarAuthEntity getByAadhaarNumber(Long aadhaarNum);
    Integer updateDobById(int id, String dateOfBirth);
    Integer updateAddressByName(String name, String address);
    Integer deleteAadhaarById(int id);


}
