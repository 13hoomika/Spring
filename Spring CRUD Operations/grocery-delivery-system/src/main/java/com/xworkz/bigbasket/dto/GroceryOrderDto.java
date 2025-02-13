package com.xworkz.bigbasket.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class GroceryOrderDto {
    private Integer orderId;
    private Integer customerId;
    private double totalAmount;
    private String status;
}
