package br.com.diogo;

import java.util.Scanner;

public class P05_PlacarFutbol {

	public static void main(String[] args) {
		String nomeTimeA, nomeTimeB;
		int golsTimeA, golsTimeB;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o nome do time A: ");
		nomeTimeA = sc.nextLine();
		System.out.print("Digite o nome do time B: ");
		nomeTimeB = sc.nextLine();
		
		System.out.print("Quantos gols o time " + nomeTimeA + " Fez: ");
		golsTimeA = sc.nextInt();
		System.out.print("Quantos gols o time " + nomeTimeB + " Fez: ");
		golsTimeB = sc.nextInt();
		
		if(golsTimeA > golsTimeB) {
			System.out.println("Time " + nomeTimeA + " venceu " + nomeTimeB);
		} else if(golsTimeA < golsTimeB) {
			System.out.println("Time " + nomeTimeB + " venceu " + nomeTimeB);
		} else {
			System.out.println("Partida Empatada");
		}
	}

}
