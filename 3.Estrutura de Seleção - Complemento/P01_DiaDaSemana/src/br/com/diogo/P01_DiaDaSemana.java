package br.com.diogo;

import java.util.Scanner;

public class P01_DiaDaSemana {

	public static void main(String[] args) {
		int diaEmNumero;
		
		Scanner sc = new Scanner(System.in);

		System.out.print("Entre com o dia da Semana em valor numérico: ");
		diaEmNumero = sc.nextInt();
		
		switch (diaEmNumero) {
			case 1:
				System.out.println("Domingo");
				break;
			case 2:
				System.out.println("Segunda-feira");
				break;
			case 3:
				System.out.println("Terça-feira");
				break;
			case 4:
				System.out.println("Quarta-feira");
				break;
			case 5:
				System.out.println("Quinta-feira");
				break;
			case 6:
				System.out.println("Sexta-feira");
				break;
			case 7: 
				System.out.println("Sabado");
				break;
			default:
				System.out.println("Numero inválido");
		}
	}

}
