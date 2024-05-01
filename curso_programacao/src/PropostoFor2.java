import java.util.Scanner;

public class PropostoFor2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int somaDentro = 0;
		int somaFora = 0;
		
		for (int i=0; i<n; i++) {
			int numero = sc.nextInt();
			
			if (numero >= 10 && numero <= 20) {
				somaDentro++; 
			}
			
			if (numero < 10 || numero > 20) {
				somaFora++; 
			}
			
		}
		
		System.out.println(somaDentro + " in");
		System.out.println(somaFora + " out");
		
		sc.close();
	}

}
