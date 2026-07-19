package ProgrammingSession;

import java.util.Scanner;

public class Controller {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		boolean control = true;
		while(control) {

			System.out.println("--------------- Main Menu ---------------");

			System.out.println("1. Student Details");
			System.out.println("2. Rectangle Area");
			System.out.println("3. Employee Salary");
			System.out.println("4. Circle Operations");
			System.out.println("5. Simple Interest");
			System.out.println("6. Even or Odd");
			System.out.println("7. Temperature Converter");
			System.out.println("8. Bank Account");
			System.out.println("9. Product Discount");
			System.out.println("10. Student Grade");
			System.out.println("11. Number Reverse");
			System.out.println("12. Palindrome Check");
			System.out.println("13. Power Calculation");
			System.out.println("14. Max of Three Numbers");
			System.out.println("15. ATM Machine Simulation");
			System.out.println("16. Shopping Cart");
			System.out.println("17. Electricity Bill");
			System.out.println("18. Fibonacci Series");
			System.out.println("19. Prime Number Check");
			System.out.println("20. Library System");

			System.out.println("0. Exit");

			System.out.print("Input : ");
			int choice = sc.nextInt();
			sc.nextLine();

			switch(choice) {

			case 1:{

				System.out.println("Enter Student Name : ");
				String name = sc.nextLine();
				System.out.println("Enter Student Marks : ");
				int marks = sc.nextInt();
				Student s = new Student(name,marks);
				if(s.isPass()) {
					System.out.println(name + " is Pass with "+ marks +" Marks ");
				}
				else {
					System.out.println(name + " is Fail with "+ marks +" Marks ");
				}

				break;
			}
			case 2:{

				System.out.println("Enter Length of Rectangle : ");
				int length = sc.nextInt();
				System.out.println("Enter Breadth of Rectangle : ");
				int breadth = sc.nextInt();

				Rectangle r = new Rectangle(length,breadth);
				System.out.println("Area of the Rectangle is : "+r.area());


				break;
			}
			case 3:{

				System.out.println("Enter Employee Name : ");
				String name = sc.nextLine();
				System.out.println("Enter Employee Salary : ");
				double salary = sc.nextDouble();
				Employee e = new Employee(name, salary);

				System.out.println("Total Salary of"+ name +" is "+e.Salary() );				

				break;
			}
			case 4:{

				System.out.println("Enter the radius of the Circle : ");
				double r = sc.nextDouble();
				Circle c = new Circle(r);

				System.out.println("Area of the Circle is : "+c.area());
				System.out.println("Circumference of the Circle is : "+c.circumference());


				break;
			}
			case 5:{

				System.out.println("Enter the principal Amount : ");
				double p = sc.nextDouble();
				System.out.println("Enter Rate : ");
				double r = sc.nextDouble();
				System.out.println("Enter the  Time : ");
				double t = sc.nextDouble();
				Interest i = new Interest(p, r, t);

				System.out.println("Total Interest is : "+i.interest());

				break;
			}
			case 6:{

				System.out.println("Enter a number to check if Even or Odd : ");
				int num = sc.nextInt();
				EvenOdd eo =  new EvenOdd(num);

				break;
			}
			case 7:{

				System.out.println("Enter the Temperature in Celcius : ");
				double temp=sc.nextDouble();
				Temperature t =  new Temperature(temp);

				System.out.println("Temperature in Fahrenheit is : "+t.temp());
				break;
			}
			case 8:{

				System.out.println("Enter Account Number : ");
				long acc = sc.nextLong();
				System.out.println("Enter Initial Balance : ");
				double bal = sc.nextDouble();
				BankAccount b = new BankAccount(acc, bal);
				boolean c = true;
				while(c) {
					System.out.println("Bank Menu : ");
					System.out.println("1. Check Balance");
					System.out.println("2. Deposit");
					System.out.println("3. Withdrawal");
					System.out.println("0. Exit");
					System.out.print("Enter Choice : ");
					int ch = sc.nextInt();
					switch(ch){
					case 1:{
						System.out.println("Balance is : "+b.getBal());
						break;
					}
					case 2:{
						System.out.println("Enter  Deposit Amount : ");
						double amount = sc.nextDouble();
						System.out.println("Success..!! new Balance is : "+b.deposit(amount));
						break;
					}
					case 3:{
						System.out.println("Enter Withdrawal Amount : ");
						double amount = sc.nextDouble();
						if(amount > b.getBal()) {
							System.out.println("Insufficient Funds .. !");
						}
						else {
							System.out.println("Success..!! new Balance is : "+b.withdrawal(amount));
						}
						break;
					}
					case 0:{
						System.out.println("Exited Successfully.. !");
						c = false;
						break;
					}
					default:{
						System.out.println("Invalid Input .. !");
					}
					}

				}

				break;
			}
			case 9:{
				System.out.println("Enter Product Price  : ");
				double price = sc.nextDouble();
				Product p = new Product(price);
				System.out.println("The final Price of the product is : "+p.getPrice());
				
				break;
			}
			case 10:{
				System.out.println("Enter Student Marks : ");
				int marks = sc.nextInt();
				Student s = new Student(marks);
				System.out.println("Student Grade is : "+s.grade());
				
				break;
			}
			case 11:{
				System.out.println("Enter a Number to Reverse : ");
				int num = sc.nextInt();
				NumRev n = new NumRev(num);
				System.out.println("Reverse of the number is : "+n.reverse());
				
				break;
			}
			case 12:{
				System.out.println("Enter a Number to Check Palindrome :");
				int num = sc.nextInt();
				Palindrome p = new Palindrome(num);
				System.out.println(p.palindrome());
				break;
			}
			case 13:{
				System.out.println("Calculating Power of a Number");
				System.out.println("Enter the Base : ");
				int base = sc.nextInt();
				System.out.println("Enter the Exponent : ");
				int exp = sc.nextInt();
				
				Power p = new Power(base, exp);
				System.out.println("Value is : "+p.calculate());
				break;
			}
			case 14:{
				
				System.out.println("Finding the largest of 3 Numbers : ");
				System.out.println("Enter Number A : ");
				int a = sc.nextInt();
				System.out.println("Enter Number B : ");
				int b = sc.nextInt();
				System.out.println("Enter Number C : ");
				int c = sc.nextInt();
				Largest l = new Largest(a, b, c);
				System.out.println("Largest of the given Numbers is : "+l.largest() );
				
				break;
			}
			case 15:{
				
				System.out.println("Welcome to ATM : ");
				double bal = 5000;
				ATM atm = new ATM(bal);
				boolean c = true;
				while(c) {
					System.out.println("Bank Menu : ");
					System.out.println("1. Check Balance");
					System.out.println("2. Deposit");
					System.out.println("3. Withdrawal");
					System.out.println("0. Exit");
					System.out.print("Enter Choice : ");
					int ch = sc.nextInt();
					switch(ch){
					case 1:{
						System.out.println("Balance is : "+atm.getBal());
						break;
					}
					case 2:{
						System.out.println("Enter  Deposit Amount : ");
						double amount = sc.nextDouble();
						System.out.println("Success..!! new Balance is : "+atm.deposit(amount));
						break;
					}
					case 3:{
						System.out.println("Enter Withdrawal Amount : ");
						double amount = sc.nextDouble();
						if(amount > atm.getBal()) {
							System.out.println("Insufficient Funds .. !");
						}
						else {
							System.out.println("Success..!! new Balance is : "+atm.withdrawal(amount));
						}
						break;
					}
					case 0:{
						System.out.println("Exited Successfully.. !");
						c = false;
						break;
					}
					default:{
						System.out.println("Invalid Input .. !");
					}
					}

				}
				
				break;
			}
			case 16:{
				System.out.println("Shopping Cart : ");
				System.out.println("Enter Product Price : ");
				double price = sc.nextDouble();
				System.out.println("Enter Purchase Quantity : ");
				int quantity = sc.nextInt();
				ShoppingCart cart = new ShoppingCart(price, quantity);
				System.out.println("Final Price is : "+cart.calculate());
				
				break;
			}
			case 17:{				
				System.out.println("Electricity Bill Calculator");
				System.out.println("Enter Billing Units : ");
				int units = sc.nextInt();
				BillCalculator b = new BillCalculator(units);
				if(units==0) {
					System.out.println("Invalid Units..!!");
				}
				else {
					System.out.println("Total Bill Amount is : "+b.calculate());
				}
				break;
			}
			case 18:{				
				System.out.println("Enter a term to Calculate Fibonacci Series : ");
				int term = sc.nextInt();
				Fibonacci f = new Fibonacci(term);
				f.calculate();
				System.out.println();
				
				break;
			}
			case 19:{
				System.out.println("Enter the number till where you want to find prime Number : ");
				int num = sc.nextInt();
				Prime p = new Prime(num);
				p.prime();
				break;
			}
			case 20:{
				break;
			}





			case 0:{
				System.out.println("Thanks for using this software .. !!");
				System.out.println("Exited Successfully..!");
				control=false;
				break;
			}

			default:{
				System.out.println("Invalid Input ... !!");
			}



			}


		}


