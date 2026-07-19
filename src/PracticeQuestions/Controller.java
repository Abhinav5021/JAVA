package PracticeQuestions;

import java.util.Scanner;

public class Controller {

	public static void main(String[] args) {
		System.out.println("Welcome to Practice Questions Program :");
		
		System.out.println("Select Question Number to run code from Below : ");
		
		int q=1;
		Scanner sc = new Scanner(System.in);
		
		while(q!=0) {
		
		System.out.println("--------------- Main Menu ---------------");

		System.out.println("1. Create method to print your name");
		System.out.println("2. Create method to add two numbers");
		System.out.println("3. Create method to check even or odd");
		System.out.println("4. Create method to find square of number");
		System.out.println("5. Create method to return largest of two numbers");
		
		System.out.println("0. Exit");
		
		System.out.print("Input : ");
		q = sc.nextInt();
		sc.nextLine();
		Solutions s = new Solutions();
		switch (q) {
		case 1: {
			System.out.print("Enter Your Name : ");
			s.que1(sc.nextLine());
			break;
		}
		case 2:{
			System.out.print("Enter two numbers to add : ");
			int a = sc.nextInt();
			int b = sc.nextInt();
			System.out.println("Addition is : "+ s.que2(a, b));
			break;
		}
		case 3:{
			System.out.println("Enter a number to check even or odd : ");
			int a = sc.nextInt();
			if(s.que3(a)==true) {
				System.out.println("The number is Even");
			}
			else {
				System.out.println("The number is Odd");
			}
			break;
		}
		case 4:{
			System.out.println("Enter a Number to get Square : ");
			int a = sc.nextInt();
			System.out.println("Square of "+a+" is : "+s.que4(a));
			break;
		}
		case 5:{
			System.out.print("Enter two numbers to Find Largest : ");
			int a = sc.nextInt();
			int b = sc.nextInt();
			if(a==b) {
				System.out.println("Both are Equal..!");
			}
			else {
				System.out.println("Largest number is : "+(s.que5(a, b)));
			}
			break;
			
		}
		
		case 0:{
			System.out.println("Thanks for Using this program ... !");
			break;
		}
		default:
			throw new IllegalArgumentException("Unexpected value: " + q);
		}
		
		}
		
		sc.close();
		
		
	}
	
}
