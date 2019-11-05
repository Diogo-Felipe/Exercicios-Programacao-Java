package br.com.diogo;

import java.util.Scanner;

public class P05_RelatorioDeVendas {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		final int MESES = 12;
		final int SEMANAS = 4;
		
		double F[][] = new double[MESES][SEMANAS];
		
		double totalMeses[] = new double[MESES];
		
		double totalAno = 0;
		
		
		for(int i = 0; i < MESES; i++) {
			for(int j = 0; j < SEMANAS; j++) {
				System.out.println("Digite o valor do mês " + (i + 1) 
						+ " na semana " + (j + 1));
				
				F[i][j] = sc.nextInt();
				
				totalAno = totalAno + F[i][j];
			}
		}
				
		for(int i = 0; i < MESES; i++) {
			for(int j = 0; j < SEMANAS; j++) {
				System.out.print(F[i][j] + " ");
			}
			System.out.println();
		}
		
		for(int i = 0; i < MESES; i++) {
			totalMeses[i] = 0;
			for(int j = 0; j < SEMANAS; j++) {
				totalMeses[i] = totalMeses[i] + F[i][j];
			}
			System.out.println("Total do mês " + (i + 1) + ": " + totalMeses[i]);
		}
		
		System.out.println("Total do ano: " + totalAno);
		

	}

}
