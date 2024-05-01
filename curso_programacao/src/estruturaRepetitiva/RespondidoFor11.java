package estruturaRepetitiva;

import java.util.Scanner;

public class RespondidoFor11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numerodeRepeticao = sc.nextInt();
		int soma = 0;
		
		for (int i=0; i<numerodeRepeticao;i++) {
			int x = sc.nextInt();
			soma = x + soma;
		}
		
		System.out.println(soma);
		sc.close();
	}

}
