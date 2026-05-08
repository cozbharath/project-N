package com.inheritance;

public class MethodOverriding1 extends MethodOverriding {

	double getROI() {
		return 10.5;
	}

	public Short hello() {
		return 22111;
	}

	public static void main(String[] args) {
		MethodOverriding1 l1 = new MethodOverriding1();

		System.out.println(l1.getROI());

		System.out.println(l1.hello());
	}

}
