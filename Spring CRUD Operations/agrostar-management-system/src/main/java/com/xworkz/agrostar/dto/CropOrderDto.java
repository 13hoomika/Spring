package com.xworkz.agrostar.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CropOrderDto {
    private Integer orderId;
    private Integer farmerId;
    private String cropType;
    private double quantity;
    private double totalAmount;
}
