package br.com.diogo;

import java.util.Scanner;

public class P05_FuncDobro {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double numero;
		
		for(int i = 0; i < 3; i++) {
			separador();
			System.out.println("Digite numero");
			numero = sc.nextDouble();
			System.out.println("Dobro: " + dobro(numero));
		}
	}
	
	static double dobro(double n1) {
		return n1*2;
	}
	
	static void separador() {
		System.out.println("************");
	}
}
