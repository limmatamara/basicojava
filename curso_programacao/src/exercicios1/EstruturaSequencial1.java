package exercicios1;

import java.util.Scanner;

public class EstruturaSequencial1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double largura, comprimento,valorMetroQuadrado, precoTerreno, resultadoArea;
		
		largura = sc.nextDouble();
		comprimento = sc.nextDouble();
		valorMetroQuadrado = sc.nextDouble();
		
		resultadoArea =  largura * comprimento;
		
		precoTerreno = valorMetroQuadrado * resultadoArea;
		
		System.out.printf("Área = %.2f%n ", resultadoArea);
		System.out.printf("Preço = %.2f%n ", precoTerreno);
		
		sc.close();
	}

}
