import java.util.Scanner;

public class NumerosNegativos {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quantos numeros você vai digitar?");
		int n = sc.nextInt();
		int[] vect = new int [n];
		
		for (int i=0; i<n; i++) {
			vect[i] = sc.nextInt();
		}
		
		System.out.println("NÚMEROS NEGATIVOS:");
		
		int negativo;
		for (int i=0; i<n; i++) {
			if (vect[i] <0) {
				negativo = vect[i];
				System.out.println(negativo);
			}
		}
		
		sc.close();

	}

}
