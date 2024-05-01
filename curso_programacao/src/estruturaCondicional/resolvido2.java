package estruturaCondicional;

import java.util.Scanner;

public class resolvido2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		double c = sc.nextDouble();
		
		double delta = (b*b) - (4.0*a*c);
		
		double r1 = (-b + Math.sqrt(delta))/ (2.0*a);
		double r2 = (-b - Math.sqrt(delta))/ (2.0*a);		
		
		if (delta < 0.0 || a == 0.0) {
			System.out.println("Impossível Calcular");		
		} else {
			System.out.printf("R1 = %.5f%n", r1);
			System.out.printf("R2 = %.5f%n", r2);
		} 
		sc.close();
	}

}
