package Encapsulation;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int choice = 1;

		while (choice != 0) {
			System.out.println("----------------------- Main Menu -----------------------");
			System.out.println("1. Person");
			System.out.println("2. Bank Account");
			System.out.print("Enter your Choice : ");
			choice = sc.nextInt();
			sc.nextLine();
			switch (choice) {
			case 1: {
				System.out.println("Person : ");
				Person p = new Person();
				System.out.println("Enter Person Name : ");
				String name = sc.nextLine();
				p.setName(name);
				System.out.println("Enter Person Age : ");
				p.setAge(sc.nextInt());

				System.out.println("Name is : " + p.getName() + " and Age is : " + p.getAge());

				break;
			}
			case 2: {
				BankAccount ba = new BankAccount();
				System.out.println("Bank Account : ");
				System.out.println("Enter Initial Balance : ");
				ba.setBalance(sc.nextInt());
				int ch = 1;
				while (ch != 0) {
					System.out.println("1. Check Balance");
					System.out.println("2. Deposit");
					System.out.println("3. Withdrawal");
					System.out.println("0. Exit");
					ch = sc.nextInt();

					switch (ch) {
					case 1: {
						System.out.println("Your Current Balance is : " + ba.getBalance());
						break;
					}
					case 2: {
						System.out.print("Enter Amount to Deposit : ");
						System.out.println("Deposit Success.. Updated balance is : "+ba.deposit(sc.nextDouble()));
						break;
					}
					case 3: {
						System.out.print("Enter Amount to Withdraw : ");
						double amount = sc.nextDouble();
						if (amount > ba.getBalance() && amount > 0) {
							System.err.println("Insufficient Funds .. !!");
						} else {
							System.out.println("Withdrawal Amount is : " + amount);
							System.out
									.println("Withdrawal Successfull..  Updated Balance is : " + ba.withdrawal(amount));
						}
						break;

					}
					case 0:{
						System.out.println("Exited Successfully.. !!");
					}
					default:{
						System.err.println("Invalid Input .. !!");
					}

					}
				}
				break;
			}
			case 0: {
				System.out.println("Exited Successfully .. !!");
			}
			default: {
				System.err.println("Invalid Choice .. !!");
			}

			}

		}
		sc.close();

	}

}
