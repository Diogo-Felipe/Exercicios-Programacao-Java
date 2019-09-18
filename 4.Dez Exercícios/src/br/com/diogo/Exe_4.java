package br.com.diogo;

import java.util.Scanner;

public class Exe_4 {
	
	public static void main(String[] args) {
		String operadora;
		int minutos;
		double valorAPagar;
		final double tarifaTom = 0.02;
		final double tarifaEscuro= 0.025;
		final double tarifaTchal= 0.019;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Qual sua operadora (tom, escuro, tchal): ");
		operadora = sc.nextLine();
		
		System.out.print("Qual o tempo, em minutos, da ligação: ");
		minutos = sc.nextInt();
		
		switch (operadora) {
			case "tom":
				valorAPagar = (tarifaTom * minutos * 60) - (tarifaTom * 5);
				break;
			case "escuro":
				valorAPagar = (tarifaEscuro * minutos * 60) - (tarifaEscuro * 5);
				break;
			case "tchal":
				valorAPagar = (tarifaTchal * minutos * 60) - (tarifaTchal * 5);
				break;
			default:
				valorAPagar = 0;
				System.out.println("Operadora não cadastrada");
		}
		
		System.out.println("Total a pagar: " + valorAPagar);
	}
	
}
