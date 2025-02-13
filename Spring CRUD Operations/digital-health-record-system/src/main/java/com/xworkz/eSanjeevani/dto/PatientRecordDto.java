package com.xworkz.eSanjeevani.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class PatientRecordDto {
    private Integer patientId;
    private String patientName;
    private String diseaseHistory;
    private String prescribedMedication;
}

