package br.com.diogo;

import java.util.Scanner;

public class P04_TempoDoNerd {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		final int QTDDIAS = 7;
		final int QTDREDES = 3;
		
		int T[][] = new int[QTDDIAS][QTDREDES];
		
		int minutosTotaisPorRede[] = new int[QTDREDES];
		
		int minutosTotais = 0;
		
		int acumuladorQuintaSabado = 0;
		int mediaQuintaSabado;
		
		for(int i = 0; i < QTDDIAS; i++) {
			for(int j = 0; j < QTDREDES; j++) {
				System.out.println("Digite os minutos do dia " + (i + 1) 
						+ " da rede: " + (j + 1));
				T[i][j] = sc.nextInt();
				
				minutosTotais = minutosTotais + T[i][j];
			}
		}
		
		for(int i = 0; i < QTDREDES; i++) {
			minutosTotaisPorRede[i] = 0;
			for(int j = 0; j < QTDDIAS; j++) {
				minutosTotaisPorRede[i] = minutosTotaisPorRede[i] + T[j][i];
			}
		}
		
		for(int i = 0; i < QTDREDES; i++) {
			acumuladorQuintaSabado = acumuladorQuintaSabado +
					T[3][i] + T[5][i];
		}
		
		mediaQuintaSabado = acumuladorQuintaSabado / 6;
		
		
		System.out.println("Minutos no Facebook: " + minutosTotaisPorRede[0]);
		System.out.println("Minutos no Twitter: " + minutosTotaisPorRede[1]);
		System.out.println("Minutos no Wpp: " + minutosTotaisPorRede[2]);
		System.out.println("Minutos Totais: " + minutosTotais);
		System.out.println("Minutos Medio da quinta e Sabado: " + mediaQuintaSabado);
		
		
	}

}
