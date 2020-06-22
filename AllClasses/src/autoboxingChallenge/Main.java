package autoboxingChallenge;

import java.util.Scanner;

public class Main {
	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		Bank rbm = new Bank("RBM");
		Bank td = new Bank("TD Bank");
		Bank scotia = new Bank("ScotiaBank");
		while (true) {
			System.out.println(
					"What bank are you/or would like to be a member of?\n1.ScotiaBank\n2.TD Bank\n3.RBM\n\nEnter 0 to quit");
			int choice = scanner.nextInt();
			if (choice == 0) {
				break;
			}
			Bank currentBank = null;
			switch (choice) {
			case 1:
				currentBank = scotia;
				break;
			case 2:
				currentBank = td;
				break;
			case 3:
				currentBank = rbm;
				break;
			}
			scanner.nextLine();
			System.out.println(
					"1.Add branch\n2.Join branch and deposit inital amount\n3.Perform transaction (for existing customers)\n4.Show transaction history\n5.Check balance");
			choice = scanner.nextInt();
			switch (choice) {
			case 1:
				addBranch(currentBank);
				System.out.println();
				break;
			case 2:
				joinBranch(currentBank);
				System.out.println();
				break;
			case 3:
				addTransaction(currentBank);
				System.out.println();
				break;
			case 4:
				showTransactions(findBranch(currentBank));
				System.out.println();
				break;
			case 5:
				checkBalance(currentBank, findBranch(currentBank));
				System.out.println();
			}

		}
		scanner.close();
	}

	public static void addBranch(Bank currentBank) {
		scanner.nextLine();
		System.out.println("Enter your branch name:");
		String branchName = scanner.nextLine().toUpperCase();
		Branch branch = new Branch(branchName);
		currentBank.addBranch(branch);
		System.out.println("Branch with name: " + branchName + " added.\nGoing back to MENU screen.");
	}

	public static void joinBranch(Bank currentBank) {
		scanner.nextLine();
		System.out.println("Select which branch you would like to join and your transaction amount\n");
		currentBank.printBranchName();
		int choice = scanner.nextInt();
		Branch currentBranch = currentBank.getBranches().get(choice - 1);
		scanner.nextLine();
		System.out.println("Name:");
		String customerName = scanner.nextLine().toUpperCase();
		System.out.println("Deposit amount:");
		double amount = scanner.nextInt();
		currentBranch.addCustomer(new Customer(customerName, amount));
	}

	public static void addTransaction(Bank currentBank) {
		System.out.println("Select your branch:");
		currentBank.printBranchName();
		int choice = scanner.nextInt();
		Branch currentBranch = currentBank.getBranches().get(choice - 1);
		scanner.nextLine();
		System.out.println("Enter your name:");
		String name = scanner.nextLine().toUpperCase();
		if (currentBranch.searchCustomer(name)) {
			System.out.println("Customer found.\n\n1.Withdraw\n2.Deposit:");
			choice = scanner.nextInt();
			switch (choice) {
			case 1:
				System.out.println("Enter withdrawal amount:");
				double amount = scanner.nextInt();
				currentBranch.getCustomer(name).withdraw(amount);
				System.out.println("Withdrawal of " + amount + " has been processed. Going back to MENU screen.");
				break;
			case 2:
				System.out.println("Enter deposit amount:");
				amount = scanner.nextInt();
				currentBranch.getCustomer(name).deposit(amount);
				System.out.println("Deposit of " + amount + " has been processed. Going back to MENU screen.");
				break;
			}
		} else {
			System.out.println("Customer not found");
		}
	}

	public static Branch findBranch(Bank currentBank) {
		System.out.println("Select your branch:");
		currentBank.printBranchName();
		int choice = scanner.nextInt();
		Branch currentBranch = currentBank.getBranches().get(choice - 1);
		return currentBranch;
	}

	public static void showTransactions(Branch currentBranch) {
		System.out.println("Select which customer transactions you would like to view.");
		currentBranch.showCustomers();
		int choice = scanner.nextInt();
		currentBranch.getCustomers().get(choice - 1).printTransactions();
	}

	public static void checkBalance(Bank currentBank, Branch currentBranch) {
		System.out.println("Select which customer's balance you would like to view");
		currentBranch.showCustomers();
		int choice = scanner.nextInt();
		currentBranch.getCustomers().get(choice - 1).checkBalance();
	}

}
