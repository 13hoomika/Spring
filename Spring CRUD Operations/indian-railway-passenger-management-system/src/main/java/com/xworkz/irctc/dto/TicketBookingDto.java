package com.xworkz.irctc.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class TicketBookingDto {
    private Integer bookingId;
    private Integer passengerId;
    private Integer trainNumber;
    private String coach;
}
