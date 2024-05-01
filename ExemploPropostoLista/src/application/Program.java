package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Employee;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("How many employees will be registered? ");
		int n = sc.nextInt();
		
		Integer id = 0;
		String name = " ";
		Double salary = 0.0;
		List<Employee> employeeList = new ArrayList<>(); 
		
		for (int i=1; i<=n; i++) {
			System.out.println("Employee #" + i + ": ");
			System.out.print("Id: ");
			id = sc.nextInt();
			while (hasId(employeeList, id)) {
				System.out.println("Id already taken! Try again: ");
				id = sc.nextInt();
			}
			System.out.print("Name: ");
			sc.nextLine();
			name = sc.nextLine();			
			System.out.print("Salary: ");
			salary = sc.nextDouble();
			System.out.println(" ");
			
			Employee employee = new Employee(id, name, salary);
			employeeList.add(employee);
		}
		
		System.out.print("Enter the employee id that will have salary increase: ");
		int idIncreaseSalary = sc.nextInt();
		Employee emp = employeeList.stream().filter( x -> x.getId() == idIncreaseSalary).findFirst().orElse(null);
		
		if (emp == null) {
			System.out.println("The id does not exist!");
		} else {
			System.out.print("Enter the percentage: ");
			double increasePercentage = sc.nextDouble();
			emp.increaseSalary(increasePercentage);
		}
		
		System.out.println();
		System.out.println("List of employees: ");
		for (Employee employee : employeeList) {
			System.out.println(employee.toString());
		}
		
		sc.close();
	}
	
	public static boolean hasId(List<Employee> list, int id) {
		Employee emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		return emp != null;
	}

}
