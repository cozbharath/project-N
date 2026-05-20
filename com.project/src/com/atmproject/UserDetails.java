package com.atmproject;

import java.util.Scanner;

public class UserDetails {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		User[] u = new User[4];
		u[0] = new User(28661010034110L, "Nava Bharath", 2002, 100000.0);
		u[1] = new User(28661010034111L, "Nava Bharath", 2002, 100000.0);
		u[2] = new User(28661010034112L, "Nava Bharath", 2002, 100000.0);
		u[3] = new User(28661010034113L, "Nava Bharath", 2002, 100000.0);

		System.out.println("Enter yourAccount Number ");
		long accNo = sc.nextLong();

		System.out.println("Enter the Pin ");
		int pin = sc.nextInt();

		boolean status = false;
		User u1 = null;
		for (User user : u) {
			if (pin == user.getPin() && accNo == user.getAccNo()) {
				status = true;
				u1 = user;
				break;
			}
		}
		AtmImplementation atm = new AtmImplementation(u1);
		System.out.println(u1.getAccHolderName() + "   Welcome to Nava Finance ");

		while (status) {
			System.out.println("1.Check Balance \n2.Withdraw \n3.Deposit \n4.Pin Change\n5.Exit");
			int n = sc.nextInt();
			switch (n) {
			case 1 -> atm.CheckBalance();
			case 2 -> atm.WithDraw();
			case 3 -> atm.Deposite();
			case 4 -> atm.PinChange();
			case 5 -> atm.Exit();
			case 6 -> {
				System.out.println("Invalid Details");
			}
			default -> {
				System.out.println("Thanks for Visiting");
			}
			}
		}
	}

}
