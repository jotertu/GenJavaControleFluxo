package ControleDeFluxoSwitch;

import java.util.Scanner;
/*
 Com base na tabela abaixo, escreva um algoritmo em Java que leia o código de um item 
 (número inteiro de 1 a 6) e a quantidade comprada deste item (número inteiro). 
 A seguir, mostre na tela o valor total da conta e o nome do produto que foi comprado.
 	
 	- Dois números inteiros
 	- Um valor double
 	- estrutura switch
 	- Retorne ao usuário a quantidade de produtos adquidos, caso não exista o produto opção retornar uma resposta negativa
 */

public class Exercicio01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int produto;
		int quantidade;
		double valorTotal = 0;
		
		Scanner scan = new Scanner(System.in);
				
		System.out.println("\n\t\tMenu de produtos disponíveis");
		System.out.println("\n1 - Cachorro Quente - R$: 10,00.");
		System.out.println("\n2 - X Salada - R$: 15,00.");
		System.out.println("\n3 - X Bacon - R$: 18,00.");
		System.out.println("\n4 - Bauru - R$: 12,00.");
		System.out.println("\n5 - Refrigenrante - R$: 8,00.");
		System.out.println("\n6 - Suco de laranja - R$: 13,00.");
		System.out.printf("\nDigite a opção desejada: ");
		produto = scan.nextInt();
		
		System.out.printf("\nDigite a quantidade desejada: ");
		quantidade = scan.nextInt();
		
		switch(produto) {
			case 1:
				valorTotal = quantidade * 10.0;
				System.out.println("O produto adquido foi Cachorro Quente");
				System.out.println("Quantidade: "+quantidade);
				System.out.println("Valor: "+valorTotal);
				break;
			case 2:
                valorTotal = quantidade * 15.0;
                System.out.println("O produto adquido foi X Salada");
				System.out.println("Quantidade: "+quantidade);
				System.out.println("Valor: "+valorTotal);
                break;
            case 3:
                valorTotal = quantidade * 18.0;
                System.out.println("O produto adquido foi X Bacon");
				System.out.println("Quantidade: "+quantidade);
				System.out.println("Valor: "+valorTotal);
                break;
            case 4:
                valorTotal = quantidade * 12.0; 
                System.out.println("O produto adquido foi Bauru");
				System.out.println("Quantidade: "+quantidade);
				System.out.println("Valor: "+valorTotal);
                break;
            case 5:
                valorTotal = quantidade * 8.0; 
                System.out.println("O produto adquido foi Refrigerante");
				System.out.println("Quantidade: "+quantidade);
				System.out.println("Valor: "+valorTotal);
                break;
            case 6:
                valorTotal = quantidade * 13.0;
                System.out.println("O produto adquido foi Suco de laranja");
				System.out.println("Quantidade: "+quantidade);
				System.out.println("Valor: "+valorTotal);
                break;
            default:
		}	
	}
}
