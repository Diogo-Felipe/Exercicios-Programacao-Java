package br.com.diogo;

import java.util.Scanner;

public class P04_VetorSoma {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double[] vetor1 = new double[7];
		double[] vetor2 = new double[7];
		double[] vetorSoma = new double[7];
		
		for(int i = 0; i < vetor1.length; i ++) {
			System.out.println("Digite o " + (i+1) + " numero do primeiro vetor:");
			vetor1[i] = sc.nextInt();	
		}
		
		for(int i = 0; i < vetor2.length; i ++) {
			System.out.println("Digite o " + (i+1) + " numero do segundo vetor:");
			vetor2[i] = sc.nextInt();	
		}
		
		for(int i = 0; i < vetorSoma.length; i ++) {
			vetorSoma[i] = vetor1[i] + vetor2[i];
			System.out.println(vetorSoma[i]);
		}
		
	}

}
