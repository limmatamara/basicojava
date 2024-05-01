package application;

import java.util.Scanner;

import utilities.Calculator;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Calculator calc;
		calc = new Calculator(); //como os metodos da classe Calculator nao sao estaticos, é necessario instancia-los
		
		System.out.println("Enter radius: ");
		double radius = sc.nextDouble();
		
		double c = calc.circumference(radius);
		double v = calc.volume(radius);
		
		System.out.printf("Circumference: %.2f%n", c);
		System.out.printf("Volume: %.2f%n", v);
		System.out.printf("PI: %.2f%n", calc.PI);
		
		sc.close();

	}

}
