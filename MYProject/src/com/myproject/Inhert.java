package com.myproject;

class GrandParent {
	void show () {
		System.out.println("Grand Parent Called");
	}
}

class Parent extends GrandParent {
	void show () {
		super.show();
		System.out.println("Parent Called");
	}
}

class child extends Parent{
	void show () {
		super.show();
		System.out.println("child Parent Called");
	}
}

public class Inhert {
	
	public static void main(String[] args) {
		
		child c1 = new child();
		c1.show();
	}

}
