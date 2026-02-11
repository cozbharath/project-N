package com.myproject;

public class Investment {
	
	static int rs = 100;
	
	int rs1;
	
	public static void main(String[] args) {
		Investment a = new Investment();
		a.rs1 = 7 ;
		System.out.println("Number of Pencils : " + rs /  a.rs1);
		System.out.println("Remaning Balance : " + rs % a.rs1);
		
	}

}
