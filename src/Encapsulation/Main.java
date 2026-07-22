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
			switch (choice) {
			case 1: {
				System.out.println("Person");
				break;
			}
			case 2: {
				System.out.println("Bank Account");
				break;
			}
			}

		}
		sc.close();

	}

}
