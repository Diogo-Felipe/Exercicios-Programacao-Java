package br.com.diogo;

import java.util.Scanner;

public class P02_imprime_nome_idade {

	public static void main(String[] args) {
		String nome;
		int idade;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Entre com seu nome: ");	
		nome = sc.nextLine();
		
		System.out.print("Entre com sua idade: ");
		idade = sc.nextInt();
		
		System.out.println("Seu nome é " + nome + " e sua idade é " + idade + " anos");
	}

}
