package com.xworkz.collegeapp.dto;

import lombok.*;

@Getter
@Setter
@ToString
@NoArgsConstructor
public class RegisterDto {
    private Integer id;
    private String fullName;
    private Long contactNumber;
    private String qualification;
    private String emailId;
    private String usn;
    private int yearOfPass;
}
