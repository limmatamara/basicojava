package application;

import java.util.Scanner;

import entities.Employee;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Employee employeeDate;
		employeeDate = new Employee();
		
		System.out.println("Name: ");
		employeeDate.name = sc.nextLine();
		System.out.println("Gross Salary: ");
		employeeDate.grossSalary = sc.nextDouble();
		System.out.println("Tax: ");
		employeeDate.tax = sc.nextDouble();
		
		System.out.println("Employee: " + employeeDate);
		
		System.out.println("Which percentage to increase salary?");
		double percentage = sc.nextDouble();
		employeeDate.increaseSalary(percentage);
		System.out.println("Updated data: " + employeeDate);
		
		sc.close();

	}

}
