package com.myproject;

public class Coun {

	static int object = 0;

	Coun() {
		object++;
	}

	public static void main(String[] args) {
		Coun count = new Coun();
		Coun count1 = new Coun();
		Coun count2 = new Coun();
		Coun count3 = new Coun();
		System.out.println(object);

	}

}
