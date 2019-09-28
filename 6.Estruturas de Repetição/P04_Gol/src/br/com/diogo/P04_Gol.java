package br.com.diogo;

import java.util.Scanner;

public class P04_Gol {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int numeroDeGols = 0;
		
		do {
			String gol = "G";
			
			System.out.println("Digite o numero de gools: ");
			numeroDeGols = sc.nextInt();
			
			if(numeroDeGols < 0) {
				break;
			}
			
			for(int i = 0; i < numeroDeGols; i++) {
				gol = gol + "o";
			}
			
			gol = gol + "l";
			
			System.out.println(gol);
			
		}while(numeroDeGols > 0);
	}

}
