package br.com.diogo;

import java.util.Scanner;

public class P04_PositivoNegativoNulo {

	public static void main(String[] args) {
		int numero;
		Scanner sc = new Scanner(System.in);
		
		 System.out.println("Digite um numero inteiro: ");
		 numero = sc.nextInt();
		 
		 if(numero > 0) {
			 System.out.println("Numero maior que zero");
		 } else if(numero < 0) {
			 System.out.println("Nuemro menor que zero");
		 } else {
			 System.out.println("Numero igual a zero");
		 }

	}

}
