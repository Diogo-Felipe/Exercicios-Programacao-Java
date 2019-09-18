package br.com.diogo;

import java.util.Scanner;

public class Exe_3 {

	public static void main(String[] args) {
		double velocidade, velocidadeConvertida;
		int convercao;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite a velocidade: ");
		velocidade = sc.nextDouble();
		
		System.out.print("Digite 1 para converter de km/h para m/s\r\n" + 
				"ou digite 2 para converter de m/s para km/h: ");
		convercao = sc.nextInt();
		
		if(convercao == 1) {
			velocidadeConvertida = velocidade / 3.6;
			System.out.print(velocidade + "km/h corresponde a " + velocidadeConvertida + "m/s" );
		} else if (convercao == 2) {
			velocidadeConvertida = velocidade * 3.6;
			System.out.print(velocidade + "m/s corresponde a " + velocidadeConvertida + "km/h" );
		}
	}

}
