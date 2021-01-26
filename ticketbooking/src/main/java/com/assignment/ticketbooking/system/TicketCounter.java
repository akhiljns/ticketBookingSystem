package com.assignment.ticketbooking.system;

import java.util.List;

import com.assignment.ticketbooking.model.Seat;
import com.assignment.ticketbooking.model.SeatStatus;
import com.assignment.ticketbooking.model.User;

import org.springframework.stereotype.Service;

@Service
public class TicketCounter {

    static SeatStatus[][] seatStatus = new SeatStatus[30][10];
    static int availableSeats = 300;

    public static void initSeats() {
        for (int i = 0; i < 30; i++)
            for (int j = 0; j < 10; j++)
                seatStatus[i][j] = SeatStatus.SEAT_NOT_BOOKED;
    }

    public SeatStatus checkAvailability(Seat seat) {
        // return availability of the seat for Counter representative to view
        return seatStatus[seat.getRowNo()][seat.getSeatno()];
    };

    public SeatStatus[][] getSeatView() {
        return seatStatus;
    }

    // ticket booking kept in synchronized block so that no other ticket counter can
    // book ticket when one is processing the ticket
    // here we are also solving reader writer problem so that when we are checking
    // availibility also we are locking the resources
    // so that other COUNTER thread is not able to read bogus values
    public synchronized void bookTicket(User user, List<Seat> seatList) {
        if ((availableSeats >= seatList.size()) && (seatList.size() > 0)) {
            for (Seat s : seatList) {
                if (seatStatus[s.getRowNo()][s.getSeatno()] == SeatStatus.SEAT_NOT_BOOKED) {
                    seatStatus[s.getRowNo()][s.getSeatno()] = SeatStatus.SEAT_BOOKED;
                    System.out.println("Hi," + user.getName() + " : seat number " + s.getRowNo() + "" + s.getSeatno()
                            + " Seats booked Successfully");
                    availableSeats -= seatList.size();
                }

                else
                    System.out.println("Hi," + user.getName() + " :Required seats Not Available");
            }
        } else
            System.out.println("Hi," + user.getName() + " : Seats Not Available");
    }
}