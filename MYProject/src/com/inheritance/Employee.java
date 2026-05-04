package com.inheritance;

class emp implements Cloneable {
	int empId;
	String empName;
	Address address;

	/**
	 * @param empId
	 * @param empName
	 */
	public emp(int empId, String empName, Address address) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.address = address;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {

		return super.clone();
	}
}

class Address {
	String city;

	/**
	 * @param address
	 */
	public Address(String city) {
		super();
		this.city = city;
	}
}

public class Employee {

	public static void main(String[] args) throws CloneNotSupportedException {
		Address address = new Address("Hyderabad");
		emp e1 = new emp(101, "Nava Bharath", address);

		emp e2 = (emp) e1.clone();

		System.out.println(e1.empId);
		System.out.println(e1.empName);
		System.out.println(e1.address.city);
		System.out.println("*********************************");

		e2.empId = 102;
		e2.empName = "Kumar";
		System.out.println(e2.empId);
		System.out.println(e2.empName);
		System.out.println(e2.address.city);
		System.out.println("********************************");
		e2.empId = 103;
		e2.address.city = "Warangal";
		System.out.println(e1.empId);
		System.out.println(e2.empId);
		System.out.println(e1.address.city);
		System.out.println(e2.address.city);

	}

}
