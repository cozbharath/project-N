package com.myproject;

public class Emp_Salary {
	
	String emp_Name;
	Double emp_Salary;
	Double emp_PF;
	Double emp_Gst;
	Double emp_Da;
	Double final_Salary;
	public static void main(String[] args) {
		Integer i6 = 200;
		Integer i7 = 200;
		System.out.println(i6 == i7);
		Emp_Salary emp = new Emp_Salary();
		
	}
	
	 {
		emp_Name = "Podila Raj Kumar";
		emp_Salary = (double) 5000;
		emp_PF = emp_Salary * 8 / 100;
		emp_Gst = emp_Salary * 6 / 100;
		emp_Da = emp_Salary * 3 / 100;
		final_Salary = emp_Salary + emp_Da - emp_PF - emp_Gst;
		System.out.println(emp_Name);
		System.out.println(final_Salary);
	}
	

}
