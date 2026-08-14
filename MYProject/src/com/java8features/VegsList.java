package com.java8features;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Vegetables {
	int pid;
	String pname;
	double price;
	double uprice;
	double dprice;

	public Vegetables(int pid, String pname, double price) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.price = price;

	}

	@Override
	public String toString() {
		return "Vegetables [pid=" + pid + ", pname=" + pname + ", price=" + price + ", uprice=" + uprice + ", dprice="
				+ dprice + "]";
	}

}

public class VegsList {

	public static void main(String[] args) {
		List<Vegetables> list = Arrays.asList(new Vegetables(1, "Tomato", 100.00), new Vegetables(2, "Brinjal", 120.00),
				new Vegetables(3, "Mango", 1000.00), new Vegetables(4, "LadiesFinger", 110.00),
				new Vegetables(5, "BitterGurd", 90.00));
		List<Vegetables> list1 = list.stream().map(vegs -> {
			vegs.dprice = vegs.price * 18 / 100;
			vegs.uprice = vegs.price * 10 / 100;
			return vegs;
		}).collect(Collectors.toList());

		list1.forEach(System.out::println);
	}

}
