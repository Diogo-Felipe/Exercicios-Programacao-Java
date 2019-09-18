package br.com.diogo;

import java.util.Scanner;

public class Exe_2 {
	
	public static void main(String[] args) {
		double x1, x2, y1, y2, distancia;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite a coordenada x do primeiro ponto: ");
		x1 = sc.nextDouble();
		
		System.out.print("Digite a coordenada y do primeiro ponto: ");
		y1 = sc.nextDouble();
		
		System.out.print("Digite a coordenada x do segundo ponto: ");
		x2 = sc.nextDouble();
		
		System.out.print("Digite a coordenada y do segundo ponto: ");
		y2 = sc.nextDouble();
		
		distancia = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
		
		System.out.println("Distancia entre os pontos é: " + distancia);
	}
	
}
