package br.com.diogo;

import java.util.Scanner;

public class P02_Trigonometria {

	public static void main(String[] args) {
		String calculo;
		double angulo, resultado;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Qual calculo deseja fazer: ");
		calculo = sc.nextLine();
		
		System.out.print("Qual angulo: ");
		angulo = sc.nextDouble();
		
		switch(calculo.trim().toLowerCase()) {
			case "seno":
				resultado = Math.sin(angulo);
				break;
			case "cosseno":
				resultado = Math.cos(angulo);
				break;
			case "tangente":
				resultado = Math.tan(angulo);
				break;
			default:
				System.err.print("Erro!");
				resultado = 0;
		}
		
		System.out.print("Resultado: " + resultado);
	}

}
