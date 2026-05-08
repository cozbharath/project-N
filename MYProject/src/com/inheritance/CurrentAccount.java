package com.inheritance;

public class CurrentAccount extends BankApp {

	@Override
	double getROI() {
		return 2;
	}

	public static void main(String[] args) {
		CurrentAccount sc = new CurrentAccount();

		sc.getInput();

		System.out.println("Enter Your Details : ");
		System.out.println("Name : " + sc.name);
		System.out.println("Account Number : " + sc.id);
		System.out.println("Salary : " + sc.salary);

		System.out.println(sc.getROI());
		System.out.println(sc.getCalculateSalary());
		System.out.println(sc.getTotalSalary());
	}

}
