package br.com.diogo;

import java.util.Scanner;

/*
    Esta � a primeira vers�o de um projeto com diversos c�lculos estat�sticos.
    
    Antes de tudo, execute o projeto e veja como ele funciona.
    
    Miss�o: analise o c�digo e o converta em um projeto que use fun��es para 
realizar os c�lculos, melhorando a legibilidade do c�digo e facilitando as 
futuras manuten��es.
*/

public class ProjetoEstatisticaV1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int TAMANHO;
        
        System.out.print("Informe a quantidade de dados: ");
        TAMANHO = sc.nextInt();
        
        double dados[] = new double[TAMANHO];
        
        System.out.println("-------------------");
        for ( int i = 0; i < TAMANHO; i++ ) {
            System.out.print("dado["+i+"]: ");
            dados[i] = sc.nextDouble();
        }
        
        int opcao = 0;
        do {
            System.out.println("-------------------");
            System.out.println("O que deseja imprimir dos dados?");
            System.out.println("1. M�dia aritm�tica");
            System.out.println("2. Desvio padr�o populacional");
            System.out.println("3. Vari�ncia populacional");
            System.out.println("4. Maior valor");
            System.out.println("5. Menor valor");
            System.out.println("6. Quantidade de dados maiores que a m�dia");
            System.out.println("7. Quantidade de dados menores que a m�dia");
            System.out.println("0. Sair");
            System.out.println("-------------------");
            System.out.print("Op��o: ");
            opcao = sc.nextInt();
            System.out.println("-------------------");
            
            double soma = 0, media, desvioPadrao, variancia;
            
            switch(opcao) {
                case 1:
                    for(int i = 0; i < TAMANHO; i++){
                        soma = soma + dados[i];
                    }
                    media = soma / TAMANHO;
                    System.out.printf("M�dia: %.2f \n", media);
                break;
                case 2:
                    for(int i = 0; i < TAMANHO; i++){
                        soma = soma + dados[i];
                    }
                    media = soma / TAMANHO;
                    double somaDP = 0;
                    for(int i = 0; i < TAMANHO; i++){
                        somaDP = somaDP + Math.pow(dados[i] - media , 2);
                    }
                    desvioPadrao = Math.sqrt(somaDP / TAMANHO);
                    System.out.printf("Desvio padr�o populacional: %.2f \n", desvioPadrao);
                break;
                case 3:
                    for(int i = 0; i < TAMANHO; i++){
                        soma = soma + dados[i];
                    }
                    media = soma / TAMANHO;
                    double somaVar = 0;
                    for(int i = 0; i < TAMANHO; i++){
                        somaVar = somaVar + Math.pow(dados[i] - media , 2);
                    }
                    variancia = somaVar / TAMANHO;
                    System.out.printf("Vari�ncia populacional: %.2f \n", variancia);
                break;
                case 4:
                    double maior = dados[0];
                    for(int i = 0; i < TAMANHO; i++){
                        if(dados[i] > maior) {
                            maior = dados[i];
                        }
                    }
                    System.out.println("Maior valor: " + maior);
                break;
                case 5:
                    double menor = dados[0];
                    for(int i = 0; i < TAMANHO; i++){
                        if(dados[i] < menor) {
                            menor = dados[i];
                        }
                    }
                    System.out.println("Menor valor: " + menor);
                break;
                case 6:
                    int qtdMaiorMedia = 0;
                    for(int i = 0; i < TAMANHO; i++){
                        soma = soma + dados[i];
                    }
                    media = soma / TAMANHO;
                    for(int i = 0; i < TAMANHO; i++){
                        if(dados[i] > media) {
                            qtdMaiorMedia++;
                        }
                    }
                    System.out.println("Qtd de dados maior que a m�dia: " + qtdMaiorMedia);
                break;
                case 7:
                    int qtdMenorMedia = 0;
                    for(int i = 0; i < TAMANHO; i++){
                        soma = soma + dados[i];
                    }
                    media = soma / TAMANHO;
                    for(int i = 0; i < TAMANHO; i++){
                        if(dados[i] < media) {
                            qtdMenorMedia++;
                        }
                    }
                    System.out.println("Qtd de dados maior que a m�dia: " + qtdMenorMedia);
                break;
                default:
                    if(opcao == 0)
                        System.out.println("Tchau!");
                    else
                        System.out.println("Erro! Op��o inv�lida.");
            
            } // fim switch
            
        } while( opcao != 0 );
        
    } // fim main
    
} // fim programa