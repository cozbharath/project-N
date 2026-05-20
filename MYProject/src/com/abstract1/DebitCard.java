package com.abstract1;

import java.util.Scanner;

public class DebitCard implements Payment {
	int accNo;
	int pin;
	double balance;
	Scanner sc = new Scanner(System.in);

	/**
	 * @param accNo
	 * @param pin
	 * @param balance
	 */
	public DebitCard(int accNo, int pin, double balance) {
		super();
		this.accNo = accNo;
		this.pin = pin;
		this.balance = balance;
	}

	@Override
	public void pay(double amount) {

		System.out.println("Enter Debit Card PIN:");
		int enteredPin = sc.nextInt();

		if (enteredPin == pin) {

			if (balance >= amount) {

				balance = balance - amount;

				System.out.println("Payment Successful using Debit Card");
				System.out.println("Amount Paid : " + amount);
				System.out.println("Remaining Balance : " + balance);

			} else {
				System.out.println("Payment Failed - Insufficient Balance");
			}

		} else {
			System.out.println("Payment Failed - Invalid PIN");
		}
	}

}
