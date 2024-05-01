package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Quantos números você vai digitar? ");
		int n = sc.nextInt();
		int[] vect = new int[n];
		
		for (int i=0; i<n; i++) {
			System.out.print("Digite um número: ");
			vect[i] = sc.nextInt();
		}
		
		System.out.println("NÚMEROS PARES:");
		int numeroPar;
		int contador = 0;
		for (int i=0; i<n; i++) {
			if (vect[i] % 2 ==0) {
				numeroPar = vect[i];
				contador++;
				System.out.print(numeroPar + "  ");
			}
		}
		System.out.println();
		System.out.println("QUANTIDADE DE PARES = " + contador);
		
		
		sc.close();

	}

}
