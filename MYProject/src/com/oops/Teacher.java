package com.oops;

public class Teacher {

	public static void main(String[] args) {
		Student student = new Student();

		student.setSid(101);
		student.setSname("Nava Bharath Kumar ");
		student.setMarks(100);

		System.out.println(student.getSid());
		System.out.println(student.getSname());
		System.out.println(student.getMarks());
	}

}
