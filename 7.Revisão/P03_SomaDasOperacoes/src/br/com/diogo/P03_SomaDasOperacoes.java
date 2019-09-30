package br.com.diogo;

import java.util.Scanner;

public class P03_SomaDasOperacoes {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n1, n2, resultado;
		
		System.out.println("Digite primeiro o numero: ");
		n1 = sc.nextInt();
		System.out.println("Digite segundo o numero: ");
		n2 = sc.nextInt();
		
		resultado = (n1 * n2) + (n1 - n2);
		
		if(resultado % 2 == 0) {
			System.out.println(resultado + " é um número par");
		} else {
			System.out.println(resultado + " é um número impar");
		}
	}
	
}
