package com.inheritance;

public class SavingAccount extends BankApp {

	@Override
	double getROI() {
		return 6;
	}

	public static void main(String[] args) {
		SavingAccount sc = new SavingAccount();

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
