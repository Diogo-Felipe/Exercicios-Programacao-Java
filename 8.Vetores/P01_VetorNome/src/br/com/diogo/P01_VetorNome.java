package br.com.diogo;

import java.util.Scanner;

public class P01_VetorNome {

	public static void main(String[] args) {
		String[] nomes = new String[10];
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0; i < nomes.length; i ++) {
			System.out.println("Digite o " + (i+1) + " nome:");
			nomes[i] = sc.nextLine();	
		}
		
		for(int i = 0; i < nomes.length; i ++) {
			System.out.println(nomes[i] + "(" + nomes[i].trim().length() + ")");
		}	
	}

}
