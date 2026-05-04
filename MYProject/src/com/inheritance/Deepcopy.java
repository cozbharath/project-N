package com.inheritance;

class Student {
	int sage;
	String sname;
	Address1 add1;

	/**
	 * @param sage
	 * @param sname
	 */
	public Student(int sage, String sname, Address1 add1) {
		super();
		this.sage = sage;
		this.sname = sname;
		this.add1 = add1;
	}

	public Student(Student s1) {
		this.sage = s1.sage;
		this.sname = s1.sname;
		this.add1 = new Address1(s1.add1);
	}

}

class Address1 {
	String city;

	/**
	 * @param city
	 */
	public Address1(String city) {
		super();
		this.city = city;
	}

	public Address1(Address1 add1) {
		this.city = add1.city;
	}

}

public class Deepcopy {

	public static void main(String[] args) {

		Address1 add1 = new Address1("Hyderabad");

		Student s1 = new Student(101, "Nava", add1);

		System.out.println(s1.sage);
		System.out.println(s1.sname);
		System.out.println(s1.add1.city);
		System.out.println("**********************");

		Student s2 = new Student(s1);

		System.out.println(s2.sage);
		System.out.println(s2.sname);
		System.out.println(s2.add1.city);
		System.out.println("____________________________");

		s2.add1.city = "Warangal";
		System.out.println(s1.add1.city);
		System.out.println(s2.add1.city);

	}

}
