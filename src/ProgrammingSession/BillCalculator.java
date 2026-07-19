package ProgrammingSession;

public class BillCalculator {
	
	int units;
	
	public BillCalculator(int units) {
		this.units=units;
	}
	
	public double calculate() {
		
		if(units<=100) {
			return units*5;
		}
		else if(units>=100 && units<=200) {
			double price = 100*5;
			price += ((units-100)*7);
			return price;
		}
		else if(units>200) {
			double price = 100*5;
			price += 100*7;
			units -= 200;
			price += units*10;
			return price;
		}
		
		else {
			return 0;
		}
		
	}

}
