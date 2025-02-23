package com.xworkz.contactus.service;

import com.sun.org.apache.xpath.internal.operations.Bool;
import com.xworkz.contactus.dto.ContactDto;

import java.util.List;

public interface ContactService {
    void processAndSave(ContactDto dto);
    List<ContactDto> getAllRequests();
    void deleteRequests(int id);

    ContactDto getById(int id);
    Boolean updateRequest(ContactDto dto);
}
