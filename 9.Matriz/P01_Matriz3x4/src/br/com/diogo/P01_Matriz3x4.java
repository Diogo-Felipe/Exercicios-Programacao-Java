package br.com.diogo;

import java.util.Scanner;

public class P01_Matriz3x4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int matrizA[][] = new int[3][4];
		int matrizB[][] = new int[3][4];
		
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 4; j++) {
				System.out.println("Digite o valor " + "[" + i + "]" + "[" + j + "]");
				matrizA[i][j] = sc.nextInt();
				matrizB[i][j] = 3 * matrizA[i][j];
			}
		}
		
		
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 4; j++) {
				System.out.print(matrizB[i][j] + " ");
			}
			System.out.println();
		}
	}

}
