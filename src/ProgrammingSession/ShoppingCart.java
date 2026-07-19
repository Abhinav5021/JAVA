package ProgrammingSession;

public class ShoppingCart {
	
	double itemPrice;
	int quantity;
	
	public ShoppingCart(double itemPrice, int quantity) {
		
		this.itemPrice = itemPrice;
		this.quantity = quantity;
		
	}
	
	public double calculate() {
		
		double price = itemPrice*quantity;
		if(price>5000) {
			return price-(price*0.1); //10% discount Applied 
		}
		else {
			return price;
		}
	}

}
