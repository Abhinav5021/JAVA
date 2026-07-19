package ProgrammingSession;

public class Palindrome {
	
	int num;
	
	public Palindrome(int num) {
		this.num = num;
	}
	
	
	public String palindrome() {
		int rev=0;
		int original = num;
		
		while(num!=0) {
			
			rev = rev*10+(num%10);
			num/=10;
			
		}

		if(original==rev) {
			return "Number is Palindrome";
		}
		else {
			return "Number is not Palindrome";
		}
		
	}

}
