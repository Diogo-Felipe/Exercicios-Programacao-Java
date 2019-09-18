package br.com.diogo;

import java.util.Scanner;

public class P07_Signos {

	public static void main(String[] args) {
		int diaDeNascimento, mesDeNascimento;
		String signo;
		Scanner sc = new Scanner(System.in);	
		
		System.out.print("Digite seu dia de nascimetno: ");
		diaDeNascimento = sc.nextInt();
		System.out.print("Digite seu mes de nascimetno (numérico): ");
		mesDeNascimento = sc.nextInt();
		
		if(mesDeNascimento == 1) {
			if(diaDeNascimento <= 20) {
				signo = "Capricórnio";
			} else {
				signo = "Aquário";
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
				signo = "Áries";
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
				signo = "Gêmeos";
			}
		} else if(mesDeNascimento == 6) {
			if(diaDeNascimento <= 20) {
				signo = "Gêmeos";
			} else {
				signo = "Câncer";
			}
		} else if(mesDeNascimento == 7) {
			if(diaDeNascimento <= 22) {
				signo = "Câncer";
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
				signo = "Escorpião";
			}
		} else if(mesDeNascimento == 10) {
			if(diaDeNascimento <= 21) {
				signo = "Escorpião";
			} else {
				signo = "Sagitário";
			}
		} else if(mesDeNascimento == 11) {
			if(diaDeNascimento <= 21) {
				signo = "Sagitário";
			} else {
				signo = "Capricórnio";
			}
		} else if(mesDeNascimento == 12) {
			if(diaDeNascimento <= 20) {
				signo = "Capricórnio";
			} else {
				signo = "Aquário";
			}
		} else {
			System.out.println("Dia ou mes invalido");
			signo = "";
		}
		
		System.out.println("Seu signo é: " + signo);
	}

}
