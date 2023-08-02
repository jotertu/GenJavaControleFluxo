package ControleDeFluxoIf;

import java.util.Scanner;
/*
 * Para doar sangue é necessário ter entre 18 e 69 anos de idade. Pessoas com idade entre 60 e 69 anos, 
 * só podem doar se não for a sua primeira doação. Escreva um Algoritmo em Java que obtenha via teclado o nome do doador (String),
 * a idade (inteiro) do doador e se é a primeira doação (boolean). De acordo com as Regras para a doação, 
 * mostre na tela se o doador está Apto ou Não Apto para doar sangue.
 *   
 *  - Solicite ao usuário um uma string, um int e um bool
 *  - Faça uma comparação entre a idade 
 *  - faça outra comparação para ver se é a primeira doação
 *  - retorne ao usuário se ele pode realizar ou não a doação
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
