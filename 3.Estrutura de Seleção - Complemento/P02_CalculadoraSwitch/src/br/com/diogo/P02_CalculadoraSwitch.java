package br.com.diogo;

import java.util.Scanner;

public class P02_CalculadoraSwitch {

	public static void main(String[] args) {
		
		String operacao;
		float numero1, numero2;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o primeiro n�mero: ");
		numero1 = sc.nextFloat();
		
		System.out.print("Digite o segundo n�mero: ");
		numero2 = sc.nextFloat();
		
		System.out.println("Que opera��o deseja fazer (+, -, *, /, r2)?");
		operacao = sc.next();
		
		
		switch(operacao) {
			case "+":
				System.out.println(numero1 + " + " + numero2 + " = " + (numero1 + numero2));
				break;
			case "-":
				System.out.println(numero1 + " - " + numero2 + " = " + (numero1 - numero2));
				break;
			case "*":
				System.out.println(numero1 + " * " + numero2 + " = " + (numero1 * numero2));
				break;
			case "/":
				System.out.println(numero1 + " / " + numero2 + " = " + (numero1 / numero2));
				break;
			case "r2":
				System.out.println("Raiz quardade de " + numero1 + " � " + Math.sqrt(numero1));
				System.out.println("Raiz quardade de " + numero2 + " � " + Math.sqrt(numero2));
				break;
			default:
				System.err.println("Erro! Op��o inv�lida");
			
		}
	}

}
