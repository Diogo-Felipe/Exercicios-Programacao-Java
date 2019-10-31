package br.com.diogo;

import java.util.Scanner;

public class P03_VetorAlunos {
	
	public static void main(String[] args) {
		String[] nomes = new String[5];
		double[] notas1 = new double[5];
		double[] notas2 = new double[5];
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0; i < nomes.length; i ++) {
			System.out.println("Digite o " + (i+1) + " nome:");
			nomes[i] = sc.next();
			System.out.println("Digite a 1 nota de " + nomes[i]);
			notas1[i] = sc.nextDouble();
			System.out.println("Digite a 2 nota de " + nomes[i]);
			notas2[i] = sc.nextDouble();
		}
		
		for(int i = 0; i < nomes.length; i ++) {
			System.out.println("Aluno " + (i+1) + " : " + nomes[i]);
			System.out.println("Nota 1: " + notas1[i] + "/Nota 2: " + notas2[i] +
					 "/Média: " + ((notas1[i] + notas2[i])/2) );
		}
		
	}
	
}
