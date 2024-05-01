package application;

import java.util.Scanner;

import entities.Rectangle;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		 Rectangle x;//declara a variavel x que é do tipo retangulo
		 x = new Rectangle();//instancia a variavel x;
		
		System.out.println("Enter rectangle width and height: ");
		x.width = sc.nextDouble();
		x.height = sc.nextDouble();
		
		System.out.printf("AREA: %.2f%n", x.area());
		
		System.out.printf("PERIMETER: %.2f%n", x.perimeter());
		
		System.out.printf("DIAGONAL: %.2f%n", x.diagonal());
		
		sc.close();

	}

}
