package com.inheritance;

interface A {
	public abstract void display();
}

class B implements A {
	@Override
	public void display() {
		
		System.out.println("Good Morning");
	}
}

class C extends B {
	public void display() {
		System.out.println("Good Evening");
	}
}

public class MultipleInheritance {

	public static void main(String[] args) {
		
		C c =new C();
		c.display();
		
	}

}
