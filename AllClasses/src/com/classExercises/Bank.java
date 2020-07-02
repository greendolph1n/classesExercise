package com.classExercises;


public class Bank {
	private double balance;
	private String name, email,phone,accNum;
	
	public Bank() {
		this("Default Name","Default email","Default Phone Number","Default Account Number",0);
	}
	public Bank(String name, String email, String phone, String accNum, double balance ) {
		this.accNum=accNum;
		this.name=name;
		this.email=email;
		this.phone=phone;
		this.balance=balance;
	}
	
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getAccNum() {
		return accNum;
	}
	public void setAccNum(String accNum) {
		this.accNum = accNum;
	}
	public void deposit(double amount) {
		this.balance+=amount;
		System.out.println("Deposit of "+amount+" made. New balance is:"+this.balance);
	}
	public void withdrawal(double amount) {
		if (this.balance-amount<0) {
			System.out.println("Only "+this.balance+" available.");
		}
		else {
			this.balance-=amount;
			System.out.println("Withdrawal of "+amount+" Processed. Remaining balance:"+this.balance);
		}
	}
	
	
	
	

}
