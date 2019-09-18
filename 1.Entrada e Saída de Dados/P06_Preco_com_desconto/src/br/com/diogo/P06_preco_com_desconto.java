package br.com.diogo;

import java.util.Scanner;

public class P06_preco_com_desconto {

	public static void main(String[] args) {
		double precoInicial, descontoEmPorcentagem, descontoEmValor, precoFinal;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o preço do produto: ");
		precoInicial = sc.nextDouble();
		System.out.print("Digite o desconto em porcentagem: ");
		descontoEmPorcentagem = sc.nextDouble();
		
		descontoEmValor = (precoInicial * descontoEmPorcentagem)/100;
		precoFinal = precoInicial - descontoEmValor;
		
		System.out.println("O valor final do produto é " + precoFinal + " Reais");
		
	}

}
