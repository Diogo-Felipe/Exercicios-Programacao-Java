package br.com.diogo;

import java.util.Scanner;

public class P04_Conjugacao {

	public static void main(String[] args) {
		String verbo, duasUltimasLetras;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um verbo no infinitivo: ");
		verbo = sc.nextLine();
		
		duasUltimasLetras = verbo.substring(verbo.length() - 2);
		
		if (duasUltimasLetras.equals("ar")) {
			
		} else if ((duasUltimasLetras.equals("er")) || (duasUltimasLetras.equals("or"))) {
			
		} else if (duasUltimasLetras.equals("ir")) {
			
		}
		
	}

}
