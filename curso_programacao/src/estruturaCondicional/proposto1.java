package estruturaCondicional;

import java.util.Scanner;

public class proposto1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int valor = sc.nextInt();
		
		if (valor < 0 ) {
			System.out.println("NEGATIVO");
		} else {
			System.out.println("NÃO NEGATIVO");
		}
		sc.close();
	}

}
