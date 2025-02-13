package com.xworkz.nsp.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ScholarshipApplicationDto {
    private Integer applicationId;
    private String studentName;
    private double amountRequested;
    private String status;
}

