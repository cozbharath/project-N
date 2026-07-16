package com.java8features;

import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

class Employee {

	int age;
	String name;
	double salary;
	String dept;

	Employee(int age, String name, double salary, String dept) {
		this.age = age;
		this.name = name;
		this.salary = salary;
		this.dept = dept;
	}
}

interface EmployeeDetail {
	void Employee(int age, String name, double salary, String dept);
}

public class EmployeeDetails {
	public static void main(String[] args) {
		List<Employee> employees = Arrays.asList(new Employee(20, "Nava", 55000, "IT"),
				new Employee(24, "Nava Bharath", 51000, "IT"), new Employee(20, "Kumar", 52000, "IT"),
				new Employee(26, "Bharat Kumar", 60000, "IT"), new Employee(28, "Nava", 70000, "CSE"));

		Function<Employee, String> f = e -> {
			if (e.age > 25 && e.salary > 5000.00 && e.dept.equalsIgnoreCase("IT")) {
				return e.name;
			}
			return "Not Eligible";
		};

		Predicate<Employee> e1 = f1 -> f1.age > 25 && f1.salary > 50000 && f1.dept.equalsIgnoreCase("IT");
		Supplier<Date> s = () -> new Date();

		Consumer<Employee> c = (c1) -> {
			System.out.println("Age : " + c1.age);
			System.out.println("Name : " + c1.name);
			System.out.println("Salary : " + c1.salary);
			System.out.println("Department : " + c1.dept);
			System.out.println(s.get());

			System.out.println("--------------------");
		};

		for (Employee e : employees) {
			if (e1.test(e)) {
				c.accept(e);

			}
		}

	}
}
