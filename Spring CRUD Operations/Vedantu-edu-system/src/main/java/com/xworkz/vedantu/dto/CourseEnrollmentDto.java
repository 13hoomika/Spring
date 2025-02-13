package com.xworkz.vedantu.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CourseEnrollmentDto {
    private Integer enrollmentId;
    private String studentName;
    private String courseName;
    private String courseStatus;
    private String enrollmentDate;
}

