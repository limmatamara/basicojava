package exercicios1;

import java.util.Scanner;

public class ExercicioProposto2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double pi = 3.14159;
		double raio = sc.nextDouble();
		
		double areaTotal = pi * (raio * raio);
		
		System.out.printf("Área = %.4f%n ", areaTotal);
		
		sc.close();

	}

}
