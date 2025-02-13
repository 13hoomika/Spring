package com.xworkz.irctc.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Getter
@Setter
@Entity
@ToString
@Table(name = "irctc_details")
public class TicketBookingEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "booking_id")
    private Integer bookingId;
    @Column(name = "passenger_id")
    private Integer passengerId;
    @Column(name = "train_number")
    private Integer trainNumber;
    private String coach;

}
