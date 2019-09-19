package br.com.diogo;

import java.util.Scanner;

public class Exe_6 {

	public static void main(String[] args) {
		
		String planeta;
		double pesoTerra, gravidade;
		double pesoPlaneta;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Planeta que deseja converter: ");
		planeta = sc.nextLine();
		
		System.out.print("Qual seu peso na terra? ");
		pesoTerra = sc.nextDouble();
		
		switch (planeta) {
			case "mercurio":
				gravidade = 0.37;
				break;
			case "venus":
				gravidade = 0.88;
				break;
			case "marte":
				gravidade = 0.38;
				break;
			case "jupter":
				gravidade = 2.64;
				break;
			case "saturno":
				gravidade = 1.15;
				break;
			case "urano":
				gravidade = 1.17;
				break;
			default:
				gravidade = 10;
		}
		
		pesoPlaneta = (pesoTerra/10)*gravidade;
		
		System.out.print("O seu peso no plantea" + planeta + " é " + pesoPlaneta);
	}

}
