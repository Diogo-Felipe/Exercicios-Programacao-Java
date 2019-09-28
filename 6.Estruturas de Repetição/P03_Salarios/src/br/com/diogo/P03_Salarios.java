package br.com.diogo;

import java.util.Scanner;

public class P03_Salarios {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double salario = 0;
		double somaSalarios = 0;
		double quinzePorcentoSalario = 0;
		
		do {
			System.out.println("Digite o salario: ");
			salario = sc.nextDouble();
			
			if(salario < 0) {
				break;
			}
			
			somaSalarios = somaSalarios + salario;
		} while(salario > 0);
		
		quinzePorcentoSalario = somaSalarios * 0.15;
		
		System.out.println("Somatório dos salários é: " + somaSalarios);
		System.out.println("Quinze porcento desse somatório é: " + quinzePorcentoSalario);
		
	}

}
