package application;

import java.util.Scanner;

import entities.Student;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Student studentData;
		studentData = new Student();
		
		studentData.name = sc.nextLine();
		studentData.score1 = sc.nextDouble();
		studentData.score2 = sc.nextDouble();
		studentData.score3 = sc.nextDouble();
		
		System.out.printf("FINAL GRADE: %.2f%n", studentData.finalScore());
		 
		if (studentData.finalScore() < 60.0) {
			System.out.println("FAILED");
			System.out.printf("MISSING %.2f POINTS%n", studentData.missingPoints());
		} else {
			System.out.println("PASS");
		}
		
		sc.close();

	}

}
