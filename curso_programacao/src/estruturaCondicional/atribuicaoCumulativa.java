package estruturaCondicional;

import java.util.Scanner;

public class atribuicaoCumulativa {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int minutos = sc.nextInt();
		double conta = 50.00;
		
		if (minutos > 100) {
			conta += (minutos - 100)*2.00;
		}
		
		System.out.printf("Valor da conta: R$ %.2f%n", conta);
		
		sc.close();

	}

}
