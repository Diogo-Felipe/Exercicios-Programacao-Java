package br.com.diogo;

import java.util.Scanner;
import java.util.Random;

public class P05_VetorNumAleatorio {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random rd = new Random();
		
		int tamanho1, tamanho2;
		int soma1 = 0, soma2 = 0;
		int qtdPares1 = 0, qtdImpares1 = 0;
		int qtdPares2 = 0, qtdImpares2 = 0;
		
		System.out.println("Digite o tamanho do primeiro vetor:");
		tamanho1 = sc.nextInt();
		System.out.println("Digite o tamanho do primeiro vetor:");
		tamanho2 = sc.nextInt();
		
		
		int vetor1[] = new int[tamanho1];
		int vetor2[] = new int[tamanho2];
		
		for(int i = 0; i < tamanho1; i++) {
			vetor1[i] = rd.nextInt(100) + 1;
			soma1 = soma1 + vetor1[i];
			
			if(vetor1[i] % 2 == 0) {
				qtdPares1++;
			} else {
				qtdImpares1++;
			}
		}
		
		for(int i = 0; i < tamanho2; i++) {
			vetor2[i] = rd.nextInt(100) + 1;
			soma2 = soma2 + vetor2[i];
			
			if(vetor1[i] % 2 == 0) {
				qtdPares2++;
			} else {
				qtdImpares2++;
			}
		}
		
		System.out.println("Soma dos elementos de 1: " + soma1);
		System.out.println("Soma dos elementos de 2: " + soma2);
		System.out.println("Quantidade de elementos pares de 1: " + qtdPares1);
		System.out.println("Quantidade de elementos pares de 2: " + qtdPares2);
		System.out.println("Quantidade de elementos impares de 1: " + qtdImpares1);
		System.out.println("Quantidade de elementos impares de 2: " + qtdImpares2);
		
	}

}
