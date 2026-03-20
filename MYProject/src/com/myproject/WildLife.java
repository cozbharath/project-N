package com.myproject;

class Animal {
	String name = "Pushpa";
	void show() { 
		System.out.println("Dog" + name );
	}
}
class Dog extends Animal {
	String name = "Raju";
	
	void show() {
		System.out.println(name);
	}
}
public class WildLife {

	public static void main(String[] args) {
		Dog d = new Dog();
		d.show();
	}

}
