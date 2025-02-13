package com.xworkz.irctc.runner;

import com.xworkz.irctc.configuration.SpringConfiguration;
import com.xworkz.irctc.dto.TicketBookingDto;
import com.xworkz.irctc.service.TicketBookingService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SaveTicketRunner {
    public static void main(String[] args) {
        ApplicationContext ac = new AnnotationConfigApplicationContext(SpringConfiguration.class);
        TicketBookingService service = ac.getBean(TicketBookingService.class);
        TicketBookingDto bookingDto = new TicketBookingDto();
        bookingDto.setPassengerId(103);
        bookingDto.setCoach("S9");
        bookingDto.setTrainNumber(65471);

        service.validateAndSave(bookingDto);
    }
}
