package com.java8features;

import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

class Details {
	int sNo;
	String name;
	int marks;

	public Details(int sNo, String name, int marks) {
		super();
		this.sNo = sNo;
		this.name = name;
		this.marks = marks;
	}

}

public class Student {

	public static void main(String[] args) {

		List<Details> list = Arrays.asList(new Details(101, "Nava", 80), new Details(102, "Nava Bharath", 89),
				new Details(103, "kumar", 99));
		Function<Details, String> f = f1 -> {
			return f1.name;
		};

		Predicate<Details> p1 = (p) -> p.marks > 90;
		Supplier<Date> d = () -> new Date();
		Consumer<Details> F = (c1) -> {
			System.out.println("Student Id : " + c1.sNo);
			System.out.println("Student Name : " + c1.name);
			System.out.println("marks : " + c1.marks);
			System.out.println(d.get());
			System.out.println("_______________________________________");

		};

		for (Details e : list) {
			if (p1.test(e)) {
				F.accept(e);
			}
		}

	}

}
