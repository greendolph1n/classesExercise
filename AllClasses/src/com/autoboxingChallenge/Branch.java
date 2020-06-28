package com.autoboxingChallenge;

import java.util.ArrayList;

public class Branch {
	private ArrayList<Customer> customers = new ArrayList<Customer>();
	private String name;

	public Branch(ArrayList<Customer> customers, String name) {
		this.customers = customers;
		this.name = name;
	}

	public Branch(String name) {
		this.name = name;
	}

	public ArrayList<Customer> getCustomers() {
		return this.customers;
	}

	public void setCustomers(ArrayList<Customer> customers) {
		this.customers = customers;
	}

	public String getName() {
		return this.name;
	}
	

	public void addCustomer(Customer customer) {
		this.customers.add(customer);
	}
	public Customer getCustomer(String name) {
		for (Customer customer:customers) {
			if(customer.getName().equals(name));{
				return customer;
			}
		}
		return null;
	}

	public boolean searchCustomer(String name) {
		for (Customer customer:customers) {
			if(customer.getName().contentEquals(name)){
				return true;
			}
		}
		return false;
	}
	
	public void showCustomers() {
		int count=0;
		for (Customer customer:customers) {
			count++;
			System.out.println(count+"."+customer.getName());
		}
	}

}
