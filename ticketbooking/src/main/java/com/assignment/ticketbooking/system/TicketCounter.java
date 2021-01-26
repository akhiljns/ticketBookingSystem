package com.assignment.ticketbooking.system;

import java.util.List;

import com.assignment.ticketbooking.model.Seat;
import com.assignment.ticketbooking.model.SeatStatus;
import com.assignment.ticketbooking.model.User;

public class TicketCounter {

    private SeatStatus[][] seatStatus;

    public TicketCounter(SeatStatus[][] seatStatus) {
        this.seatStatus = seatStatus;
    }

    public SeatStatus checkAvailability(Seat seat) {
        // return availability of the seat for Counter representative to view
        return seatStatus[seat.getRowNo()][seat.getSeatno()];
    };

    // ticket booking kept in synchronized block so that no other ticket counter can book ticket when one is processing the ticket
    public synchronized void bookTicket(User user, List<Seat> seatList, int availableSeats) {
        if ((availableSeats >= seatList.size()) && (seatList.size() > 0)) {
            for (Seat s : seatList) {
                this.seatStatus[s.getRowNo()][s.getSeatno()] = SeatStatus.SEAT_BOOKED;
            }
            System.out.println("Hi," + user.getName() + " : " + seatList.size() + " Seats booked Successfully..");
            availableSeats -= seatList.size();
        } else
            System.out.println("Hi," + user.getName() + " : Seats Not Available");
    }
}