package com.myproject;

public class Constructor1 {
	int id;
	String name;

	Constructor1(int i, String n) {
		id = i;
		name = n;
	}

	void display() {
		System.out.println(id + " -> " + name);
	}

	public static void main(String[] args) {
		Constructor1 c = new Constructor1(101, "Bharath");
		Constructor1 c1 = new Constructor1(101, "Bharath");

		c.display();
		c1.display();
	}

}
