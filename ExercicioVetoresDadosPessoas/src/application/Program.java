package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javax.print.attribute.standard.Media;

import entities.Pessoa;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Quantas pessoas serão digitadas? ");
		int n = sc.nextInt();
		
		double altura = 0.0;
		char genero = ' ';
		List<Pessoa> listaDePessoas = new ArrayList<>();
		
		
		for (int i=1; i<=n ; i++) {
			System.out.print("Altura da " + i + "a pessoa: ");
			altura = sc.nextDouble();
			System.out.print("Gênero da " + i + "a pessoa: (M/F) ");
			genero = sc.next().charAt(0);
			
			Pessoa pessoa =  new Pessoa(altura, genero);
			listaDePessoas.add(pessoa);		
		}
		
		System.out.print("Maior altura: ");
		menorAltura(listaDePessoas);
		System.out.print("Menor altura: ");
		maiorAltura(listaDePessoas);
		System.out.print("Média das alturas das mulheres: ");
		mediaAlturaMulheres(listaDePessoas);
		System.out.print("Número de homens: ");
		numeroDeHomens(listaDePessoas);
		
		sc.close();

	}
	
	public static void menorAltura(List<Pessoa> listaDePessoas) {
		double maiorValor = Double.MIN_VALUE;
		for (Pessoa pessoa : listaDePessoas) {
			if (pessoa.getAltura() > maiorValor) {
				maiorValor = pessoa.getAltura();
			}
		}
		System.out.println(maiorValor);
	}
	
	public static void maiorAltura(List<Pessoa> listaDePessoas) {
		double menorValor = Double.MAX_VALUE;
		for (Pessoa pessoa : listaDePessoas) {
			if (pessoa.getAltura() < menorValor) {
				menorValor = pessoa.getAltura();
			}
		}
		System.out.println(menorValor);
	}
	
	public static void mediaAlturaMulheres(List<Pessoa> listaDePessoas) {
		double alturaDasMulheres = 0.0;
		int contador = 0;
		double mediaAltura = 0.0;
		
		for (Pessoa pessoa : listaDePessoas) {
			if (pessoa.getGenero() == 'F') {
				alturaDasMulheres = alturaDasMulheres + pessoa.getAltura();
				contador++;
			}
		 mediaAltura = alturaDasMulheres / contador;	
		}
		System.out.println(mediaAltura);
	}
	
	public static void numeroDeHomens(List<Pessoa> listaDePessoas) {
		int contador = 0;
		for (Pessoa pessoa : listaDePessoas) {
			if (pessoa.getGenero() == 'M') {
				contador++;
			}
		}
		System.out.println(contador);
	}

}
