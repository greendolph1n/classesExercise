package com.arraylistChallenge;

import java.util.ArrayList;
//import java.util.Arrays;
import java.util.Scanner;

public class MobilePhone {
	
	
	public static void main(String[] args) {
		boolean quit = false;
		Scanner scanner = new Scanner(System.in);
		ArrayList<String> contactList = new ArrayList<String>();
		Contacts contact = new Contacts(contactList);
		System.out.println("WELCOME TO DEREK'S PHONE APP\n");
		while (quit != true) {
			System.out.println(
					"Options:\n1.Quit\n2.Print list of contacts\n3.Add new contact\n4.Update existing contact\n5.Remove contact\n6.Find contact");
			int option = scanner.nextInt();
			switch (option) {
			case 1:
				quit = true;
				break;
			case 2:
				System.out.println("Your contacts are contained inside this list: "+contact.getContactList()+"\n");
				break;
			case 3:
				scanner.nextLine();
				System.out.println("Enter the name of the contact you'd like to add:");
				String name = scanner.nextLine().toUpperCase();
				contact.addNew(name);
				break;
			case 4:
				scanner.nextLine();
				System.out.println("Which contact would you like to update?");
				String replaceName = scanner.nextLine().toUpperCase();
				System.out.println("What is the name of the new contact?");
				name = scanner.nextLine().toUpperCase();
				contact.update(replaceName, name);
				break;
			case 5:
				scanner.nextLine();
				System.out.println("What is the name of the contact you want to delete?");
				name = scanner.nextLine().toUpperCase();
				contact.removeContact(name);
				break;

			case 6:
				scanner.nextLine();
				System.out.println("Enter the name of the contact you'd like to search for:");
				name = scanner.nextLine().toUpperCase();
				if (contact.findContact(name)) {
					System.out.println("Contact found\n");
				} else {
					System.out.println("Contact not found\n");
				}
				break;
			}
			;
		}
		System.out.println("Thanks for using my app.");
		scanner.close();
	}
}
