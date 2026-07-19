package ProgrammingSession;

public class Interest {
	
	double principal;
	double rate;
	double time;
	
	public Interest(double principal,double rate, double time){
		this.principal = principal;
		this.rate = rate;
		this.time = time;
	}
	
	public double interest() {
		return ((principal*rate*time)/100);
	}

}
