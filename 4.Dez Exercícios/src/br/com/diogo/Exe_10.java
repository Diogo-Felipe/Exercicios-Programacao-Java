package br.com.diogo;

import java.util.Scanner;

public class Exe_10 {

	public static void main(String[] args) {
		double conta, contaComDesconto;
		String nome;
		char primeiraLetra;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite seu nome: ");
		nome = sc.nextLine();
		
		System.out.print("Digite o valor da conta: ");
		conta = sc.nextDouble();		
		
		
		primeiraLetra = nome.charAt(0);
		
		if(primeiraLetra == 'a'
				|| primeiraLetra == 'e' 
				|| primeiraLetra == 'i' 
				|| primeiraLetra == 'o' 
				|| primeiraLetra == 'u'
				|| primeiraLetra == 'A'
				|| primeiraLetra == 'E' 
				|| primeiraLetra == 'I' 
				|| primeiraLetra == 'O' 
				|| primeiraLetra == 'U') {
			contaComDesconto = conta - (conta * 0.3);
			System.out.println("Conta com 30% de desconto: " + contaComDesconto);
		} else {
			System.out.println("Que pena! Nesta semana o" + 
					"desconto não é para seu nome; mas continue nos" + 
					"prestigiando que sua vez chegará");
		}
	}

}
