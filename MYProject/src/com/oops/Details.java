package com.oops;

public class Details {

	public static void main(String[] args) {
		PassangerDetails p1 = new PassangerDetails();
		p1.setName("Nava bharath Kumar");
		p1.setContact(9912955150L);
		p1.setEmail("Navabharath.podila@gmail.com");

		System.out.println("Passenger Name   : " + p1.getName());
		System.out.println("Passenger Mobile : " + p1.getContact());
		System.out.println("Passenger Email  : " + p1.getEmail());
		System.out.println("Passenger Passport Number : " + p1.getPassport());
		System.out.println("***************************************************");

		PassangerDetails p2 = new PassangerDetails();
		p2.setName("Kumar");
		p2.setContact(8184981234L);
		p2.setEmail("Navabharath.podila@gmail.com");

		System.out.println("Passenger Name   : " + p2.getName());
		System.out.println("Passenger Mobile : " + p2.getContact());
		System.out.println("Passenger Email  : " + p2.getEmail());
		System.out.println("Passenger Passport Number : " + p2.getPassport());

	}

}
