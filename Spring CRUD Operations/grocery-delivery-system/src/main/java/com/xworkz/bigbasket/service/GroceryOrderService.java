package com.xworkz.bigbasket.service;

import com.xworkz.bigbasket.dto.GroceryOrderDto;

public interface GroceryOrderService {
    void ValidateAndSAve(GroceryOrderDto dto);
}
