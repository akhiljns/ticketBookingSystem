package com.assignment.ticketbooking.system;

import java.util.List;

import com.assignment.ticketbooking.model.Seat;
import com.assignment.ticketbooking.model.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookingService extends Thread {

    @Autowired
    TicketCounter ticketCounter;
    
    private User customer;
    private List<Seat> listOfSeatsToBook;

    public BookingService(TicketCounter ticketCounter, User custoUser, List<Seat> seatList) {
        this.ticketCounter = ticketCounter;
        customer = new User();
        this.customer.setUserId(custoUser.getUserId());
        this.customer.setName(custoUser.getName());
        this.customer.setMobNo(custoUser.getMobNo());
        this.customer.setEmailId(custoUser.getEmailId());
        this.listOfSeatsToBook = seatList;
    }

    @Override
    public void run() {
        ticketCounter.bookTicket(customer, listOfSeatsToBook);
    }
}