		sc.close();
	}

}


//1. Student Details
//
//Create a Student class:
//
//Constructor initializes name, marks
//Method to display result (Pass/Fail)
//
//2. Rectangle Area
//Create a Rectangle class:
//Constructor takes length & breadth
//Method to calculate and print area
//
//3. Employee Salary
//Create Employee:
//Constructor â†’ name, basicSalary
//Method â†’ calculate total salary (add 20% bonus)
//
//4. Circle Operations
//Create Circle:
//Constructor â†’ radius
//Methods â†’ area & circumference
//
//5. Simple Interest
//Create Interest class:
//Constructor â†’ principal, rate, time
//Method â†’ calculate SI
//
//6. Even or Odd
//Create class:
//Constructor â†’ number
//Method â†’ check even/odd
//
//7. Temperature Converter
//Create class:
//Constructor â†’ Celsius
//Method â†’ convert to Fahrenheit
//
//
//8. Bank Account
//Create BankAccount:
//Constructor â†’ accountNumber, balance
//Methods:
//deposit()
//withdraw()
//displayBalance()
//
//9. Product Discount
//Create Product:
//Constructor â†’ price
//Method â†’ apply 10% discount if price > 1000
//
//10. Student Grade
//Create Student:
//Constructor â†’ marks
//Method â†’ return grade (A/B/C/Fail)
//
//11. Number Reverse
//Create class:
//Constructor â†’ number
//Method â†’ reverse number
//
//12. Palindrome Check
//Create class:
//Constructor â†’ number
//Method â†’ check palindrome
//
//13. Power Calculation
//Create class:
//Constructor â†’ base, exponent
//Method â†’ calculate power without using Math.pow()
//
//14. Max of Three Numbers
//Create class:
//Constructor â†’ 3 numbers
//Method â†’ find largest
//
//15. ATM Machine Simulation
//Create ATM:
//Constructor â†’ initial balance
//Methods:
//deposit
//withdraw
//check balance
//Add condition for insufficient balance
//
//16. Shopping Cart
//Create Cart:
//Constructor â†’ item price & quantity
//Method â†’ calculate total bill
//Add discount if total > 5000
//
//17. Electricity Bill
//Create ElectricityBill:
//Constructor â†’ units
//Method â†’ calculate bill:
//0â€“100 â†’ â‚¹5/unit
//101â€“200 â†’ â‚¹7/unit
//200+ â†’ â‚¹10/unit
//
//18. Fibonacci Series
//Create class:
//Constructor â†’ number of terms
//Method â†’ print Fibonacci series
//
//19. Prime Number Check
//Create class:
//Constructor â†’ number
//Method â†’ check prime
//
//20. Library System
//Create Library:
//Constructor â†’ bookName, isIssued (boolean)
//Methods:
//issueBook()
//returnBook()
//Prevent issuing if already issued