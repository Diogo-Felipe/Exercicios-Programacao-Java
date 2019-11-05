package br.com.diogo;

import java.util.Random;

public class P03_MatrizAleatoria5x5 {

	public static void main(String[] args) {
		Random gerador = new Random();
		
		final int LINHAS = 5;
		final int COLUNAS = 5;
		
		int matriz[][] = new int[LINHAS][COLUNAS];
		
		int somatorio = 0;
		long produtorio = 1;
		
		for(int i = 0; i < LINHAS; i++) {
			for(int j = 0; j < COLUNAS; j++) {
				matriz[i][j] = gerador.nextInt(10);
				
				somatorio = somatorio + matriz[i][j];
				produtorio = produtorio * matriz[i][j];
			}
		}
		
		for(int i = 0; i < LINHAS; i++) {
			for(int j = 0; j < COLUNAS; j++) {
				System.out.print(matriz[i][j] + " ");
			}
			System.out.println();
		}
		
		System.out.println("Somatorio: " + somatorio);
		System.out.println("Produtorio: " + produtorio);
		
	}

}
