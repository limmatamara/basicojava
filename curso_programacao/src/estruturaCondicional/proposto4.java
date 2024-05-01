package estruturaCondicional;

import java.util.Scanner;

public class proposto4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int inicio = sc.nextInt();
		int fim = sc.nextInt();
		int duracao;
		
		if (inicio < fim) {
			duracao = fim - inicio;
			System.out.println("O JOGO DUROU " + duracao + " HORAS");
		} else {
			duracao = 24 - inicio + fim;
			System.out.println("O JOGO DUROU " + duracao + " HORAS");
		}
		sc.close();
	}

}
