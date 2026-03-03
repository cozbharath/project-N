package com.myproject;

public class Area {
	 double b;
	 double h;
	
	public static void main(String[] args) {
		Area a = new Area();
		a.b = 10;
		a.h = 6;
		double  Area = 0.5 *  a.b * a.h ;
		System.out.println("Area of Triangle : " + Area);
	}

}
