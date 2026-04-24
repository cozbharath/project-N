package com.oops;

public class Employee {

	public static void main(String[] args) {
		Emp emp = new Emp();

//		Accessing the variables through Setters and Getters
		emp.setEid(101);
		emp.setEname("Bharath");
		emp.setEphone(9912955150l);

//		Printing variables
		System.out.println(emp.getEid());
		System.out.println(emp.getEname());
		System.out.println(emp.getEphone());
	}

}
