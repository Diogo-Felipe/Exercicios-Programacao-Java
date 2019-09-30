package br.com.diogo;

import java.util.Scanner;

public class P01_Cardapio {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		final double taxaRefri = 5.00;
		final double taxaCoxinha = 2.50;
		final double taxaPastel = 2.00;
		
		int qtdRefri, qtdCoxinha, qtdPastel;
		
		double precoFinal, valorPago, troco;
		
		System.out.println("Quantos refrigerantes deseja comprar?");
		qtdRefri = sc.nextInt();
		System.out.println("Quantas coxinhas deseja comprar?");
		qtdCoxinha = sc.nextInt();
		System.out.println("Quantos pastéis deseja comprar?");
		qtdPastel = sc.nextInt();
		
		precoFinal = (qtdRefri * taxaRefri) +
				(qtdCoxinha * taxaCoxinha) +
				(qtdPastel * taxaPastel);
		
		System.out.println("Refri: " + qtdRefri);
		System.out.println("Coxinha: " + qtdCoxinha);
		System.out.println("Pastel: " + qtdPastel);
		System.out.println("Valor final: " + precoFinal);
		
		System.out.println("Quanto dinheiro você ira dar ao caixa?");
		valorPago = sc.nextDouble();
		
		troco = valorPago - precoFinal;
		
		System.out.println("Seu troco é: " + troco);
		
	}

}
