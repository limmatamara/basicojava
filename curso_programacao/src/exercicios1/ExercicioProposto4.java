package exercicios1;

import java.util.Scanner;

public class ExercicioProposto4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int numero = sc.nextInt();
		int horasTrabalhadas = sc.nextInt();
		double valorHora = sc.nextDouble();
		double salario = horasTrabalhadas * valorHora;
		
		System.out.println("NUMBER = " + numero);
		System.out.printf("SALARY = U$ %.2f%n", salario);		
		
		sc.close();

	}

}
