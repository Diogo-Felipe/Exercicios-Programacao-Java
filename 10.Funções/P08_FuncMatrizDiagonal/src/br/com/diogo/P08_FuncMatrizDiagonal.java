package br.com.diogo;

import java.util.Scanner;

public class P08_FuncMatrizDiagonal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		final int TAMANHO = 5;
		
		int matriz[][] = new int[TAMANHO][TAMANHO];
		
		for(int i = 0; i < TAMANHO; i++) {
			for(int j = 0; j < TAMANHO; j++) {
				System.out.println("Digite o valor: " + (i + 1) + "x" + (j + 1));
				matriz[i][j] = sc.nextInt();
			}
		}
		
		diagonalPrincipal(matriz, TAMANHO);
		diagonalSecudaria(matriz, TAMANHO);

	}
	
	static void diagonalPrincipal(int matriz[][], int tamanho) {
		System.out.println("Diagonal Principal");
		for(int i = 0; i < tamanho; i++) {
			for(int j = 0; j < tamanho; j++) {
				if(i == j) {
					System.out.print(matriz[i][j]);
				} else {
					System.out.print("*");
				}
			}
			
			System.out.println("");
		}
	}
	
	static void diagonalSecudaria(int matriz[][], int tamanho) {
		System.out.println("Diagonal Secundaria");
		for(int i = 0; i < tamanho; i++) {
			for(int j = 0; j < tamanho; j++) {
				if(i + j == tamanho - 1) {
					System.out.print(matriz[i][j]);
				} else {
					System.out.print("*");
				}
			}
			System.out.println("");
		}
	}
}
