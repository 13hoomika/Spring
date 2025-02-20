package com.xworkz.uidaiapp.dto;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

@Builder
public class AadhaarAuthDto {
    private Integer uidaiId;
    private Long aadhaarNumber;
    private String name;
    private String dob;
    private String address;
}
