package br.com.diogo;

import java.util.Scanner;

public class Exe_8 {

	public static void main(String[] args) {
		double nota1, nota2, media;
		String nome;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Qual o nome do aluno: ");
		nome = sc.nextLine();
		
		System.out.print("Nota a primeira avalia��o: ");
		nota1 = sc.nextDouble();
		
		System.out.print("Nota a primeira avalia��o: ");
		nota2 = sc.nextDouble();
		
		media = (nota1 + nota2)/2;
		
		if(media > 7) {
			System.out.print("Aluno " + nome + " tem m�dia " + media + ": Aprovado");
		} else if(media < 4) {
			System.out.print("Aluno " + nome + " tem m�dia " + media + ": Reprovado");
		} else {
			System.out.print("Aluno " + nome + " tem m�dia " + media + ": Em prova final");
		}
		
	}

}
