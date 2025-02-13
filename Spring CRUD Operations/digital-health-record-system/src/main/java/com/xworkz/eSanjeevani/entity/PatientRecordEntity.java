package com.xworkz.eSanjeevani.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Getter
@Setter
@Entity
@ToString
@Table(name = "health_rec_details")
public class PatientRecordEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "patient_id")
    private Integer patientId;
    @Column(name = "patient_name")
    private String patientName;
    @Column(name = "disease_history")
    private String diseaseHistory;
    @Column(name = "prescribed_medication")
    private String prescribedMedication;

}
