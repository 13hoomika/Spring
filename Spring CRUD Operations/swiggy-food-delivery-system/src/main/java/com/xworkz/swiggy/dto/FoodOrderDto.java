package com.xworkz.swiggy.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class FoodOrderDto {
    private Integer orderId;
    private String customerName;
    private String restaurantName;
    private String orderStatus;
}

