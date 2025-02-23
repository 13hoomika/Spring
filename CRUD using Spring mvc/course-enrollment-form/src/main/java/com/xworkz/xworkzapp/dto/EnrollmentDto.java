package com.xworkz.xworkzapp.dto;

import lombok.Data;

@Data
public class EnrollmentDto {
    private int studentId;
    public String name;
    public String email;
    public String courseName;
    public String startDate;
    public String comments;
}

