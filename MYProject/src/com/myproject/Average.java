package com.myproject;

public class Average {
	String stdName;
	int engMarks;
	int socMarks;
	int sciMarks;
	
	Average (String stdName, int engMarks, int socMarks, int sciMarks) {
		this.stdName = stdName;
		this.engMarks = engMarks;
		this.socMarks = socMarks;
		this.sciMarks = sciMarks;
		
	}
	
	public static void main(String[] args) {
		Average a1 = new Average ("Nava Bharath", 99, 100, 100);
		a1.display();
		Average a2 = new Average ("tilak", 99, 55, 98);
		a2.display();
		Average a3 = new Average ("rajkumar", 55, 100, 80);
		a3.display();
		Average a4 = new Average ("Shanak", 99, 100, 100);
		a4.display();
		
	}
	
	void display () {
		int t = engMarks + socMarks + sciMarks;
		
		double avg = t/3;
		
		System.out.println("Student Name  : " +stdName);
		System.out.println("English Marks : " +engMarks);
		System.out.println("Social Marks  : " +socMarks);
		System.out.println("Science Marks : " +sciMarks);
		System.out.println("Total Marks   :" + t);
		System.out.println("Average Marks :" + avg);
		System.out.println("***************************");
	}

}
