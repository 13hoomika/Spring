package com.xworkz.magicbricks.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Getter
@Setter
@Entity
@ToString
@Table(name = "magicbricks_details")
public class PropertyListEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "list_id")
    private Integer listId;
    @Column(name = "property_type")
    private String propertyType;
    private String address;
    private double price;
    private String ownerName;

}
