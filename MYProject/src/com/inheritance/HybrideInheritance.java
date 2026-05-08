package com.inheritance;

interface Int1 {
	public abstract void display();
}

class TestA1 {
	public void display() {
		System.out.println("Hii !!");
	}
}

class TestA2 extends TestA1 implements Int1 {

}

public class HybrideInheritance {

	public static void main(String[] args) {
		TestA2 a = new TestA2();
		a.display();
	}

}
