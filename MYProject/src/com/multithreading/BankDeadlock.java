package com.multithreading;

class Account {

	String accountName;
	int balance;

	Account(String accountName, int balance) {
		this.accountName = accountName;
		this.balance = balance;
	}

	public void transfer(Account destination, int amount) {

		synchronized (this) {

			System.out.println(Thread.currentThread().getName() + " locked " + accountName);

			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

			System.out.println(Thread.currentThread().getName() + " waiting for " + destination.accountName);

			synchronized (destination) {

				if (balance >= amount) {

					balance -= amount;
					destination.balance += amount;

					System.out.println(amount + " transferred from " + accountName + " to " + destination.accountName);

				}
			}
		}
	}
}

public class BankDeadlock {

	public static void main(String[] args) {

		Account accountA = new Account("Account-A", 10000);
		Account accountB = new Account("Account-B", 20000);

		Thread t1 = new Thread(() -> {

			accountA.transfer(accountB, 1000);

		}, "Thread-1");

		Thread t2 = new Thread(() -> {

			accountB.transfer(accountA, 2000);

		}, "Thread-2");

		t1.start();
		t2.start();
	}
}