package com.java8features;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Employee7475 {
	int empid;
	String ename;
	int departement;
	double salary;
	String dept;

	public int getEmpid() {
		return empid;
	}

	public void setEmpid(int empid) {
		this.empid = empid;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public int getDepartement() {
		return departement;
	}

	public void setDepartement(int departement) {
		this.departement = departement;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	/**
	 * @param empid
	 * @param ename
	 * @param departement
	 * @param salary
	 * @param dept
	 */
	public Employee7475(int empid, String ename, int departement, double salary, String dept) {
		super();
		this.empid = empid;
		this.ename = ename;
		this.departement = departement;
		this.salary = salary;
		this.dept = dept;
	}

	@Override
	public String toString() {
		return "Employee7475 [empid=" + empid + ", ename=" + ename + ", departement=" + departement + ", salary="
				+ salary + ", dept=" + dept + "]";
	}

}

public class Employee101 {

	public static void main(String[] args) {
		List<Employee7475> list = Arrays.asList(new Employee7475(101, "Nava", 1, 20000.00, "it"),
				new Employee7475(102, "Bharath", 2, 650000.00, "IT"),
				new Employee7475(103, "kumar", 3, 750000.00, "IT"), new Employee7475(104, "Charan", 4, 35000.00, "CS"),
				new Employee7475(105, "Raj", 5, 25000.00, "Testing"),
				new Employee7475(106, "Shashank", 6, 100000.00, "Devops"));

		List<Employee7475> list1 = list.stream().filter(i -> i.salary > 50000.00 && i.dept.equalsIgnoreCase("IT"))
				.collect(Collectors.toList());
		list1.forEach(System.out::println);
	}

}
