package br.com.diogo;

public class P01_ContagemRegressiva {

	public static void main(String[] args) {
		int n = 10;
		
		System.out.println("do-while");
		do {
			System.out.println(n);
			n--;
		}while(n > 0);
		
		n = 10;
		
		System.out.println("");
		System.out.println("while");
		while(n > 0) {
			System.out.println(n);
			n--;
		}
		
		System.out.println("");
		System.out.println("for");
		for(int i = 10; i > 0 ;i--) {
			System.out.println(i);
		}
		
	}

}
