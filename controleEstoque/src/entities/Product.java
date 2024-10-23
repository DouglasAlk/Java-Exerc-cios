package entities;

public class Product {

	public double price;
	public String name;
	public int quantity;

	
	public double totalValuInStock() {
		return price  * quantity;
	}
	
	public void AddProducts (int quantity) {
		
		this.quantity += quantity;
	}
	
	public void RemoveProducts(int quantity) {
		
		this.quantity -= quantity;
		
	}
	public String toString() {
		return name 
			+ ", $ "
			+ String.format("%.2f", price)
			+ ", "
			+ quantity
			+ " units, Total: $ "
			+ String.format("%.2f", totalValuInStock()); 
		
	}

}


