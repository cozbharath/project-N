package com.abstract1;

public class Zoo {

	public static void main(String[] args) {
		Animal d = new Dog();

		d.sound();
		d.eat();
		d.sleep();
		d.drink();
		d.run();
		d.play();
		d.jump();
		Animal.breathe();
		d.rest();
		d.walk();
		d.hunt();
		d.swim();

		System.out.println();

		Animal c = new Cat();
		c.sound();
		c.eat();
		c.sleep();
		c.drink();
		c.run();
		c.play();
		c.jump();
		Animal.breathe();
		c.rest();
		c.walk();
		c.hunt();
		c.swim();

		System.out.println();

		Animal o = new Cow();
		o.sound();
		o.eat();
		o.sleep();
		o.drink();
		o.run();
		o.play();
		o.jump();
		Animal.breathe();
		o.rest();
		o.walk();
		o.hunt();
		o.swim();

		System.out.println();
		Animal l = new Lion();
		l.sound();
		l.eat();
		l.sleep();
		l.drink();
		l.run();
		l.play();
		l.jump();
		Animal.breathe();
		l.rest();
		l.walk();
		l.hunt();
		l.swim();
	}

}
