package br.com.diogo;

import java.util.Scanner;

public class P06_FuncVetorProdInterno {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		final int TAMANHO = 5;
		
		int x[] = new int[TAMANHO];
		int y[] = new int[TAMANHO];
		
		for(int i = 0; i < TAMANHO; i++) {
			System.out.println("Digite o valor " + (i + 1) + " do vetor x");
			x[i] = sc.nextInt();
		}
		
		for(int i = 0; i < TAMANHO; i++) {
			System.out.println("Digite o valor " + (i + 1) + " do vetor y");
			y[i] = sc.nextInt();
		}
		
		System.out.println(produtoInterno(x, y));

	}
	
	static int produtoInterno(int[] x, int[] y) {
		
		int produtoInterno = 0;
		
		for(int i = 0; i < x.length; i++) {
			produtoInterno = produtoInterno + (x[i] * y[i]);
		}
		
		return produtoInterno;
	}

}
