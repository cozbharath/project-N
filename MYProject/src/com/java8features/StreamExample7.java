package com.java8features;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Student70 {
	int sid;
	String sname;
	int marks;

	public Student70(int sid, String sname, int marks) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.marks = marks;
	}

	@Override
	public String toString() {
		return "Student70 [sid=" + sid + ", sname=" + sname + ", marks=" + marks + "]";
	}

}

public class StreamExample7 {

	public static void main(String[] args) {

		List<Student70> list = Arrays.asList(new Student70(101, "Nava", 100), new Student70(102, "Bharath", 90),
				new Student70(103, "Kumar", 80), new Student70(104, "Raj", 60), new Student70(105, "Charan", 100),
				new Student70(106, "Rahul", 70));

		List<String> list1 = list.stream().map(n -> n.sname).collect(Collectors.toList());

		list1.forEach(i -> System.out.println(i));

	}

}
