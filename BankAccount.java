package util;

public class BankAccount {
	
	private int numberAccount;
	private String holder; //titular
	private double balance;
	
	public BankAccount(int numberAccount, String holder) {
		this.numberAccount = numberAccount;
		this.holder = holder;
	}
	public BankAccount(int numberAccount, String holder, double initialDeposit) {
		this.numberAccount = numberAccount;
		this.holder = holder;
		deposit(initialDeposit);
	}
	
	
	public int getNumberAccount() {
		return numberAccount;
	}
	public String getHolder() {
		return holder;
	}
	public double getBalance() {
		return balance;
	}
	
	
	public void deposit(double amount) {
		this.balance += amount;
	}
	
	public void withdraw(double amount) {
		this.balance -= amount + 5.0;
	}
	
	public String toString() {
		return String.format("Account %d, Holder: %s, Balance: $ %.2f", numberAccount, holder, balance);
	}
	
}
