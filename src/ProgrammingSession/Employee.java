package ProgrammingSession;

public class Employee {

	String name;
	double salary;
	
	public Employee(String name,double salary) {
		
		this.name = name;
		this.salary = salary;
		
	}
	
	public double Salary() {
		
		return (salary+(salary*0.2));
		
	}
	
}
