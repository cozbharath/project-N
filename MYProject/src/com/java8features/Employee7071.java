package com.java8features;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

class Employee71 {
	int empid;
	String ename;
	int departement;
	double salary;

	public Employee71(int empid, String ename, int departement, double salary) {
		super();
		this.empid = empid;
		this.ename = ename;
		this.departement = departement;
		this.salary = salary;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee71 [empid=" + empid + ", ename=" + ename + ", departement=" + departement + ", salary=" + salary
				+ "]";
	}

}

public class Employee7071 {

	public static void main(String[] args) {
		List<Employee71> list = Arrays.asList(new Employee71(101, "Nava", 1, 550000.00),
				new Employee71(102, "Bharath", 2, 650000.00), new Employee71(103, "kumar", 3, 750000.00),
				new Employee71(104, "Charan", 4, 35000.00), new Employee71(105, "Raj", 5, 25000.00),
				new Employee71(106, "Shashank", 6, 100000.00));

		Employee71 li = list.stream().max(Comparator.comparingDouble(Employee71::getSalary)).get();
		System.out.println("Max Salary Paid ");
		System.out.println(li + "\n");

		Employee71 li1 = list.stream().min(Comparator.comparingDouble(Employee71::getSalary)).get();
		System.out.println("Min Paid Salary");
		System.out.println(li1 + "\n");

	}

}
