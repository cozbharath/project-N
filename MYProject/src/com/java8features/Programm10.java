package com.java8features;

import java.util.Date;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

class Studentin {
	String name;
	double marks;

	public Studentin(String name, double marks) {
		super();
		this.name = name;
		this.marks = marks;
	}

}

public class Programm10 {

	public static void main(String[] args) {
		Studentin s1 = new Studentin("Lokesh", 95);
		Studentin s2 = new Studentin("Vinay", 85);
		Studentin s3 = new Studentin("Rahul", 75);
		Studentin s4 = new Studentin("Raju", 40);
		Studentin s5 = new Studentin("Kumar", 100);
		Studentin s6 = new Studentin("Ramu", 55);

		Studentin[] students = { s1, s2, s3, s4, s5, s6 };

		Function<Studentin, String> f1 = (st) -> {
			String grade = "";
			if (st.marks > 100 || st.marks <= 0) {
				grade = null;
			} else if (st.marks >= 90) {
				grade = "A";
			} else if (st.marks >= 80) {
				grade = "B";
			} else if (st.marks >= 70) {
				grade = "C";
			} else if (st.marks >= 60) {
				grade = "D";
			} else if (st.marks >= 40) {
				grade = "Just Pass";
			} else {
				grade = "Fail";
			}

			return grade;
		};

		Predicate<Double> p1 = m -> m > 75;

		Supplier<Date> su = () -> new Date();

		Consumer<Studentin> c1 = (s) -> {
			System.out.println(s.name);
			System.out.println(s.marks);
			System.out.println(f1.apply(s));
			System.out.println(su.get());
			System.out.println("__________________________");
		};

		for (Studentin s : students) {
			if (p1.test(s.marks)) {
				c1.accept(s);
			}
		}
	}

}
