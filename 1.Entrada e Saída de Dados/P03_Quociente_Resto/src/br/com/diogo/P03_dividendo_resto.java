package br.com.diogo;

import java.util.Scanner;

public class P03_dividendo_resto {

	public static void main(String[] args) {
		int dividendo, divisor, quociente, resto;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Entre com o dividendo: ");
		dividendo = sc.nextInt();
		System.out.print("Entre com o divisor: ");
		divisor = sc.nextInt();
		
		quociente = dividendo / divisor;
		resto = dividendo % divisor;
		
		System.out.println("Quociente: " + quociente);
		System.out.println("Resto: " + resto);
	}

}
