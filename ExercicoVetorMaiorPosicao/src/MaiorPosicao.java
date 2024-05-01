import java.util.Scanner;

public class MaiorPosicao {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Quantos números você vai digitar? ");
		int n = sc.nextInt();
		double[] vect = new double[n];
		
		for (int i=0; i<n; i++) {
			System.out.print("Digite um número: ");
			vect[i] = sc.nextDouble();
		}
		
		double maior = Integer.MIN_VALUE;
		int indiceMaior = -1;
		
		for (int i=0; i < vect.length ; i++) {
			if (vect[i] > maior) {
				maior = vect[i];
				indiceMaior = i;
			}
		}
		
		System.out.println("MAIOR VALOR: " + maior);
		System.out.println("POSIÇÃO DO MAIOR VALOR: " + indiceMaior);
		
		sc.close();

	}

}
