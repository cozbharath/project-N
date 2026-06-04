package com.exception;

import java.util.Scanner;

public class Balance {

	public static void main(String[] args) throws InsufficientBalanceException {
		Scanner sc = new Scanner(System.in);

		int balance = 5000;

		System.out.println("Enter the amount only 100, 200, 500 avilable");

		int withdraw = sc.nextInt();

		if (withdraw <= 5000) {
			System.out.println("Amount Withdraw Successfull");
			System.out.println(balance - withdraw);
		} else {
			throw new InsufficientBalanceException("Insufficient Funds");
		}
	}

}
