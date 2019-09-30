package br.com.diogo;

import java.util.Scanner;

public class P05_Cadastro {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String nome1 = "", sexo1 = "", estadoCivil1 = "";
		int idade1 = 0;
		
		String nome2, sexo2, estadoCivil2;
		int idade2;
		
		int loop = 1;
		
		while(loop == 1) {
			
			nome2 = nome1;
			sexo2 = sexo1;
			estadoCivil2 = estadoCivil1;
			idade2 = idade1;			
			
			System.out.print("Nome: ");
			nome1 = sc.next();
			System.out.print("Sexo: ");
			sexo1 = sc.next();
			System.out.print("EstadoCivil: ");
			estadoCivil1 = sc.next();
			System.out.print("Idade: ");
			idade1 = sc.nextInt();
			
			System.out.println("Nome: " + nome1);
			System.out.println("Idade: " + idade1);
			System.out.println("Sexo: " + sexo1);
			System.out.println("Estado Civil: " + estadoCivil1);
			
			System.out.println("Cadastro Realizado com Sucesso");
			
			System.out.println("Digite 1 para fazer outro cadastro, 0 para sair: ");
			loop = sc.nextInt();
			
			if(loop == 1) {
				System.out.println("Nome anterior: " + nome2);
				System.out.println("Idade anterior: " + idade2);
				System.out.println("Sexo anterior: " + sexo2);
				System.out.println("Estado Civil anterior: " + estadoCivil2);
			}
		}

	}

}
