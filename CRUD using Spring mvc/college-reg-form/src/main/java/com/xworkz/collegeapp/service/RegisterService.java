package com.xworkz.collegeapp.service;

import com.xworkz.collegeapp.dto.RegisterDto;

import java.util.List;

public interface RegisterService {
    Boolean validateAndSave(RegisterDto dto);
    List<RegisterDto> getAllData();
    void deleteById(int id);

    RegisterDto getById(int id);
    Boolean update(RegisterDto dto);
}
