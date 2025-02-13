package com.xworkz.nammametro.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Getter
@Setter
@Entity
@ToString
@Table(name = "metro_details")
public class MetroTicketEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ticket_id")
    private Integer ticketId;
    @Column(name = "passenger_name")
    private String passengerName;
    @Column(name = "from_Station")
    private String fromStation;
    @Column(name = "to_Station")
    private String toStation;
    private double fare;

}
