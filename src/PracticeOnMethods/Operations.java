package PracticeOnMethods;

import java.util.Scanner;

public class Operations {

	Scanner sc = new Scanner(System.in);

	//	ATM Methods
	double balance = 5000;


	public double checkBalance() {

		return balance;

	}

	public double deposit(long amount){

		balance+=amount;

		return balance;

	}

	public double withdraw(long amount) {

		balance-=amount;

		return balance;

	}

	//	End


	public float calculate() {
		float percentage=0;

		System.out.println("Enter Marks of 3 subjects out  of 100 : ");
		float m1=sc.nextFloat();
		float m2=sc.nextFloat();
		float m3=sc.nextFloat();

		percentage = (((m1+m2+m3)/300)*100);

		return percentage;
	}


	public double celsiusToFahrenheit(double celcious){
		double faherenheit = (celcious*1.8)+32;

		return faherenheit;

	}

	public boolean login(String uName, String pass) {
		if(uName=="Abhinav"&&pass=="1234"){
			return true;
		}
		else {
			return false;
		}
	}

	public double calculateDiscount(double amount, double discount) {
		double a = discount/100;

		return amount-a;
	}

	public double calculateSalary(double basic) {
		double hra  = 0.1, da=0.15;

		return basic+(basic*hra)+(basic*da);

	}

	public double calculateInterest(double principal, double rate, int time) {

		return principal*(rate/100)*time;
	}

	public void order(String item,double price, int quantity) {
		System.out.println("Item name : "+item+" Quantity : "+quantity+ " Total Price : "+(price*quantity));
	}


	public double calculateBill(int unit) {
		return unit*4.43;
	}

	public boolean vote(int age) {
		if(age>=18) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public double calculateFare(double km, double fare) {
		return km*fare;
	}

	public String checkPassword(String pass) {
		if(pass.length()>=8) {
			return "Strong";
		}
		else {
			return "Weak";
		}
	}

	public void issueBook(String name, int available, int qty) {
		if(qty<=available) {
			
		}
		
	}
	
	public double calculatePrice(double price1, double price2, double price3) {
		return price1+price2+price3;
	}
	
	

}