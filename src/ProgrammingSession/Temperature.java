package ProgrammingSession;

public class Temperature {
	
	double celcius;
	
	public Temperature(double celcius) {
		this.celcius = celcius;
	}
	
	public double temp() {
		return ((celcius*1.8)+32);
	}

}
