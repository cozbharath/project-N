package com.abstract1;

import java.util.Scanner;

public class Upi implements Payment {
	String upiId;
	int pin;
	String bankName;

	Scanner sc = new Scanner(System.in);

	/**
	 * @param upiId
	 * @param pin
	 * @param bankName
	 */
	public Upi(String upiId, int pin, String bankName) {
		super();
		this.upiId = upiId;
		this.pin = pin;
		this.bankName = bankName;
	}

	@Override
	public void pay(double amount) {
//		System.out.println("Enter your UPI Id ");
		System.out.println("Enter the Pin Number");
		int enteredPin = sc.nextInt();
		if (enteredPin == pin) {
			System.out.println("Payment Sucessful using UPI");
			System.out.println("Amount Paid " + amount);
		} else {
			System.out.println("Payment Failed - Invald Pin");
		}

	}

}
