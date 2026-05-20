package com.atmproject;

public class User {
	 long accNo;
	String accHolderName;
	int pin;
	double balance;

	public long getAccNo() {
		return accNo;
	}

	public void setAccNo(long accNo) {
		this.accNo = accNo;
	}

	public String getAccHolderName() {
		return accHolderName;
	}

	public void setAccHolderName(String accHolderName) {
		this.accHolderName = accHolderName;
	}

	public int getPin() {
		return pin;
	}

	public void setPin(int pin) {
		this.pin = pin;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	/**
	 * @param accNo
	 * @param accHolderName
	 * @param pin
	 * @param balance
	 */
	public User(long accNo, String accHolderName, int pin, double balance) {
		super();
		this.accNo = accNo;
		this.accHolderName = accHolderName;
		this.pin = pin;
		this.balance = balance;
	}
	
	User() {
		
	}
	
}
