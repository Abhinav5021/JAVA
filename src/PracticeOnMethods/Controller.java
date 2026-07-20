package PracticeOnMethods;

import java.util.Scanner;

public class Controller {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Operations o = new Operations();

		boolean b = true;

		while (b) {
			System.out.println("Main Menu : ");
			System.out.println("1. ATM ");
			System.out.println("2. Result ");
			System.out.println("3. Recharge");
			System.out.println("4. Temperature ");
			System.out.println("5. Login ");
			System.out.println("6. ATM ");
			System.out.println("7. Salary ");
			System.out.println("8. Interest ");
			System.out.println("9. Food Order ");
			System.out.println("10. Electricity Bill ");
			System.out.println("11. Vote ");
			System.out.println("12. Fares ");
			System.out.println("13. Check Pass");
			System.out.println("14. IssueBook");
			System.out.println("15. Shopping Cart Total ");
			System.out.println("16. Find Max of 3");
			System.out.println("17. Prime number Check ");
			System.out.println("18. Palindrome Check ");
			System.out.println("19. Even/Odd Counter ");
			System.out.println("20. Grade Calculator ");
			System.out.println("0. Exit ");

			System.out.println("Enter Your Choice :  ");
			int c = sc.nextInt();
			sc.nextLine();

			switch (c) {

				case 1: {
					boolean control = true;

					while (control) {
						System.out.println("1. Check Balance");
						System.out.println("2. Deposit");
						System.out.println("3. Withdrawal");

						System.out.println("0. Exit");

						System.out.print("Enter Your choice : ");
						int n = sc.nextInt();

						switch (n) {

							case 1: {
								System.out.println(o.checkBalance());
								break;
							}
							case 2: {
								System.out.print("Enter Amount to Deposit : ");
								long amount = sc.nextLong();
								System.out.println("Deposit Success.. New Balance is : " + o.deposit(amount));
								break;
							}
							case 3: {
								System.out.print("Enter Amount to Withdraw : ");
								long amount = sc.nextLong();
								if (amount <= o.checkBalance()) {
									System.out.println("Withdrawal Success.. New Balance is : " + o.withdraw(amount));
								} else {
									System.out.println("Insufficient Funds ...!!");
								}
								break;
							}
							case 0: {
								control = false;
							}
							default: {
								System.out.println("Invalid Input...!!");
							}
						}
					}
					break;
				}

				case 2: {

					System.out.println("Percentage is : " + o.calculate());

				}

				case 3: {
					System.out.println("Enter Mobile Number : ");
					long mobNo = sc.nextLong();
					System.out.println("Enter Recharge Amount : ");
					int amount = sc.nextInt();
					Recharge r = new Recharge();
					r.recharge(mobNo, amount);
					break;

				}

				case 4: {
					System.out.println("Enter Temperature in Celcius : ");
					double celcius = sc.nextDouble();
					System.out.println("Fahrenheit : " + o.celsiusToFahrenheit(celcius));
					break;

				}

				case 5: {
					System.out.println("Enter Username : ");
					String uName = sc.nextLine();
					System.out.println("Enter Password : ");
					String pass = sc.nextLine();
					System.out.println(o.login(uName, pass));
					break;

				}

				case 6: {
					System.out.println("Enter Amount : ");
					double amount = sc.nextDouble();
					System.out.println("Enter Discount Percentage : ");
					double discount = sc.nextDouble();
					System.out.println("Amount after Discount is : " + o.calculateDiscount(amount, discount));
					break;

				}

				case 7: {
					System.out.println("Enter Basic Salary : ");
					double basic = sc.nextDouble();
					System.out.println("Total Salary is : " + o.calculateSalary(basic));
					break;

				}

				case 8: {
					System.out.println("Enter Principal Amount : ");
					double p = sc.nextDouble();
					System.out.println("Enter Rate of Interest : ");
					double r = sc.nextDouble();
					System.out.println("Enter Time in Years : ");
					int t = sc.nextInt();
					System.out.println("Total Interest : " + o.calculateInterest(p, r, t));
				}

				case 9: {
					System.out.println("Enter Item Name : ");
					String item = sc.nextLine();
					System.out.println("Enter Price : ");
					double price = sc.nextDouble();
					System.out.println("Enter Quantity : ");
					int q = sc.nextInt();
					o.order(item, price, q);
					break;
				}

				case 10: {
					System.out.println("Enter Billing Units : ");
					int units = sc.nextInt();
					System.out.println("Total Cost : " + o.calculateBill(units));
					break;

				}

				case 11: {
					System.out.println("Enter Your Age : ");
					int age = sc.nextInt();
					if (o.vote(age)) {
						System.out.println("You are Eligible for Voting");
					} else {
						System.out.println("You are not Eligible for Voting");
					}
					break;

				}

				case 12: {
					System.out.println("Enter Distance in KMs : ");
					double km = sc.nextDouble();
					System.out.println("Enter Fare per KM : ");
					double fare = sc.nextDouble();
					System.out.println("Total Fare is : " + o.calculateFare(km, fare));
					break;
				}

				case 13: {

					System.out.println("Enter Your Password : ");
					String pass = sc.nextLine();
					System.out.println("Your Password is : " + o.checkPassword(pass));
					break;

				}

				case 14: {

					boolean control = true;
					while (control) {

						System.out.println("Main Menu : ");
						System.out.println("1. Java");
						System.out.println("2. Python");
						System.out.println("3. C");
						System.out.println("4. C++");
						System.out.println("Enter Book Name : ");
						String name = sc.nextLine();
						{
							switch (name) {
								case "Java": {
									System.out.println("You selected Java");
									int java = 4;
									System.out.println("Enter Quantity : ");
									o.issueBook(name, java, sc.nextInt());
									break;
								}
								case "Python": {
									System.out.println("You selected Python");
									int python = 3;
									break;
								}
								case "C": {
									System.out.println("You selected C");
									int C = 5;
									break;
								}
								case "C++": {
									int cpp = 4;
									System.out.println("You selected C++");
									break;
								}
								case "Exit": {
									System.out.println("You selected Exit");
									control = false;
									break;
								}
								default: {
									System.out.println("Invalid ..!!");
								}

							}
						}
					}

					break;
				}
				case 15: {
									
					System.out.println("Enter Price of The followings : ");
					System.out.println("Product 1 : ");
					double price1 = sc.nextDouble();
					System.out.println("Product 2 : ");
					double price2 = sc.nextDouble();
					System.out.println("Product 3 : ");
					double price3 = sc.nextDouble();
					System.out.println("Total Price is : "+o.calculatePrice(price1, price2, price3));
					
					break;
				}
				case 16: {
					
					System.out.println("Enter Three numbers : ");
					System.out.println("Number 1 : ");
					int a1 = sc.nextInt();
					System.out.println("Number 2 : ");
					int b1 = sc.nextInt();
					System.out.println("Number 3 : ");
					int c1 = sc.nextInt();
					
					 System.out.println("Largerst of the Given numbers is : "+o.largest(a1, b1, c1));
					
					
					break;
				}
				case 17: {
					
					System.out.println("Enter number to check if isPrime : ");
					int num = sc.nextInt();
					System.out.println("Number is Prime : " +o.isPrime(num));
					break;
				}
				case 18: {
					
					System.out.println("Enter a number to check Palindrome : ");
					int num = sc.nextInt();
					System.out.println(o.palindrome(num));
					break;
				}
				case 19: {
					
					System.out.println("Enter number of digits to Enter : ");
					int n = sc.nextInt();
					int[] arr = new int[n];
					
					System.out.println("Enter 5 numbers : ");
					
					for(int i=0;i<n;i++) {
						
						arr[i] = sc.nextInt();
						
					}
					o.calculateEvenOdd(arr);
					System.out.println("Entered Array of Numbers contains : "+o.even+" Even & "+o.odd+" Odd Numbers.");
					
					break;
				}
				case 20: {
					System.out.println("Enter The Marks : ");
					int marks = sc.nextInt();
					System.err.println("Your Grade is : " + o.getGrade(marks));
					break;
				}

				case 0: {
					System.out.println("Exited Successfully ...!! ");
					b = false;
					break;
				}

				default:
					throw new IllegalArgumentException("Invalid Input !!");
			}

		}
		sc.close();
	}

}
