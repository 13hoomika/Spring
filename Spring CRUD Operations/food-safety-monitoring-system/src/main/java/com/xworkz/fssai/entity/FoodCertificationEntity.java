package com.xworkz.fssai.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Getter
@Setter
@Entity
@ToString
@Table(name = "fssai_details")
public class FoodCertificationEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "certification_id")
    private Integer certificationId;
    private Integer foodBusinessId;
    private String foodBusinessName;
    private String issueDate;

}
