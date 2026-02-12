package com.myproject;

public class Temperature {
	
	double cel;
	double fah;
	
	public static void main(String[] args) {
		Temperature t = new Temperature();
		t.cel = 33;
		t.fah = (t.cel * 9/5)+32;
		var cel2 = ((t.fah - 32) * 5/9);
		
//		System.out.println("cel to Fah : " +((t.cel * 9/5)+32));
//		System.out.println("fah to cel : " +((t.fah - 32) * 5/9));
		
		System.out.println("cel to Fah : " + t.fah);
		System.out.println("cel to Fah : " + cel2);
	}

}
