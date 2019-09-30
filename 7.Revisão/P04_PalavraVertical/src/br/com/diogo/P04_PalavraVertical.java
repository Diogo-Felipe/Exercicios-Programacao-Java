package br.com.diogo;

import java.util.Scanner;

public class P04_PalavraVertical {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String palavra;
		
		System.out.println("Digite a palavra desejada: ");
		palavra = sc.nextLine();
		
		for(int i = 0; i < palavra.length(); i++) {
			System.out.println(palavra.charAt(i));
		}

	}

}
