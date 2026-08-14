package com.java8features;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Student1 {

	int sid;
	String sname;
	int marks;

	public Student1(int sid, String sname, int marks) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.marks = marks;
	}

	@Override
	public String toString() {
		return "Student1 [sid=" + sid + ", sname=" + sname + ", marks=" + marks + "]";
	}

}

public class MarksOfStudents {

	public static void main(String[] args) {
		List<Student1> li = Arrays.asList(new Student1(101, "Nava", 30), new Student1(102, "Nava Bharath", 89),
				new Student1(103, "kumar", 99));

		List<Student1> li1 = li.stream().filter(i -> i.marks >= 70).collect(Collectors.toList());
		System.out.println(li1);
	}

}
