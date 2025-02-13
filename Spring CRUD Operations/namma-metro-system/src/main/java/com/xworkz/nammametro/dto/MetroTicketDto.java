package com.xworkz.nammametro.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class MetroTicketDto {
    private Integer ticketId;
    private String passengerName;
    private String fromStation;
    private String toStation;
    private double fare;
}

