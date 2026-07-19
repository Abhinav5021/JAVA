package ProgrammingSession;

public class Fibonacci {
	
	int term;
	int firstTerm=0,secondTerm=1,nextTerm;
	
	public Fibonacci(int term) {
		this.term = term;	
	}
	
	
	public void calculate() {
		System.out.print("Fibonacci Series upto "+term+" terms is : ");
		for(int i=1;i<=term;i++) {
			System.out.print(firstTerm+" ");
			
			nextTerm = firstTerm+secondTerm;
			firstTerm = secondTerm;
			secondTerm = nextTerm;
		}
	}

}
