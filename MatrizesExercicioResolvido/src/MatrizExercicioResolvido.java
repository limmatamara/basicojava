import java.util.Scanner;

public class MatrizExercicioResolvido {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int[][] matriz = new int[n][n]; //a quantidade de colchetes informa que é uma matriz bidimensional
		
		for (int i=0; i<matriz.length; i++) { //for para percorrer as linhas
			for (int j=0; j<matriz[i].length; j++) { //for para percorrer as colunas
				matriz[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("Main diagonal:");
		for (int i=0; i<matriz.length; i++) {
			System.out.print(matriz[i][i] + " " );
		}
		System.out.println(" ");
		
		int contador = 0;
		System.out.print("Negative numbers = ");
		for (int i=0; i<matriz.length; i++) {
			for (int j =0; j<matriz[i].length; j++) {
				if (matriz[i][j] < 0) {
					contador++;
				}
			}
		}
		
		System.out.print(contador);
		
		sc.close();
	}

}
