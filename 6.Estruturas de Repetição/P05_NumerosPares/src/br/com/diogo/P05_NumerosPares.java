package br.com.diogo;

import java.util.Scanner;

public class P05_NumerosPares {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int inicio, fim;
		
		System.out.println("Digite onde deseja iniciar: ");
		inicio = sc.nextInt();
		System.out.println("Digite onde deseja iniciar: ");
		fim = sc.nextInt();
		
		for(int i = inicio; i <= fim; i++) {
			if(i % 2 == 0) {
				System.out.println(i);
			}
		}
	}

}
