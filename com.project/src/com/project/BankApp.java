package com.project;

import java.util.Scanner;

class BankAccount {

	int accountNumber;
	String accountHolder;
	double balance;

	// Constructor
	public BankAccount(int accNo, String name, double bal) {
		accountNumber = accNo;
		accountHolder = name;
		balance = bal;
	}

	// Deposit method
	public void deposit(double amount) {
		balance = balance + amount;
		System.out.println("Amount Deposited: " + amount);
	}

	// Withdraw method
	public void withdraw(double amount) {
		balance = balance - amount;
		System.out.println("Amount Withdrawn: " + amount);
	}

	// Display method
	public void displayDetails() {
		System.out.println("Account Number: " + accountNumber);
		System.out.println("Account Holder: " + accountHolder);
		System.out.println("Balance: " + balance);
	}
}

public class BankApp {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Account Number:");
		int accNo = sc.nextInt();

		sc.nextLine();

		System.out.println("Enter Account Holder Name:");
		String name = sc.nextLine();

		System.out.println("Enter Initial Balance:");
		double balance = sc.nextDouble();

		// Constructor call
		BankAccount acc1 = new BankAccount(accNo, name, balance);

		System.out.println("\nAccount Details:");
		acc1.displayDetails();

		System.out.println("\nEnter Deposit Amount:");
		double deposit = sc.nextDouble();
		acc1.deposit(deposit);

		System.out.println("\nEnter Withdraw Amount:");
		double withdraw = sc.nextDouble();
		acc1.withdraw(withdraw);

		System.out.println("\nUpdated Account Details:");
		acc1.displayDetails();
	}
}