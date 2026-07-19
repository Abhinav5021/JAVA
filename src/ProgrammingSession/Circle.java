package ProgrammingSession;

public class Circle {
	
	double r;
	double PI = 3.14;
	
	public Circle(double r) {
		this.r = r;
	}
	
	public double area() {
		
		return (PI*(r*r));
		
	}
	
	public  double circumference() {
		
		return (2*PI*r);
		
	}
}
