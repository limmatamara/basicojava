package estruturaCondicional;

import java.util.Scanner;

public class resolvido1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double nota1 = sc.nextDouble();
		double nota2 = sc.nextDouble();
		double notaFinal = nota1 + nota2;
		
		if (notaFinal >=60) {
			System.out.printf("NOTA FINAL: %.1f%n", notaFinal);
		} else {
			System.out.printf("NOTA FINAL : %.1f%n", notaFinal);
			System.out.println("REPROVADO");
		}
		sc.close();

	}

}
