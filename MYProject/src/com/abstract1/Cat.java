package com.abstract1;

public class Cat implements Animal {

	@Override
	public void sound() {
		System.out.println("Cat sounds like meow meow");
	}

	@Override
	public void walk() {
		System.out.println("Cat does n't wank to walk outside");

	}

	@Override
	public void sleep() {
		System.out.println("Cat sleeps more");
	}

	@Override
	public void eat() {
		System.out.println("Cat Eat rats");

	}

	@Override
	public void drink() {
		System.out.println("Cat loves to Drink Milk");

	}

	@Override
	public void play() {
		System.out.println("Cat loves to play with Anything");
	}

	@Override
	public void jump() {
		System.out.println("Cat hunts the Rat");

	}

	@Override
	public void hunt() {
		System.out.println("Cat jumps when they are scared");

	}

	@Override
	public void swim() {
		System.out.println("Cat doesnot like water");

	}

	@Override
	public void run() {
		System.out.println("Cat runs faster than the Dog");
	}

}
