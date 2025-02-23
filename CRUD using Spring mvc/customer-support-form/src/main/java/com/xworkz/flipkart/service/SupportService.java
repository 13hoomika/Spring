package com.xworkz.flipkart.service;

import com.xworkz.flipkart.dto.SupportDto;

import java.util.List;

public interface SupportService {
    void validateAndSave(SupportDto dto);
    List<SupportDto> getAllRequests();
    void deleteRequests(int id);

    SupportDto getById(int id);
    Boolean updateForm(SupportDto supportDto);
}
