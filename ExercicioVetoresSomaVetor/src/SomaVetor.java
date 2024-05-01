import java.util.Scanner;

public class SomaVetor {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("QUANTOS NÚMEROS VOCÊ VAI DIGITAR?");
		int n = sc.nextInt();
		double[] vector = new double [n];
		
		for (int i=0; i<n; i++) {
			System.out.print("Digite um número: ");
			vector[i] = sc.nextDouble();
		}	
				
		System.out.print("VALORES = ");
		double soma = 0;
		for (int i=0; i<n; i++) {
			soma += vector[i];
			System.out.printf("%.1f  ", vector[i]);
		}
		double media = soma/n;
		System.out.println();
		System.out.println("SOMA = " + soma);
		System.out.println("MÉDIA = " + media);
		
		sc.close();

	}

}
