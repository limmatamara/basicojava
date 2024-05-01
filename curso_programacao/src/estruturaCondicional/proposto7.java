package estruturaCondicional;

import java.util.Scanner;

public class proposto7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double x = sc.nextDouble();
		double y = sc.nextDouble();
		
		if (y == 0 || x == 0) {
			if (x != 0) {
				System.out.println("Eixo Y");
			} else if (y != 0) {
				System.out.println("Eixo X");
			} else {
				System.out.println("Origem");
			}
		}
		if (x > 0.0 && y > 0.0) {
			System.out.println("Q1");
		}
		if (x < 0.0 && y < 0.0) {
			System.out.println("Q2");
		}
		if (x < 0.0 && y < 0.0) {
			System.out.println("Q3");
		}
		if (x > 0.0 && y < 0.0) {
			System.out.println("Q4");
		}
		sc.close();
		
		}
	}
