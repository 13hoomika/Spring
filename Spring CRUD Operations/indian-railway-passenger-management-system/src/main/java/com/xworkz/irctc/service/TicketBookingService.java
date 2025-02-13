package com.xworkz.irctc.service;

import com.xworkz.irctc.dto.TicketBookingDto;

public interface TicketBookingService {
    void validateAndSave(TicketBookingDto dto);
}
