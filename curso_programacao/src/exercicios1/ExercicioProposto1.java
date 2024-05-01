package exercicios1;

import java.util.Scanner;

public class ExercicioProposto1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int v1 = sc.nextInt();
		int v2 = sc.nextInt();
		
		int resultado = v1 + v2;
		
		System.out.println("SOMA = " + resultado);
		
		sc.close();

	}

}
