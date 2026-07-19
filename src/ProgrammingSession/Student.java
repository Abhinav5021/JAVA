package ProgrammingSession;

public class Student {
	
	String name;
	int marks;
	
	public Student(String name, int marks) {
		
		this.name = name;
		this.marks = marks;
		
	}
	
	public boolean isPass(){
		
		if(marks>=40) {
			return true;
		}
		else {
			return false;
		}
		
	}
	
	//For Question no. 10
	
	public Student(int marks) {
		this.marks = marks;
	}
	
	public String grade() {
		if(marks>=90&&marks<=100) {
			return "A";
		}
		else if(marks>=70&&marks<90) {
			return "B";
		}
		else if(marks>=40&&marks<70) {
			return "C";
		}		
		else {
			return "FAIL";
		}
	}

}
