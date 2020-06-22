package autoboxingChallenge;

import java.util.ArrayList;

public class Customer {
	private String name;
	private ArrayList<Double> transactions = new ArrayList<Double>();

	public Customer(String name, Double amount) {
		this.name = name;
		this.transactions.add(amount);
	}

	public String getName() {
		return name;
	}

	public ArrayList<Double> getTransactions() {
		return transactions;
	}

	public void printTransactions() {
		int count = 0;
		System.out.println("TRANSACTION HISTORY:\n");
		for (Double transaction : transactions) {
			count++;
			System.out.println(count + "." + transaction);
		}
	}

	public void checkBalance() {
		double total = 0;
		for (Double transaction : transactions) {

			total += transaction;
		}
		System.out.println(this.name + "'s balance is " + total);
	}

	public void deposit(Double amount) {
		this.transactions.add(amount);
	}

	public void withdraw(Double amount) {
		if (amount > 0) {
			this.transactions.add(amount * -1.0);
		}
	}

}
