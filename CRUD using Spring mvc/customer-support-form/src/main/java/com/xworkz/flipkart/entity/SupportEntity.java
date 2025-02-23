package com.xworkz.flipkart.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Table(name = "customer_support")
@NamedQuery(name = "getRequest", query = "SELECT support FROM SupportEntity support")
@NamedQuery(name = "deleteRequest", query = "DELETE SupportEntity support WHERE support.customerId=:id")
@NamedQuery(name = "getById", query = "SELECT support FROM SupportEntity support WHERE support.customerId=:id")
public class SupportEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "customer_id")
    private int customerId;
    private String name;
    private String email;
    private int orderId;
    private String issueType;
    private String description;
}
