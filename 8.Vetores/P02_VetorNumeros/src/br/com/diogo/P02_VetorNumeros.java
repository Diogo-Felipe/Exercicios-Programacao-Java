package br.com.diogo;

import java.util.Scanner;

public class P02_VetorNumeros {

	public static void main(String[] args) {
		int[] nomes = new int[10];
		int soma;
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0; i < nomes.length; i ++) {
			System.out.println("Digite o " + (i+1) + " numero:");
			nomes[i] = sc.nextInt();	
		}
		
		soma = nomes[0] + nomes[nomes.length - 1];
		
		System.out.println("A soma do primeiro para o último número é: " + soma);
	}

}
