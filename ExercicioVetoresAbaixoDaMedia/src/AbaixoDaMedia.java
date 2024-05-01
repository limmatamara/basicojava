import java.util.Scanner;

public class AbaixoDaMedia {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Quantos elementos vai ter o vetor? ");
		int n = sc.nextInt();
		double[] vect = new double[n];
		double somaVect = 0.0;
				
		for (int i=0; i<n; i++) {
			System.out.print("Digite um número: ");
			vect[i] = sc.nextDouble();
			somaVect = somaVect + vect[i];
		}
		
		double mediaVect = somaVect/n;
		System.out.printf("MÉDIA DO VETOR = " + "%.3f\n", mediaVect);
		System.out.println("ELEMENTOS ABAIXO DA MEDIA: ");
		for (int i=0; i<vect.length; i++) {
			if (vect[i] < mediaVect) {
				System.out.printf("%.1f\n", vect[i]);
			}
		}
		
		sc.close();

	}

}
