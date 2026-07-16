package com.multithreading;

class BookMyShow {
	int totalTickets = 10;

	public synchronized void bookMyTicket(String customerName, int tickets) {
		if (totalTickets >= tickets) {
			System.out.println(tickets + " Tickets Successfully Booked " + customerName);
			totalTickets = totalTickets - tickets;
			System.out.println("Remaining Tickets : " + totalTickets);
		} else {
			System.out.println(customerName + " Booking Failed. Only " + totalTickets + " ticket(s) available.");
		}

	}
}

class Customer extends Thread {
	BookMyShow bms;
	String customerName;
	int tickets;

	public Customer(BookMyShow bms, String customerName, int tickets) {
		super();
		this.bms = bms;
		this.customerName = customerName;
		this.tickets = tickets;
	}

	@Override
	public void run() {
		bms.bookMyTicket(customerName, tickets);
	}

}

public class TicketBooking {
	static BookMyShow bms = new BookMyShow();

	public static void main(String[] args) {
		Customer c1 = new Customer(bms, "Nava Bharth", 5);
		c1.start();

		Customer c2 = new Customer(bms, "Kumar", 6);
		c2.start();

		Customer c3 = new Customer(bms, "Raju", 5);
		c3.start();

	}

}
