package ProgrammingSession;

public class ATM {
	
	double balance;
	
	public ATM(double balance) {
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
