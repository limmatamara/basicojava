package entities;

public class Product {
	public String name;
	public double price;
	public int quantity;
	
	public Product() { //construtor padrao
		
	}
	
	public Product(String name, double price, int quantity) { //os parametros dos construtores nao necessariamente precisam ter o mesmo nome dos atributos
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}
	
	public Product(String name, double price) { //Exemplo de sobrecarga
		this.name = name;
		this.price = price;
	}
	
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
