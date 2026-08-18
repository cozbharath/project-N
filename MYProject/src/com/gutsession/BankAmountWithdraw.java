package com.gutsession;

import java.util.Scanner;

class AmountWithDraw {
	int acNo;
	String name;
	double balance;

	public AmountWithDraw(int acNo, String name, double balance) {
		super();
		this.acNo = acNo;
		this.name = name;
		this.balance = balance;
	}

	public void deposit(double amount) {
		balance = balance + amount;
		System.out.println("Amount Deposited: " + amount);
	}

	public void withdraw(double amount) throws MsgException {

		if (amount <= 0) {
			throw new MsgException("\"InvalidAmountException : Amount must be positive\"");
		} else if (amount > balance) {
			throw new MsgException("InsufficientBalanceException : Insufficient balance");
		} else {
			balance = balance - amount;
			System.out.println("Amount Withdrawn: " + amount);
			System.out.println("Balance " + balance);
		}
	}

	public void displayDetails() {
		System.out.println("Account Number: " + acNo);
		System.out.println("Account Holder: " + name);
		System.out.println("Balance: " + balance);
	}

}

public class BankAmountWithdraw {
	public static void main(String[] args) throws MsgException {

		Scanner sc = new Scanner(System.in);
		AmountWithDraw am = new AmountWithDraw(1234, "Nava", 5000.00);
		System.out.println("\nAccount Details:");
		am.displayDetails();

		System.out.println("\nEnter Withdraw Amount:");
		double withdraw = sc.nextDouble();
		am.withdraw(withdraw);

	}

}
