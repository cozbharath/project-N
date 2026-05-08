package com.inheritance;

abstract class Abstract {
	abstract void method1();
}

class Demo extends Abstract {

	@Override
	void method1() {
		System.out.println("Method1 Called");

	}

}

abstract class Demo1 extends Demo {
	abstract void method1();
}

public class MethodAbst {

	public static void main(String[] args) {
		Demo d = new Demo();
		d.method1();
	}

}
