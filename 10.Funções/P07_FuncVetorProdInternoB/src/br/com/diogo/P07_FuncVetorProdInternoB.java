package br.com.diogo;

import java.util.Scanner;

public class P07_FuncVetorProdInternoB {

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
		
		contaParesImpares(x, y);

	}
	
	static int produtoInterno(int[] x, int[] y) {
		
		int produtoInterno = 0;
		
		for(int i = 0; i < x.length; i++) {
			produtoInterno = produtoInterno + (x[i] * y[i]);
		}
		
		return produtoInterno;
	}
	
	static void contaParesImpares(int[] x, int[] y) {
		int parX = 0, parY = 0, imparX = 0, imparY = 0;
		
		for(int i = 0; i < x.length; i++) {
			if(x[i] % 2 == 0) {
				parX++;
			}
			
			if(y[i] % 2 == 0) {
				parY++;
			}
		}
		
		imparX = x.length - parX;
		imparY = y.length - parY;
		
		System.out.println("Numeros Pares em x: " + parX);
		System.out.println("Numeros Pares em y: " + parY);
		System.out.println("Numeros Impares em x: " + imparX);
		System.out.println("Numeros Impares em y: " + imparY);
	}
	
}