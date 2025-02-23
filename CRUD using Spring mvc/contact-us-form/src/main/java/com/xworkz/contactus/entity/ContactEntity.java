package com.xworkz.contactus.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "contact_us")
@NamedQuery(name = "getRequest", query = "SELECT request FROM ContactEntity request")
@NamedQuery(name = "deleteRecord", query = "DELETE FROM ContactEntity request WHERE request.requesterId=:id")
@NamedQuery(name = "getById", query = "SELECT request FROM ContactEntity request WHERE request.requesterId =: id")
public class ContactEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "requester_id")
    private int requesterId;
    private String name;
    private String email;
    private String category;
    private String message;
    private long phone;
}
