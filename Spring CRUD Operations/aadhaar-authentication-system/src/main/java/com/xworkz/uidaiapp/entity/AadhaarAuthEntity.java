package com.xworkz.uidaiapp.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Getter
@Setter
@Entity
@ToString
@Table(name = "uidai_details")
@NamedQuery(name = "getAllDetails", query = "SELECT aadhaar from AadhaarAuthEntity aadhaar")
@NamedQuery(name = "getByName", query = "SELECT aadhaar from AadhaarAuthEntity aadhaar WHERE aadhaar.name =: name")
@NamedQuery(name = "getByNumber", query = "SELECT aadhaar from AadhaarAuthEntity aadhaar WHERE aadhaar.aadhaarNumber =: aNum")

@NamedQuery(name = "updateById",query = "UPDATE AadhaarAuthEntity a set a.dob=:dob where a.uidaiId=:id")
@NamedQuery(name = "updateByName",query = "UPDATE AadhaarAuthEntity a set a.address=:address where a.name=:name")

@NamedQuery(name = "deleteById", query = "DELETE FROM AadhaarAuthEntity a WHERE a.uidaiId=:id")

public class AadhaarAuthEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "uidai_id")
    private Integer uidaiId;
    @Column(name = "aadhaar_number")
    private Long aadhaarNumber;
    private String name;
    private String dob;
    private String address;

}
