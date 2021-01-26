package com.assignment.ticketbooking;

import com.assignment.ticketbooking.model.SeatStatus;
import com.assignment.ticketbooking.system.TicketCounter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookingController {

    @Autowired
    TicketCounter ticketCounter;

    @RequestMapping("/getSeats")
    public SeatStatus[][] getAvailableSeats() {
        return ticketCounter.getSeatView();
    }

}