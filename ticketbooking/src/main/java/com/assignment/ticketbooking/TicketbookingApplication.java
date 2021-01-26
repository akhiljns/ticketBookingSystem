package com.assignment.ticketbooking;

import java.util.ArrayList;
import java.util.List;

import com.assignment.ticketbooking.model.Seat;
import com.assignment.ticketbooking.model.User;
import com.assignment.ticketbooking.system.BookingService;
import com.assignment.ticketbooking.system.TicketCounter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TicketbookingApplication {

	public static void main(String[] args) {

		TicketCounter.initSeats();

		TicketCounter ticketCounter1 = new TicketCounter();
		TicketCounter ticketCounter2 = new TicketCounter();
		TicketCounter ticketCounter3 = new TicketCounter();

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

		BookingService bs1 = new BookingService(ticketCounter1, user1, ls1);
		BookingService bs2 = new BookingService(ticketCounter2, user2, ls2);
		BookingService bs3 = new BookingService(ticketCounter3, user3, ls2);

		bs1.start();
		bs2.start();
		bs3.start();

		SpringApplication.run(TicketbookingApplication.class, args);
	}

}
