package ProgrammingSession;

public class BankAccount {
	
	long accNo;
	double balance;
	
	public BankAccount(long accNo,double balance) {
		this.accNo = accNo;
		this.balance = balance;
	}
	
	public double getBal() {
		return balance;
	}
	
	public double deposit(double val) {
		balance+=val;
		return balance;
	}
	
	public double withdrawal(double val) {
		balance-=val;
		return balance;
	}

}
