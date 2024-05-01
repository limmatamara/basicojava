package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Person;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Quantas pessoas serão digitadas? ");
		int n = sc.nextInt();
		
		String name = " ";
		int age = 0;
		double height = 0.0;
		List<Person> people = new ArrayList<>();
		for (int i=1; i<=n; i++) {
			System.out.println("Dados da " + i +"a pessoa: ");
			sc.nextLine();
			System.out.print("Nome: ");
			name = sc.nextLine();
			System.out.print("Idade: ");
			age = sc.nextInt();
			sc.nextLine();
			System.out.print("Altura: ");
			height = sc.nextDouble();		
			Person person = new Person(name, age, height);
			people.add(person);
		}
		
		double somaAlturas = 0.0;
		int menoresDeIdade = 0;
		for(int i=0; i<people.size(); i++) {
			somaAlturas = somaAlturas + people.get(i).getHeight();
			if (people.get(i).getAge() < 16) {
				menoresDeIdade++;
			}
		}
		
		printMedia(people);
		menoresDeIdade(people);
		
//		double porcentagemMenores = (menoresDeIdade*100)/n;
//		
//		double mediaAlturas = somaAlturas/n;
//		System.out.printf("Altura média: " + "%.2f\n", mediaAlturas);
//		System.out.println("Porcentagem de menores de idade: " + porcentagemMenores + "%");
//		sc.close();

	}
	
	public static void printMedia(List<Person> people) {
		
		double sumHeight = 0.0;
		
		for(Person person : people) {
			
			sumHeight = sumHeight + person.getHeight();
		}
		
		System.out.println("Médias altura: " + (sumHeight/people.size()));
	}
	
	public static void menoresDeIdade(List<Person> people) {
		int menorDeIdade = 0;
		for(int i=0; i<people.size(); i++) {
			if (people.get(i).getAge() < 16) {
				menorDeIdade++;
			}
		}
		double porcentagemMenores = (menorDeIdade*100)/people.size();
		System.out.println("Pessoas com menos de 16 anos:  " + porcentagemMenores + "%");
	}

}
