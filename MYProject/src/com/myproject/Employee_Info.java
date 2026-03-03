package com.myproject;

public class Employee_Info {
	
	static int emp_id = 500;
	String emp_Name;
	double emp_Salary;
	double emp_Bonus;
	
	{
		emp_id ++ ;
	}
	public static void main(String[] args) {
		show();
		
	}
	
	static void show () {
		Employee_Info emp = new Employee_Info();
		emp.emp_Name = "Nava Bharath";
		emp.emp_Salary = 50000;
		emp.emp_Bonus = emp.emp_Salary * 20/100;
		double totalSal=emp.emp_Salary+emp.emp_Bonus;
				
		
		System.out.println("Employee Id is : " + emp_id);
		System.out.println("Employee Name is : " + emp.emp_Name);
		System.out.println("Employee Salary is : " + emp.emp_Salary);
		System.out.println("Employee Salary is : " + totalSal);
	}
	

}
