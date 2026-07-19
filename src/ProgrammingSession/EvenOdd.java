package ProgrammingSession;

public class EvenOdd {

	int num;

	public EvenOdd(int num) {
		this.num = num;
	}

	public void isEvenOdd() {
		if(num%2==0) {
			System.out.println(num + " is Even ");
		}
		else {
			System.out.println(num + " is Odd ");
		}
	}

}
