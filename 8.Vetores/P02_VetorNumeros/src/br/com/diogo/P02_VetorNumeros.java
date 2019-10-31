package br.com.diogo;

import java.util.Scanner;

public class P02_VetorNumeros {

	public static void main(String[] args) {
		int[] numeros = new int[10];
		int soma;
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0; i < numeros.length; i ++) {
			System.out.println("Digite o " + (i+1) + " numero:");
			numeros[i] = sc.nextInt();	
		}
		
		soma = numeros[0] + numeros[numeros.length - 1];
		
		System.out.println("A soma do primeiro para o último número é: " + soma);
	}

}
