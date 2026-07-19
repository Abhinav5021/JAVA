package ProgrammingSession;

public class NumRev {
	
	int num;
	
	public NumRev(int num) {
		this.num = num;
	}
	
	
	public int reverse() {
		int rev=0;
		
		while(num!=0) {
			
			rev = rev*10+(num%10);
			num/=10;
			
		}
		
		return rev;
	}
	
	

}
