package br.com.diogo;

import java.util.Scanner;

public class P03_PositivoParNegativoImpar {

	public static void main(String[] args) {
		int numero;
		String parImpar, positivoNegativo;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um número inteiro: ");
		numero = sc.nextInt();
		
		parImpar = (numero > 0) ? ("Positivo") : ("Negativo");
		positivoNegativo = (numero % 2 == 0) ? ("Par") : ("Impar");
		
		System.out.println("Numero " + parImpar + " e " + positivoNegativo);
	}

}
