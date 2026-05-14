package com.abstract1;

public interface Animal {

	void sound();

	void walk();

	void sleep();

	void eat();

	void run();

	void drink();

	void play();

	void jump();

	void hunt();

	void swim();

	public static void breathe() {
		System.out.println("Animal is breathing.");
	}

	default void rest() {
		System.out.println("Animal is resting.");
	}

	static void toy() {
		System.out.println("all animals like to play with the toys");
	}

	private void fight() {
		System.out.println("Animals fight each other");
	}

}
