package br.com.diogo;

import java.util.Scanner;

public class P04_area_do_trinagulo {

	public static void main(String[] args) {
		double base, altura, area;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite a base do trinagulo: ");
		base = sc.nextDouble();
		System.out.print("Digite a altura do trinagulo: ");
		altura = sc.nextDouble();
		
		area = (base * altura) / 2;
		
		System.out.println("A area do triangulo é " + area);
	}

}
