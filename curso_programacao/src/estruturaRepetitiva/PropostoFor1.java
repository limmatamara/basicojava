package estruturaRepetitiva;

import java.util.Scanner;

public class PropostoFor1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for (int i=0; i<n; i++) {
			if (i%2 == 1) {
				System.out.println(i);
			}
		}
		sc.close();

	}

}
