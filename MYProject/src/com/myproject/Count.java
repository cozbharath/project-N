package com.myproject;

public class Count {
	
	static int a=0;
	{
		a++;
	}
	

	public static void main(String[] args) {
		Count count = new Count();
		Count count1 = new Count();
		Count count2 = new Count();
		
		System.out.println(a);
	}

}
