package br.com.diogo;

import java.util.Scanner;

public class P02_NomesVogaisConso {
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		String nome;
		int nomesComVogal = 0;
		
		for(int i = 1; i <= 10; i++) {
			System.out.print("Digite o nome de numero " + i + " :");
			nome = sc.nextLine();
			
			if(nome.trim().toLowerCase().charAt(0) == 'a' ||
					nome.trim().toLowerCase().charAt(0) == 'e' ||
					nome.trim().toLowerCase().charAt(0) == 'i' ||
					nome.trim().toLowerCase().charAt(0) == 'o' ||
					nome.trim().toLowerCase().charAt(0) == 'u') {
				nomesComVogal++;
			}
		}
		
		System.out.println(nomesComVogal + " Nomes iniciam com vogal");
		System.out.println((10 - nomesComVogal) + " Nomes iniciam com Consoante");
	}
}
