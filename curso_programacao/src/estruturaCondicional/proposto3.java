package estruturaCondicional;

import java.util.Scanner;

public class proposto3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		if (a%b == 0 || b%a == 0) {
			System.out.println("SÃO MÚLTIPLOS");
		} else {
			System.out.println("NÃO SÃO MÚLTIPLOS");
		}
		sc.close();
	}

}
