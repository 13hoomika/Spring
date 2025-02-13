package com.xworkz.swiggy.service;

import com.xworkz.swiggy.dto.FoodOrderDto;

public interface FoodOrderService {
    void ValidateAndSAve(FoodOrderDto dto);
}
