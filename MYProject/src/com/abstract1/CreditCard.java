package com.abstract1;

import java.util.Scanner;

public class CreditCard implements Payment {
	long card;
	String password;
	Scanner sc = new Scanner(System.in);

	/**
	 * @param card
	 * @param password
	 */
	public CreditCard(long card, String password) {
		super();
		this.card = card;
		this.password = password;
	}

	@Override
	public void pay(double amount) {
		System.out.println("Enter Card Password");
		String enteredPassword = sc.next();
		if (enteredPassword.equals(password)) {
			System.out.println("Payment Sucessful Using Credit Card");
			System.out.println("Amount Paid " + amount);
		} else {
			System.out.println("Payment Failed - Invalid Password");
		}

	}

}
