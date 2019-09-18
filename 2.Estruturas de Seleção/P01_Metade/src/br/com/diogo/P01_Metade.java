package br.com.diogo;

import java.util.Scanner;

public class P01_Metade {

	public static void main(String[] args) {
		double numero, metade;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite um número: ");
		numero = sc.nextDouble();
		
		if(numero > 20) {
			metade = numero / 2;
			System.out.println("O número é maior que vinte e sua metade é " + metade);
		}
		
		System.out.println("Fim do programa");
	}

}
