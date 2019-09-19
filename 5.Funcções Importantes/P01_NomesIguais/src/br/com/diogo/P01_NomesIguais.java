package br.com.diogo;

import java.util.Scanner;

public class P01_NomesIguais {

	public static void main(String[] args) {
		String nome1, nome2;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o primeiro nome: ");
		nome1 = sc.nextLine();
		
		System.out.print("Digite o primeiro nome: ");
		nome2 = sc.nextLine();
		
		nome1 = nome1.trim();
		nome2 = nome2.trim();
		
		if(nome1.equalsIgnoreCase(nome2)) {
			System.out.println("Nomes iguais");
		} else {
			System.out.println("Nomes diferentes");
		}
		
		System.out.println("Nome 1: " + nome1.length() + " letras");
		System.out.println("Nome 2: " + nome2.length() + " letras");
	}

}
