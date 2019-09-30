package br.com.diogo;

import java.util.Scanner;

public class P02_PalavraSemT {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String palavra, palavraSemT = "";
		
		System.out.println("Digite a palavra: ");
		palavra = sc.nextLine();
		
		for(int i = 0; i < palavra.length(); i++) {
			char letra = palavra.trim().toLowerCase().charAt(i);
			
			if( letra != 't') {
				palavraSemT = palavraSemT + letra;
			}
		}
		
		System.out.println("Palavra sem T: " + palavraSemT);
	}

}
