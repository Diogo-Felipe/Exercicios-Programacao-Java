package br.com.diogo;

import java.util.Scanner;

public class P06_Compras {

	public static void main(String[] args) {
		double valorTotalCompras, descontoEmPorcentagem, 
				descontoEmValor, valorComDesconto;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o valor total da sua compra: ");
		valorTotalCompras = sc.nextDouble();
		
		if(valorTotalCompras > 100) {
			System.out.print("Digite o desconto: ");
			descontoEmPorcentagem = sc.nextDouble();
			
			descontoEmValor = (valorTotalCompras * descontoEmPorcentagem) / 100;
			valorComDesconto = valorTotalCompras - descontoEmValor;
						
			System.out.println("Com desconto!");
			System.out.println("Novo valor: " + valorComDesconto);
		} else {
			System.out.println("Sem desconto!");
		}
	}

}
