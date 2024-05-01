package entities;

public class Account {
	//declaração dos atributos
	private String holder;
	private int numberAccount;
	private double balance;
	
	//construtor  
	public Account (int numberAccount, String holder) {
		this.holder = holder;
		this.numberAccount = numberAccount;
	}
	
	public Account (int numberAccount, String holder, double initialDeposit) {
		this.holder = holder;
		this.numberAccount = numberAccount;
		deposit(initialDeposit);
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public int getNumberAccount() {
		return numberAccount;
	}

	public double getBalance() {
		return balance;
	}
	
	public void deposit(double amount) {
		balance += amount;
	}
	
	public void draftBank(double amount) {
		balance -= amount + 5.00; 
	}
	
	public String toString() {
		return "Account: " + numberAccount
				+ ", Holder: " + holder
				+ ", Balance: $" 
				+ String.format("%.2f", balance);
				
	}
}
