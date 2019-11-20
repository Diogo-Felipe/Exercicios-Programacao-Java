
public class P04_FuncImpressaoC {

	public static void main(String[] args) {
		
		separador("*");
		System.out.println("PROGRAMAÇÃO");
		separador("=");
		System.out.println("DE SISTEMAS");
		separador("#");
		
	}
	
	static void separador(String separador) {
		for(int i = 0; i < 12; i++) {
			System.out.print(separador);
		}
		System.out.println("");
	}
}
