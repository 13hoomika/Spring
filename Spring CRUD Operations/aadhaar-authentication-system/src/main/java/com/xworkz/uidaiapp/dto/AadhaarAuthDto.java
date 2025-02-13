package com.xworkz.uidaiapp.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class AadhaarAuthDto {
    private Integer uidaiId;
    private Long aadhaarNumber;
    private String name;
    private String dob;
    private String address;
}
