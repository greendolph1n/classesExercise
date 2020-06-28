package com.autoboxingChallenge;

import java.util.ArrayList;

public class Bank {

	private ArrayList<Branch> branches = new ArrayList<Branch>();
	private String branchName, customerName, bankName;
	private double amount;

	public Bank(ArrayList<Branch> branches, String branchName, String customerName, String bankName, double amount) {
		this.branches = branches;
		this.branchName = branchName;
		this.customerName = customerName;
		this.bankName = bankName;
		this.amount = amount;
	}

	public Bank(String bankName) {
		this.bankName = bankName;
	}

	public ArrayList<Branch> getBranches() {
		return branches;
	}

	public String getBranchName() {
		return branchName;
	}

	public String getCustomerName() {
		return customerName;
	}

	public double getAmount() {
		return amount;
	}

	public void addBranch(Branch branch) {
		this.branches.add(branch);
	}

	public void addCustomer(Branch branch, Customer customer) {
		branch.addCustomer(customer);
	}

	public void printBranchName() {
		int count = 0;
		for (Branch branch : branches) {
			count++;
			System.out.println(count + "." + branch.getName());
		}
	}

}
