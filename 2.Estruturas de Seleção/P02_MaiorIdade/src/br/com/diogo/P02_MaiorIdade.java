package br.com.diogo;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class P02_MaiorIdade {

	public static void main(String[] args) {
		int anoNascimento, idade;
		Scanner sc = new Scanner(System.in);
		Calendar cal = GregorianCalendar.getInstance();
		
		System.out.print("Digite seu ano de nascimento: ");
		anoNascimento = sc.nextInt();
		
		idade = cal.get(Calendar.YEAR) - anoNascimento;
		
		if(idade >= 18) {
			System.out.println("Maior de idade");
		} else {
			System.out.println("Menor de idade");
		}
	}

}
