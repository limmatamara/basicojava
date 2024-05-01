package entities;

public class Product {	
	public String name;
	public double price;
	public int quantity;
	
	public double totalValueInStock() {
		double totalValue = price * quantity;
		return totalValue;
	}
	
	public void addProducts(int quantity) {
		this.quantity += quantity;
	}
	
	public void removeProducts (int quantity) {
		this.quantity -= quantity;
	}
	
	public String toString() {
		return name 
			+ ", $ " 
			+ String.format("%.2f", price) //mascara para o valor sair com 2 casas decimais
			+ " , "
			+ quantity + " units, "
			+ "Total: $ " 
			+ String.format("%.2f", totalValueInStock());
	}
}