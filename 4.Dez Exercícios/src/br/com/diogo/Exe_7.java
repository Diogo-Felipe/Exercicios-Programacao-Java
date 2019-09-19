package br.com.diogo;

import java.util.Scanner;

public class Exe_7 {

	public static void main(String[] args) {
		int numero;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite um número inteiro: ");
		numero = sc.nextInt();
		
		if(numero % 2 == 0 && numero % 5 == 0) {
			System.out.println("Número " + numero + " é divisível por 2, 5, 10");
		} else if(numero % 2 == 0) {
			System.out.println("Número " + numero + " é divisível por 2");
		} else if(numero % 5 == 0) {
			System.out.println("Número " + numero + " é divisível por 5");
		} else {
			System.out.println("Número " + numero + " não é divisível por 2, 5, 10");
		}

	}

}
