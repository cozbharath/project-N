package com.collections;

import java.util.HashSet;

public class UniversityEnrolledStudents {

	public static void main(String[] args) {

		HashSet<Student> student = new HashSet<>();

		student.add(new Student(1, "Nava Bharath"));
		student.add(new Student(2, "RajKumar"));
		student.add(new Student(3, "Prainay"));
		student.add(new Student(4, "Tilak"));
		student.add(new Student(5, "Shashank"));
		student.add(new Student(6, "Ayan"));
		student.add(new Student(1, "Nava Bharath"));

		for (Student s : student) {
			System.out.println(s);
		}

		Student search = new Student(1, "Nava Bharath");

		if (student.contains(search)) {
			System.out.println("Student Enrolled");
		} else {
			System.out.println("Student not found");
		}
	}

}
