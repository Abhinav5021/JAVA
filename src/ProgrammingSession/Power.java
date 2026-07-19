package ProgrammingSession;

public class Power {
	
	int base;
	int exp;
	
	public Power(int base,int exp) {
		this.base = base;
		this.exp = exp;
	}
	public int calculate() {
		int result=0;
		for(int i=1;i<=exp;i++) {
			result += base*base;
		}
		
		return result;
	}

}
