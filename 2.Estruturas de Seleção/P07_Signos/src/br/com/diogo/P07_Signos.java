package br.com.diogo;

import java.util.Scanner;

public class P07_Signos {

	public static void main(String[] args) {
		int diaDeNascimento, mesDeNascimento;
		String signo;
		Scanner sc = new Scanner(System.in);	
		
		System.out.print("Digite seu dia de nascimetno: ");
		diaDeNascimento = sc.nextInt();
		System.out.print("Digite seu mes de nascimetno (num�rico): ");
		mesDeNascimento = sc.nextInt();
		
		if(mesDeNascimento == 1) {
			if(diaDeNascimento <= 20) {
				signo = "Capric�rnio";
			} else {
				signo = "Aqu�rio";
			}
		} else if(mesDeNascimento == 2) {
			if(diaDeNascimento <= 18) {
				signo = "Aquario";
			} else {
				signo = "Peixes";
			}
		} else if(mesDeNascimento == 3) {
			if(diaDeNascimento <= 20) {
				signo = "Peixes";
			} else {
				signo = "�ries";
			}
		} else if(mesDeNascimento == 4) {
			if(diaDeNascimento <= 20) {
				signo = "Aries";
			} else {
				signo = "Touro";
			}
		} else if(mesDeNascimento == 5) {
			if(diaDeNascimento <= 20) {
				signo = "Touro";
			} else {
				signo = "G�meos";
			}
		} else if(mesDeNascimento == 6) {
			if(diaDeNascimento <= 20) {
				signo = "G�meos";
			} else {
				signo = "C�ncer";
			}
		} else if(mesDeNascimento == 7) {
			if(diaDeNascimento <= 22) {
				signo = "C�ncer";
			} else {
				signo = "Virgem";
			}
		} else if(mesDeNascimento == 8) {
			if(diaDeNascimento <= 22) {
				signo = "Virgem";
			} else {
				signo = "Libra";
			}
		} else if(mesDeNascimento == 9) {
			if(diaDeNascimento <= 22) {
				signo = "Libra";
			} else {
				signo = "Escorpi�o";
			}
		} else if(mesDeNascimento == 10) {
			if(diaDeNascimento <= 21) {
				signo = "Escorpi�o";
			} else {
				signo = "Sagit�rio";
			}
		} else if(mesDeNascimento == 11) {
			if(diaDeNascimento <= 21) {
				signo = "Sagit�rio";
			} else {
				signo = "Capric�rnio";
			}
		} else if(mesDeNascimento == 12) {
			if(diaDeNascimento <= 20) {
				signo = "Capric�rnio";
			} else {
				signo = "Aqu�rio";
			}
		} else {
			System.out.println("Dia ou mes invalido");
			signo = "";
		}
		
		System.out.println("Seu signo �: " + signo);
	}

}
