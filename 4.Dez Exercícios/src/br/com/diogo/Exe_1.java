package br.com.diogo;

import java.util.Scanner;

public class Exe_1 {

	public static void main(String[] args) {
		double idadeEmDias;
		int dias, meses, anos;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a idade em dias:");
		idadeEmDias = sc.nextDouble();
		
		anos = (int) (idadeEmDias / 365);
		meses = (int) ((idadeEmDias % 365) / 30);
		dias = (int) (((idadeEmDias % 365) % 30));
		
		System.out.println(anos + " ano(s) " + meses + " mes(es) " + dias + " dia(s)");
	}

}
