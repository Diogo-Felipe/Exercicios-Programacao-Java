package br.com.diogo;

import java.util.Scanner;

public class P03_PriUltLetra {

	public static void main(String[] args) {
		String palavra;
		char primeiroCaractere, ultimoCaractere;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a palavra: ");
		palavra = sc.nextLine();
		
		primeiroCaractere = palavra.charAt(0);
		ultimoCaractere = palavra.charAt(palavra.length() - 1);
		
		System.out.println("Primeira letra: " + primeiroCaractere);
		System.out.println("Ultima letra: " + ultimoCaractere);
	}

}
