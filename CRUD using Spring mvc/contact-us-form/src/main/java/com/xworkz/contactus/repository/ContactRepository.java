package com.xworkz.contactus.repository;

import com.xworkz.contactus.entity.ContactEntity;

import java.util.List;

public interface ContactRepository {
    Boolean save(ContactEntity entity);
    List<ContactEntity> getContactRequests();
    boolean deleteData(int id);

    ContactEntity getById(int id);
    Boolean update(ContactEntity entity);
}
