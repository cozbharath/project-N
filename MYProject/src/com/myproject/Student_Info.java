package com.myproject;

public class Student_Info {

	static int std_Id = 0;

	String std_Name;

	int std_Age;
	char std_Gender;
	int eng_Marks;
	int tel_Marks;
	int mat_Marks;
	int sci_Marks;
	int soc_Marks;
	
	static{
		std_Id++;
	}

	public static void main(String[] args) {
		System.out.println("Student Info");

		Student_Info student = new Student_Info();
		student.std_Name = "Nava Bharath";
		student.std_Age = 23;
		student.std_Gender = 'M';
		student.eng_Marks = 55;
		student.tel_Marks = 80;
		student.mat_Marks = 100;
		student.sci_Marks = 55;
		student.soc_Marks = 60;
		
		student.display();

		System.out.println();

		Student_Info student1 = new Student_Info();
		student1.std_Name = "Tilak";
		student1.std_Age = 25;
		student1.std_Gender = 'M';
		student1.eng_Marks = 66;
		student1.tel_Marks = 76;
		student1.mat_Marks = 86;
		student1.sci_Marks = 66;
		student1.soc_Marks = 70;
		student1.display();
		
		System.out.println();

		Student_Info student2 = new Student_Info();
		student2.std_Name = "Raj Kumar";
		student2.std_Age = 30;
		student2.std_Gender = 'B';
		student2.eng_Marks = 66;
		student2.tel_Marks = 76;
		student2.mat_Marks = 86;
		student2.sci_Marks = 66;
		student2.soc_Marks = 70;
		student2.display();

	}

	void display() {
		int sum = eng_Marks + tel_Marks + mat_Marks+sci_Marks+soc_Marks;
		double average = sum / 5.0;
		System.out.println("Student Name is : " + std_Name);
		System.out.println("Student Id is : " + std_Id);
		System.out.println("Student Age is : " + std_Age);
		System.out.println("Student Gender is : " + std_Gender);
		System.out.println("English Marks : " + eng_Marks);
		System.out.println("Telugu Marks : " + tel_Marks);
		System.out.println("Maths Marks : " + mat_Marks);
		System.out.println("Science Marks : " + sci_Marks);
		System.out.println("Social Marks : " + soc_Marks);
//		System.out.println("Sum of all Marks : " + (eng_Marks + tel_Marks + mat_Marks+sci_Marks+soc_Marks));
//		System.out.println("Avg of all Marks : " + ((eng_Marks + tel_Marks + mat_Marks+sci_Marks+soc_Marks) / 5));
		System.out.println("Total Marks : " + sum);
		System.out.println("Average Marks : " + average);
	}
}
