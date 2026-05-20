package com.abstract1;

public class ImpMain {

	public static void main(String[] args) {

		AbsDemo i = new Demo1();

		i.method1();
		i.method2();
		i.method3();
		i.method4();
		i.method5();
		System.out.println("************");

		AbsDemo i1 = new Demo2();
		i1.method1();
		i1.method2();
		i1.method3();
		i1.method4();
		i1.method5();
	}
}
