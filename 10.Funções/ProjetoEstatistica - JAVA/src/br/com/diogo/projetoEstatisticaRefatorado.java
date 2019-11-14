package br.com.diogo;

import java.util.Scanner;

public class projetoEstatisticaRefatorado {

    public static void main(String[] args) {
        int TAMANHO = entradaNumeroDeElementos();
        double dados[] = new double[TAMANHO];
        
        imprimeSeparador();
        dados = entradaDosDados(TAMANHO);
        
        int opcao = 0;
        do {
        	opcao = menuOpcoes();
            
        	selecionador(opcao, dados);
            
        } while( opcao != 0 );
        
    } // fim main
    
    
    static void imprimeSeparador() {
    	System.out.println("-------------------");
    }
    
    
    static int entradaNumeroDeElementos() {
    	Scanner sc = new Scanner(System.in);
    	
        System.out.print("Informe a quantidade de dados: ");
        
        return sc.nextInt();
    }
    
    static double[] entradaDosDados(int TAMANHO) {
    	Scanner sc = new Scanner(System.in);
    	 
    	double dados[] = new double[TAMANHO];
    	
        for ( int i = 0; i < TAMANHO; i++ ) {
            System.out.print("dado["+i+"]: ");
            dados[i] = sc.nextDouble();
        }
        
    	return dados;
    }

    
    static double calculaMedia(double dados[]){
    	double soma = 0, media;
    			
        for(int i = 0; i < dados.length; i++){
            soma = soma + dados[i];
        }
        media = soma / dados.length;
        System.out.printf("Média: %.2f \n", media);
        
        return media;
    }
    
    static double calculaDesvio(double dados[]) {
        double media, desvioPadrao;

        media = calculaMedia(dados);
        
        double somaDP = 0;
        for(int i = 0; i < dados.length; i++){
            somaDP = somaDP + Math.pow(dados[i] - media , 2);
        }
        desvioPadrao = Math.sqrt(somaDP / dados.length);
        System.out.printf("Desvio padrão populacional: %.2f \n", desvioPadrao);
        
        return desvioPadrao;
    }
    
    static double calculaVariancia( double dados[]) {
    	double media, variancia;
    	
    	media = calculaMedia(dados);
        
    	double somaVar = 0;
        for(int i = 0; i < dados.length; i++){
            somaVar = somaVar + Math.pow(dados[i] - media , 2);
        }
        variancia = somaVar / dados.length;
        System.out.printf("Variância populacional: %.2f \n", variancia);
        
        return variancia;
    }
    
    static double calculaMaior(double dados[]) {
        double maior = dados[0];
        for(int i = 0; i < dados.length; i++){
            if(dados[i] > maior) {
                maior = dados[i];
            }
        }
        System.out.println("Maior valor: " + maior);
        
        return maior;
    }
    
    static double calculaMenor(double dados[]) {
    	double menor = dados[0];
        for(int i = 0; i < dados.length; i++){
            if(dados[i] < menor) {
                menor = dados[i];
            }
        }
        System.out.println("Menor valor: " + menor);
        
        return menor;
    }
    
    static int calculaQtdMaiorMedia(double dados[]) {
        int qtdMaiorMedia = 0;
        
        double media = calculaMedia(dados);
        
        for(int i = 0; i < dados.length; i++){
            if(dados[i] > media) {
                qtdMaiorMedia++;
            }
        }
        
        System.out.println("Qtd de dados maior que a média: " + qtdMaiorMedia);
        
        return qtdMaiorMedia;
    }
    
    static int calculaQtdMenorMedia(double dados[]) {
        int qtdMenorMedia = 0;
        
        double media = calculaMedia(dados);
        
        for(int i = 0; i < dados.length; i++){
            if(dados[i] < media) {
                qtdMenorMedia++;
            }
        }
        System.out.println("Qtd de dados maior que a média: " + qtdMenorMedia);
        
        return qtdMenorMedia;
    }
    
    
    static void casoPadrao(int opcao) {
        if(opcao == 0)
            System.out.println("Tchau!");
        else
            System.out.println("Erro! Opção inválida.");
    }
    
    static int menuOpcoes() {
    	Scanner sc = new Scanner(System.in);
    	
    	int opcao = 0;
    	
    	imprimeSeparador();
        System.out.println("O que deseja imprimir dos dados?");
        System.out.println("1. Média aritmética");
        System.out.println("2. Desvio padrão populacional");
        System.out.println("3. Variância populacional");
        System.out.println("4. Maior valor");
        System.out.println("5. Menor valor");
        System.out.println("6. Quantidade de dados maiores que a média");
        System.out.println("7. Quantidade de dados menores que a média");
        System.out.println("0. Sair");
        imprimeSeparador();
        System.out.print("Opção: ");
        opcao = sc.nextInt();
        imprimeSeparador();
        
        return opcao;
    }
    
    static void selecionador(int opcao, double dados[]) {
        switch(opcao) {
	        case 1:
	        	calculaMedia(dados);
	        break;
	        case 2:
	        	calculaDesvio(dados);
	        break;
	        case 3:
	        	calculaVariancia(dados);
	        break;
	        case 4:
	        	calculaMaior(dados);
	        break;
	        case 5:
	        	calculaMenor(dados);
	        break;
	        case 6:
	        	calculaQtdMaiorMedia(dados);
	        break;
	        case 7:
	        	calculaQtdMenorMedia(dados);
	        break;
	        default:
	        	casoPadrao(opcao);
    
        } // fim switch
    }
} // fim programa