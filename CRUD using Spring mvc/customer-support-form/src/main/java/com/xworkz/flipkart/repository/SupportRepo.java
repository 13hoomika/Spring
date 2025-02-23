package com.xworkz.flipkart.repository;

import com.xworkz.flipkart.entity.SupportEntity;

import java.util.List;

public interface SupportRepo {
    Boolean save(SupportEntity entity);
    List<SupportEntity> getRequests();
    boolean deleteRequest(int id);

    SupportEntity findById(int id);
    Boolean updateForm(SupportEntity entity);
}
