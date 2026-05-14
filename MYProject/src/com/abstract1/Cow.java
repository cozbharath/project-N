package com.abstract1;

public class Cow implements Animal {

	@Override
	public void sound() {
		System.out.println("Cow sounds like Moooo");
	}

	@Override
	public void walk() {
		System.out.println("Cow Walks complete a day");
	}

	@Override
	public void sleep() {
		System.out.println("Cow sleeps after eating more");

	}

	@Override
	public void eat() {
		System.out.println("Cow eats Grass");

	}

	@Override
	public void drink() {
		System.out.println("Cows drink More Water");

	}

	@Override
	public void play() {
		System.out.println("Cows like to play on the Grass");

	}

	@Override
	public void jump() {
		System.out.println("Cows jumps when they sense Danger");

	}

	@Override
	public void hunt() {
		System.out.println("Cow doesnot hunt any Animal");

	}

	@Override
	public void swim() {
		System.out.println("Cows loves to Swim to cool their body");

	}

	@Override
	public void run() {
		System.out.println("Cows run faster when they are Scared");

	}

}
