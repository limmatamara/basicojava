package exercicios1;

import java.util.Scanner;

public class ExercicioProposto5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int cod1, cod2, qtd1, qtd2;
		double preco1, preco2;
		
		cod1 = sc.nextInt();
		qtd1 = sc.nextInt();
		preco1 = sc.nextDouble();
		
		cod2 = sc.nextInt();
		qtd2 = sc.nextInt();
		preco2 = sc.nextDouble();
		
		double precoTotal = qtd1 * preco1 + qtd2 * preco2;
		
		System.out.printf("VALOR A PAGAR : R$ %.2f%n", precoTotal);
		
		
		sc.close();

	}

}
