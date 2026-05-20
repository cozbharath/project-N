package com.atmproject;

import java.util.Scanner;

public class AtmImplementation implements AtmInterface {
	Scanner sc = new Scanner(System.in);
	User u1;

	public AtmImplementation(User u) {
		this.u1 = u;
	}

	@Override
	public void CheckBalance() {
		System.out.println("Balance :" + u1.getBalance());
	}

	@Override
	public void Deposite() {
		System.out.println("Enter the Deposit Amount ");
		double amount = sc.nextDouble();
		double balance = u1.getBalance();
		double totalBalance = amount + balance;
		u1.setBalance(totalBalance);
		System.out.println("Amount Deposit Successfully ");
	}

	@Override
	public void WithDraw() {
		System.out.println("Enter the WithDraw amount");
		double amount = sc.nextDouble();
		if (amount < u1.getBalance()) {
			double balance = u1.getBalance();
			double totalBalance = u1.getBalance() - amount;
			u1.setBalance(totalBalance);
			System.out.println("Amount withdraw Successfully ");
		} else {
			System.out.println("Insficient Funds");
		}

	}

	@Override
	public void PinChange() {
		System.out.println("Enter the Old Pin");
		int oldPin = sc.nextInt();
		if (oldPin == u1.getPin()) {
			System.out.println("Enter the New Pin");
			int newPin = sc.nextInt();
			u1.setPin(newPin);
			System.out.println("Pin Changed Succsfully");
		} else {
			System.out.println("Invalid details");
		}
	}

	@Override
	public void Exit() {
		System.out.println("Thanks for Visiting Nava Finance");
		System.exit(0);

	}

}
