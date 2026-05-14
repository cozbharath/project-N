package com.abstract1;

public class Dog implements Animal {

	@Override
	public void sound() {
		System.out.println("Dog barks: Bow Bow");

	}

	@Override
	public void walk() {
		System.out.println("Dog likes to go for a long walk");
	}

	@Override
	public void sleep() {
		System.out.println("Dog likes to sleep more");

	}

	@Override
	public void eat() {
		System.out.println("Dog likes to eat meat");

	}

	@Override
	public void drink() {
		System.out.println("Dog likes to drink water");

	}

	@Override
	public void play() {
		System.out.println("Dog likes to play more");

	}

	@Override
	public void jump() {
		System.out.println("Dog loves to jump on Things");

	}

	@Override
	public void hunt() {
		System.out.println("Dog hunts cat");

	}

	@Override
	public void swim() {
		System.out.println("Dog loves to swim");

	}

	@Override
	public void run() {
		System.out.println("Dog runs like cheetah");

	}

}
