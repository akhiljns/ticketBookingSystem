package com.assignment.ticketbooking.system;

import java.util.List;

import com.assignment.ticketbooking.model.Seat;
import com.assignment.ticketbooking.model.User;

public class BookingService extends Thread {

    private TicketCounter ticketCounter;
    private User customer;
    private List<Seat> listOfSeatsToBook;
    private int availableSeats;

    public BookingService(TicketCounter ticketCounter, User custoUser, List<Seat> seatList, int availableSeats) {
        this.ticketCounter = ticketCounter;
        customer = new User();
        this.customer.setUserId(custoUser.getUserId());
        this.customer.setName(custoUser.getName());
        this.customer.setMobNo(custoUser.getMobNo());
        this.customer.setEmailId(custoUser.getEmailId());
        this.listOfSeatsToBook = seatList;
        this.availableSeats = availableSeats;
    }

    @Override
    public void run() {
        ticketCounter.bookTicket(customer, listOfSeatsToBook, availableSeats);
    }
}