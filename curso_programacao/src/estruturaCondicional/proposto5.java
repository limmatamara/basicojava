package estruturaCondicional;

import java.util.Scanner;

public class proposto5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int codigo = sc.nextInt();
		int quantidade = sc.nextInt();
		
		if (codigo == 1) {
			double preco = 4.00;
			double valorFinal = preco * quantidade;
			System.out.printf("Total: R$ %.2f%n", valorFinal);
		}
		if (codigo == 2) {
			double preco = 4.50;
			double valorFinal = preco * quantidade;
			System.out.printf("Total: R$ %.2f%n", valorFinal);
		}
		if (codigo == 3) {
			double preco = 5.00;
			double valorFinal = preco * quantidade;
			System.out.printf("Total: R$ %.2f%n", valorFinal);
		}
		if (codigo == 4) {
			double preco = 2.00;
			double valorFinal = preco * quantidade;
			System.out.printf("Total: R$ %.2f%n", valorFinal);
		}
		if (codigo == 5) {
			double preco = 1.50;
			double valorFinal = preco * quantidade;
			System.out.printf("Total: R$ %.2f%n", valorFinal);
		}
		sc.close();

	}

}