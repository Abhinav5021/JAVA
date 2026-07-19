package ProgrammingSession;

public class Largest {
	
	int a,b,c;
	
	public Largest(int a, int b, int c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}
	
	public int largest() {
		
		if(a>b&&a>c) {
			return a;
		}
		else if(b>a&&b>c) {
			return b;
		}
		else {
			return c;
		}
		
	}

}
