package com.myproject;

public class CarRental {
	
	public String CompanyName() {
		return "Nava Bharath Rental";
	}

	public int DailyRate() {
		return 1500;
	}

	public int calculate(int days) {
		return days * DailyRate();
	}
	
	public int insurance() {
		return 500;
	}
	
	public int totalCast(int days) {
		return calculate(days) + insurance();
	}
	
	public String Welcome() {
		return "Welcome to Rental Car";
	}

	public static void main(String[] args) {
		CarRental c1 = new CarRental();
		int days = 5;
		System.out.println(c1.Welcome());
		System.out.println(c1.CompanyName());
		System.out.println(c1.DailyRate());
		System.out.println(c1.insurance());
		System.out.println(c1.totalCast(days));
	}

}
