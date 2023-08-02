package ControleDeFluxoIf;

import java.util.Scanner;
/*
 * Para doar sangue é necessário ter entre 18 e 69 anos de idade. Pessoas com idade 
 * entre 60 e 69 anos, só podem doar se não for a sua primeira doação. Escreva um  
 * Algoritmo em Java que obtenha via teclado o nome do doador (String), a idade (inteiro) 
 * do doador e se é a primeira doação (boolean). De acordo com as Regras para a 
 * doação, mostre na tela se o doador está Apto ou Não Apto para doar sangue. Veja os 
 * exemplos abaixo:
 * 	
 * 	Na construção do Algoritmo, utilize os seguintes conteúdos:
 *		Entrada e Saída de dados
 *		Operadores
 *		Laço Condicional IF
 */

public class Exercicio03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\tPara realizar a doação de sangue insira os dados");
		System.out.println("\nInsira o seu nome: ");
		String nome = leia.nextLine();
		System.out.println("Insira a sua idade: ");
		int idade = leia.nextInt();
		
		System.out.println("É a primeira doação? (Digite 'sim' ou 'não')");
	    String primeiraDoacao = leia.nextLine();
	    boolean doacao = (primeiraDoacao.equalsIgnoreCase("sim"));
        
        if (idade >= 16 && idade <= 69) {
        	if (idade >= 18 || doacao) {
        		System.out.println(nome +" Pode realizar normalmente a doação de sangue");
        	} else {
        		System.out.println(nome +" Não pode doar sangue.");
        	}      	
        } else {
            System.out.println(nome+" está Não Apto para doar sangue.");
        }
	}
}
