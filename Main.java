package bankchasier;

import java.util.Locale;
import java.util.Scanner;

import util.BankAccount;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int number;
		String holder;
		double amount;
		char option;
		
		System.out.println("Enter account number: ");
		number = sc.nextInt();
		sc.nextLine(); // consumir o \n
		
		System.out.println("Enter account holder: ");
		holder = sc.nextLine();
		
		System.out.println("Is there initial deposit (y/n)? ");
		option = sc.next().charAt(0);
		
		
		BankAccount profile1 = new BankAccount(number, holder);
		
		
		if(option == 'y') {
			System.out.println("Enter initial deposit value: ");
			amount = sc.nextDouble();
			profile1.deposit(amount);
		}
		
		System.out.println("\nAccount data: ");
		System.out.println(profile1);
		
		System.out.println("\nEnter a deposit value: ");
		amount = sc.nextDouble();
		profile1.deposit(amount);
		
		System.out.println("\nUpdate account data: ");
		System.out.println(profile1);
		
		System.out.println("Enter a withdrawl value: ");
		amount = sc.nextDouble();
		profile1.withdraw(amount);
		
		System.out.println("\nUpdate account data: ");
		System.out.println(profile1);
		
		
		sc.close();
	}

}
