package Encapsulation;

public class BankAccount {

	private double balance = 5000;

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	public double deposit(double amount) {
		balance+=amount;
		return balance;
	}
	public double withdrawal(double amount) {
		balance-=amount;
		return balance;
	}

	

}
