package com.xworkz.magicbricks.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class PropertyListDto {
    private Integer listId;
    private String propertyType;
    private String address;
    private double price;
    private String ownerName;
}

