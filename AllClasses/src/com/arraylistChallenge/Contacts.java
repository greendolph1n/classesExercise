package com.arraylistChallenge;

import java.util.ArrayList;

public class Contacts {
	private ArrayList<String> contactList = new ArrayList<String>();

	public Contacts(ArrayList<String> contactList) {
		super();
		this.contactList = contactList;
	}

	public ArrayList<String> getContactList() {
		return contactList;
	}
	

	public void addNew(String name) {
		if (findContact(name) != true) {
			this.contactList.add(name);
			System.out.println(name + " has been added to your contacts.\n");
		} else {
			System.out.println("Error: Contact already exists.\n");
		}
	}

	public void update(String replaceName, String name) {
		if (findContact(replaceName)) {
			int nameIndex = contactList.indexOf(replaceName);
			contactList.remove(nameIndex);
			contactList.add(nameIndex, name);
			System.out.println(replaceName + " has been replaced with " + name + "\n");
		} else {
			System.out.println(replaceName + " does not exist in contacts.\n");
		}
	}

	public void removeContact(String name) {
		if (findContact(name)) {
			int nameIndex = contactList.indexOf(name);
			contactList.remove(nameIndex);
			System.out.println(name + " has been removed from contacts.\n");
		} else {
			System.out.println("This contact does not exist.\n");
		}

	}

	public boolean findContact(String name) {
		if (this.contactList.indexOf(name) > -1) {
			return true;
		}
		return false;
	}

}
