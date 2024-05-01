package application;

import java.util.Scanner;

import entities.Account;

public class Program {

	public static void main(String[] args) {		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number account: ");
		int numberAccount = sc.nextInt();
		System.out.print("Enter account holder: ");
		sc.nextLine();
		String holder = sc.nextLine();
		System.out.print("Is there an initial deposit? (y/n)");
		char response = sc.next().charAt(0);
		
		Account accountBank;
		
		if (response == 'y') {
			System.out.print("Enter initial deposit value: ");
			double initialDeposit = sc.nextDouble();
			accountBank = new Account(numberAccount, holder, initialDeposit);
		} else {
			accountBank = new Account(numberAccount, holder);
		}
		System.out.println();
		System.out.println("Account data: ");
		System.out.println(accountBank);
		
		System.out.print("Enter a deposit value: ");
		double amount = sc.nextDouble();
		accountBank.deposit(amount);
		System.out.println("Updated account data: ");
		System.out.println(accountBank);
		
		System.out.print("Enter a withdraw value: ");
		amount = sc.nextDouble();
		accountBank.draftBank(amount);
		System.out.println("Updated account data: ");
		System.out.println(accountBank);
		
		sc.close();
	}

}
