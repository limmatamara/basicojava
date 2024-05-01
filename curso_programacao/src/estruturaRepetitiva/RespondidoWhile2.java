package estruturaRepetitiva;

import java.util.Scanner;

public class RespondidoWhile2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double idade = sc.nextDouble();
		
		if (idade < 0) {
			System.out.println("Impossível calcular");
		} else {		
			double soma = 0.0;
			int i = 0;
			
			while (idade > 0) {
				soma = soma + idade;
				idade = sc.nextInt();				
				i++;
			}
			
			double media = soma / i;
			System.out.printf("%.2f%n", media);
			sc.close();
		}

	}

}
