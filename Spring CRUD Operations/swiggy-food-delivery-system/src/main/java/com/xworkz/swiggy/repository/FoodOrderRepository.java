package com.xworkz.swiggy.repository;

import com.xworkz.swiggy.entity.FoodOrderEntity;

public interface FoodOrderRepository {
    Boolean save(FoodOrderEntity entity);
}
