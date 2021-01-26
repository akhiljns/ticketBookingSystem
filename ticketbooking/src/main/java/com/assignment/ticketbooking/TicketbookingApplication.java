package com.assignment.ticketbooking;

import java.util.ArrayList;
import java.util.List;

import com.assignment.ticketbooking.model.Seat;
import com.assignment.ticketbooking.model.SeatStatus;
import com.assignment.ticketbooking.model.User;
import com.assignment.ticketbooking.system.BookingService;
import com.assignment.ticketbooking.system.TicketCounter;

public class TicketbookingApplication {

	static SeatStatus seats[][] = new SeatStatus[30][10];
	static int availableSeats = 300;

	public static void initSeat() {
		for (int i = 0; i < 30; i++)
			for (int j = 0; j < 10; j++)
				seats[i][j] = SeatStatus.SEAT_NOT_BOOKED;
	}

	public static void main(String[] args) {

		initSeat();

		TicketCounter ticketCounter1 = new TicketCounter(seats);
		TicketCounter ticketCounter2 = new TicketCounter(seats);
		TicketCounter ticketCounter3 = new TicketCounter(seats);

		User user1 = new User(1, "amit", 887777662, "mail.com");
		User user2 = new User(2, "ben", 887777663, "mail.com");
		User user3 = new User(3, "ria", 887777664, "mail.com");

		Seat s11 = new Seat(1, 1);
		Seat s12 = new Seat(1, 2);
		Seat s55 = new Seat(5, 5);
		Seat s71 = new Seat(7, 1);
		Seat s97 = new Seat(9, 7);

		List<Seat> ls1 = new ArrayList<>();
		List<Seat> ls2 = new ArrayList<>();
		List<Seat> ls3 = new ArrayList<>();

		ls1.add(s11);
		ls1.add(s12);
		ls1.add(s55);

		ls2.add(s71);

		ls3.add(s97);
		ls3.add(s11);

		BookingService bs1 = new BookingService(ticketCounter1, user1, ls1, availableSeats);
		BookingService bs2 = new BookingService(ticketCounter2, user2, ls2, availableSeats);
		BookingService bs3 = new BookingService(ticketCounter3, user3, ls3, availableSeats);

		bs1.start();
		bs2.start();
		bs3.start();
	}

}
