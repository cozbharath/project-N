package com.method;

import java.util.Scanner;

public class EmpSalary {

	String empName;
	int empid;
	double monSal;
	double netSalary;

	EmpSalary() {

	}

	EmpSalary(String empName, int empid, double monSal) {
		this.empName = empName;
		this.empid = empid;
		this.monSal = monSal;
	}

	double getNetSalary(Double monSal) {
		netSalary = monSal * 12;
		return netSalary;

	}

	public static void main(String[] args) {
		EmpSalary e1 = new EmpSalary();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Name : ");
		e1.empName = sc.nextLine();
		System.out.println("Employee Id : ");
		e1.empid = sc.nextInt();

		System.out.println("Employee Gross Salary : ");
		e1.monSal = sc.nextDouble();

		System.out.println("\n Employee Details:");
		e1.show();
		e1.show1();
	}

	void show() {
		System.out.println("Employee Name is : " + empName);
		System.out.println("Employee ID is : " + empid);
		System.out.println("Emp Monthly Salary is : " + monSal);
		System.out.println("Employee Net Salary is : " + getNetSalary(monSal) );
	}
	
	void show1 () {
		if (netSalary < 1200000) {
			System.out.println("Low Salary");
		} else if (netSalary >= 1200000 && netSalary <= 1900000 ) {
			System.out.println("Medium Salary");
		} else {
			System.out.println("High Salary");
		}
	}

}
