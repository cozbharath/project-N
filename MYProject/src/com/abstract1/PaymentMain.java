package com.abstract1;

public class PaymentMain {

	public static void main(String[] args) {

		Payment[] payments = new Payment[3];
		payments[0] = new Upi("nava@8184", 2002, "State Bank of India");
		payments[1] = new CreditCard(286610100034110L, "Nava@8184");
		payments[2] = new DebitCard(1234, 2001, 5000.00);
		
		double amount = 2000;
		
		for(Payment p:payments) {
			System.out.println("----------------------------");
			
			p.pay(amount);
		}
	}

}
