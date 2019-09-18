package br.com.diogo;

import java.util.Scanner;

public class P05_soma_aritimetica {

	public static void main(String[] args) {
		double n1, n2, n3, soma, resultado;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o primeiro número: ");
		n1 = sc.nextDouble();
		System.out.print("Digite o segundo número: ");
		n2 = sc.nextDouble();
		System.out.print("Digite o terceiro número: ");
		n3 = sc.nextDouble();
		
		soma = n1 + n2 + n3;
		resultado = (7 * 3.5) + (soma/5.1) - 1000;		
		
		System.out.println("O resoltado é: " + resultado);
	}

}
