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
			System.out.println("Verbo na primeira conjuga��o");
		} else if ((duasUltimasLetras.equals("er")) || (duasUltimasLetras.equals("or"))) {
			System.out.println("Verbo na segunda conjuga��o");
		} else if (duasUltimasLetras.equals("ir")) {
			System.out.println("Verbo na terceira conjuga��o");
		} else {
			System.out.println("N�o � um verbo");
		}
		
	}

}
