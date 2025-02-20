package com.xworkz.uidaiapp.service;

import com.xworkz.uidaiapp.dto.AadhaarAuthDto;
import com.xworkz.uidaiapp.entity.AadhaarAuthEntity;

import java.util.List;

public interface AadhaarAuthService {
    void ValidateAndSAve(AadhaarAuthDto dto);
    List<AadhaarAuthDto> getAllAadhaar();
    AadhaarAuthEntity getAadhaarById(int id);
    AadhaarAuthEntity getAadhaarByName(String name);
    AadhaarAuthEntity getAadhaarByNumber(Long aNumber);

    void updateDobById(int id, String dateOfBirth);
    Integer updateAddressByName(String name, String address);

    void deleteAadhaarById(int id);
}
