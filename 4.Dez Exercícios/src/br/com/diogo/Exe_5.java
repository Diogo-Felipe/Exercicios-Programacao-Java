package br.com.diogo;

import java.util.Scanner;

public class Exe_5 {

	public static void main(String[] args) {
		String palavra1, palavra2, palavra3;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Animal Vertebrado ou Invertebrado?");
		palavra1 = sc.nextLine();
		
		if(palavra1.intern() == "vertebrado") {
			System.out.println("Ave ou Mamifero?");
			palavra2 = sc.nextLine();
			
			if(palavra2.intern() == "ave") {
				System.out.println("Carn�voro ou Onivoro?");
				palavra3 = sc.nextLine();
				
				if(palavra3.intern() == "carnivoro") {
					System.out.println("O animal � uma �guia");
				} else if(palavra3.intern() == "onivoro") {
					System.out.println("O animal � um Pombo");
				}
				
			} else if(palavra2.intern() == "mamifero") {
				System.out.println("Onpivoro ou Herb�voro?");
				palavra3 = sc.nextLine();
				
				if(palavra3.intern() == "onivoro") {
					System.out.println("O animal � um Homem");
				} else if(palavra3.intern() == "herbivoro") {
					System.out.println("O animal � uma Vaca");
				}
			}
		} else if(palavra1.intern() == "invertebrado" ) {
			System.out.println("Inseto ou Anelidio?");
			palavra2 = sc.nextLine();
			
			if(palavra2.intern() == "inseto") {
				System.out.println("Hematofago ou Herbivoro?");
				palavra3 = sc.nextLine();
				
				if(palavra3.intern() == "hematofago") {
					System.out.println("O animal � uma Pulga");
				} else if(palavra3.intern() == "herbivoro") {
					System.out.println("O animal � uma Lagarta");
				}
				
			} else if(palavra2.intern() == "anelidio") {
				System.out.println("Hematofago ou onivoro?");
				palavra3 = sc.nextLine();
				
				if(palavra3.intern() == "hematofago") {
					System.out.println("O animal � uma Sanguesuga");
				} else if(palavra3.intern() == "onivoro") {
					System.out.println("O animal � uma Minhoca");
				}
			}
		}
	}

}
