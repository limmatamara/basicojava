package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Pessoa;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Quantas pessoas serão digitadas? ");
		int n = sc.nextInt();
		
		String nome = " ";
		int idade = 0;
		List<Pessoa> lista = new ArrayList<>();
		
		for(int i=1; i<=n; i++) {
			System.out.println("Dados da " + i + " pessoa:");
			sc.nextLine();
			System.out.print("Nome: ");			
			nome = sc.nextLine();
			System.out.print("Idade: ");
			idade = sc.nextInt();
			Pessoa pessoa = new Pessoa(nome, idade);
			lista.add(pessoa);
		}
		
		String maisVelha = " ";
		int menorValor = Integer.MIN_VALUE;
		for (int i=0; i<lista.size(); i++) {
			if (lista.get(i).getIdade() > menorValor) {
				menorValor = lista.get(i).getIdade();
				maisVelha = lista.get(i).getNome();
			}
		}
		System.out.println(maisVelha);
		
		
		
		sc.close();

	}

}
