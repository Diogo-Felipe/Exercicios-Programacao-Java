package br.com.diogo;

import java.util.Scanner;

public class P02_MatrizSoma {

	public static void main(String[] args) {
		//Declaração de variáveis
		Scanner sc = new Scanner(System.in);
		
		final int LINHAS = 3;
		final int COLUNAS = 3;
		
		int X[][] = new int[LINHAS][COLUNAS];
		int Y[][] = new int[LINHAS][COLUNAS];
		
		int SOMA[][] = new int[LINHAS][COLUNAS];
		
		int somaTotal = 0, somaPrimeiraLinha = 0, somaUltimaColuna= 0;
		
		//Entrada de dados da Matrix X
		for(int i = 0; i < LINHAS; i++) {
			for(int j = 0; j < COLUNAS; j++) {
				System.out.println("Digite o valor " + "[" + i + "]" + "[" + j +
						"] da Matrix X");
				X[i][j] = sc.nextInt();
			}
		}
		
		//Entrada de dados da Matrix Y
		for(int i = 0; i < LINHAS; i++) {
			for(int j = 0; j < COLUNAS; j++) {
				System.out.println("Digite o valor " + "[" + i + "]" + "[" + j +
						"] da Matrix Y");
				Y[i][j] = sc.nextInt();
			}
		}
		
		
		//Soma das matrizes e soma total
		for(int i = 0; i < LINHAS; i++) {
			for(int j = 0; j < COLUNAS; j++) {
				SOMA[i][j] = X[i][j] + Y[i][j];
				somaTotal = somaTotal + SOMA[i][j];
			}
		}
		
		//Soma da primeira linha
		for(int j = 0; j < COLUNAS; j++) {
			somaPrimeiraLinha = somaPrimeiraLinha + SOMA[0][j];
		}
		
		//Soma da ultima coluna
		for(int i = 0; i < LINHAS; i++) {
			somaUltimaColuna = somaUltimaColuna + SOMA[i][0];
		}
		
		
		//Saida de dados		
		for(int i = 0; i < LINHAS; i++) {
			for(int j = 0; j < COLUNAS; j++) {
				System.out.print(SOMA[i][j] + " ");
			}
			System.out.println();
		}
		
		System.out.println("Soma total: " + somaTotal);
		System.out.println("Soma primeira linha: " + somaPrimeiraLinha);
		System.out.println("Soma última coluna: " + somaUltimaColuna);
		
	}

}
