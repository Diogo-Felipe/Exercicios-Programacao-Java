package br.com.diogo;

import java.util.Scanner;

public class P03_ParImpar {

	public static void main(String[] args) {
		int numero;
		int restoDaDivisaoPorDois;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite um numero inteiro: ");
		numero = sc.nextInt();
		
		restoDaDivisaoPorDois = numero % 2;
		
		if(restoDaDivisaoPorDois == 0) {
			System.out.println( numero + " é Par");
		} else {
			System.out.println( numero + " é Ímpar");
		}
	}

}
