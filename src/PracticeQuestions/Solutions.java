package PracticeQuestions;

public class Solutions {

	public void que1(String name) {

		System.out.println("Hello "+name);

	}
	public int que2(int a, int b) {

		//		System.out.println("Addition is : "+(a+b));
		return a+b;

	}
	public boolean que3(int a) {
		if(a%2==0) {
			return true;
		}
		return false;
	}
	public int que4(int a) {

		return a*a;

	}
	public int que5(int a, int b) {
		if(a>b) {
			return a;
		}
		else {
			return b;
		}
	}
}
