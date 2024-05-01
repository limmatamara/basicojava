package application;

import java.util.Scanner;

import entities.Triangle;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);	
		
		Triangle x, y; //declara as variaveis x e y que são do tipo Triangle
		x = new Triangle(); //instancia a variavel x
		y = new Triangle(); //instancia a variavel y;
		
		System.out.println("Informe as medidas do triângulo X:");
		x.a = sc.nextDouble();
		x.b = sc.nextDouble();
		x.c = sc.nextDouble();
		
		System.out.println("Informe as medidas do triângulo Y:");
		y.a = sc.nextDouble();
		y.b = sc.nextDouble();
		y.c = sc.nextDouble();
		
		
		double areaX = x.area();	
		
		double areaY = y.area();
		
		System.out.printf("Area do triângulo X: %.4f%n", areaX);
		System.out.printf("Area do triângulo Y: %.4f%n", areaY);
		
		if (areaX > areaY) {
			System.out.println("Maior área: X");
		} else {
			System.out.println("Maior área: Y");
		}
		sc.close();

	}

}
