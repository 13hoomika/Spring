package com.xworkz.collegeapp.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "college_reg")
@ToString
@NamedQuery(name = "getAllDataQuery", query = "SELECT register FROM RegisterEntity register")
@NamedQuery(name = "deleteByIdQuery", query = "DELETE RegisterEntity register where register.id =:id")
@NamedQuery(name = "getById", query = "SELECT register FROM RegisterEntity register where register.id =:id")
public class RegisterEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String fullName;
    private Long contactNumber;
    private String qualification;
    private String emailId;
    private String usn;
    private int yearOfPass;
}
