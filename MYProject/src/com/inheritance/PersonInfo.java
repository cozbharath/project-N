package com.inheritance;

public class PersonInfo extends MathTeacher {

	public static void main(String[] args) {
		MathTeacher t1 = new PersonInfo();
		t1.showPerson();
		t1.showTeacher();
		t1.showMathTeacher();

		t1.display();
	}

}
