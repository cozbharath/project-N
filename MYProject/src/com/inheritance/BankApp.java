package com.inheritance;

import java.util.Scanner;

public class BankApp {
	static Scanner sc = new Scanner(System.in);
	
	String name;
	int id;
	double salary;
	
	void getInput () {
		System.out.println("Enter Your Name : ");
		name = sc.nextLine();
		
		System.out.println("Enter the Account Number : ");
		id = sc.nextInt();
		
		System.out.println("Enter the Salary : ");
		salary = sc.nextDouble();
	}

	double getROI() {
		return 0;
	}

	double getCalculateSalary() {
		double calculation = salary * getROI() / 100;
		return calculation;
	}
	
	double getTotalSalary() {
		double totalSalary = salary + getCalculateSalary();
		return totalSalary;
	}

}
