package com.designpattern;

class Employee {
	private static final Employee instance = new Employee();

	private Employee() {

	}

	public static Employee method1() {

		return instance;
	}
}

public class EmployeeSingleTon {

	public static void main(String[] args) {
		Employee e = Employee.method1();
		Employee e1 = Employee.method1();

		System.out.println(e);
		System.out.println(e1);

		System.out.println(e == e1);
	}

}
