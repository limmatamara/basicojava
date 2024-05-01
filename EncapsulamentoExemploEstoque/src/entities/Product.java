package entities;

public class Product {
	private String name;
	private double price;
	private int quantity;
	
	public Product() {
		//construtor padrao
	}
	
	public Product (String name, double price) { //ex de sobrecarga (mesmo nome para operaçoes diferentes)
		this.name = name;
		this.price = price;
	}
	
	public Product (String name, double price, int quantity) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}
	
	//ex de encapsulamento - metodos get and set
	
	public String getName() {
		return name;
	}
	
	public void setName (String name) {
		this.name = name;
	}
	
	public double getPrice() {
		return price;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
	
	public int getQuantity() {
		return quantity;
	}
	
	//setQuantity nao existe pois a modificaçao do valor da quantidade so ocorre atraves dos metodos, como forma de proteger o programa (manter consistente)
	
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
