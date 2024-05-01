import java.util.Scanner;

public class MediaDeAlturas {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int numeroDeAlturas = sc.nextInt();
		double[] vect = new double [numeroDeAlturas];
		
		for (int i=0; i<numeroDeAlturas; i++) {
			vect[i] = sc.nextDouble();
		}
		
		double soma = 0.0;
		for (int i=0; i<numeroDeAlturas; i++) {
			soma = soma + vect[i];
		}
		
		double result = soma/3;
		
		System.out.printf("Media: " + "%.2f",result);
		
		sc.close();

	}

}
