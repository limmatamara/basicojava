package estruturaRepetitiva;

import java.util.Scanner;

public class Exemplo1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numero = sc.nextInt();
		int soma = 0;
		
		while (numero != 0) {	
			soma = soma + numero;
			numero = sc.nextInt();
		}
		System.out.println(soma);
		
		sc.close();

	}

}
