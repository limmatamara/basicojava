import java.util.Scanner;

public class SomaPares {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("QUANTOS ELEMENTOS VAI TER O VETOR? ");
		int n = sc.nextInt();
		int[] vect = new int[n];
		int somaPares = 0;
		int contador = 0;
		
		for(int i=0; i<n; i++) {
			System.out.print("Digite um número: ");
			vect[i] = sc.nextInt();
			
			if (vect[i] %2 ==0) {
				somaPares = somaPares + vect[i];
				contador++;
			}
		}
		
		double mediaPares = 0.0;
		if(contador==0) {
			System.out.println("NENHUM NÚMERO PAR");
		} else {
			mediaPares = somaPares/contador;
			System.out.printf("MÉDIA DOS NÚMEROS PARES: " + "%.1f\n", mediaPares);
		}	
		
		sc.close();

	}

}
