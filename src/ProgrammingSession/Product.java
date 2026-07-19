package ProgrammingSession;

public class Product {
	
	double price;
	
	public Product(double price) {
		
		this.price = price;
		
	}
	
	public double getPrice() {
		if(price>1000) {
			return (price-(price*0.1));
		}
		else {
			return price;
		}
	}

}
