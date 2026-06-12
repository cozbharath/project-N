package com.collections;

public class Employee implements Comparable<Employee> {

	int eid;
	String name;
	long phone;
	int age;
	double salary;
	
	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", name=" + name + ", phone=" + phone + ", age=" + age + ", salary=" + salary
				+ "]";
	}



	public Employee(int eid, String name, long phone, int age, double salary) {
		super();
		this.eid = eid;
		this.name = name;
		this.phone = phone;
		this.age = age;
		this.salary = salary;
	}
	
	@Override
	public int compareTo(Employee o) {
		
		if(this.eid < o.eid) {
			return -1;
		} else if(this.eid>o.eid) {
			return 1;
		} else {
			return 0;
		}
	}

}
