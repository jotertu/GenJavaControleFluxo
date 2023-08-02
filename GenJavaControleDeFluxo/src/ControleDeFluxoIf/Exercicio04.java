package ControleDeFluxoIf;

import java.util.Scanner;
/*
 * Escreva um algoritmo em Java, que leia 3 palavras (String), que definem as 
 * características de um tipo de animal possível segundo o diagrama abaixo, que deve 
 * ser lido da esquerda para a direita.
 * 
 * 	Na construção do Algoritmo, utilize os seguintes conteúdos:
 *		Entrada e Saída de dados
 *   	Operadores
 *		Laço Condicional If
 *  	Utilize o Método String.equals() ou String.equalsIgnoreCase() para comparar as palavras
 */

public class Exercicio04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nInforme a primeira característica do animal: ");
		String caracteristica1 = leia.nextLine();
		
		System.out.println("\nInforme a segunda característica do animal: ");
		String caracteristica2 = leia.nextLine();
		
		System.out.println("\nInforme a terceira característica do animal: ");
		String caracteristica3 = leia.nextLine();
		
		if (caracteristica1.equalsIgnoreCase("vertebrado")) {
			if (caracteristica2.equalsIgnoreCase("ave")) {
				if (caracteristica3.equalsIgnoreCase("carnivoro")) {
					System.out.println("É uma águia.");			
				} else if (caracteristica2.equalsIgnoreCase("onivoro")) {
					System.out.println("É um pombo.");
				}				
			} else if (caracteristica2.equalsIgnoreCase("mamifero")) {
				if (caracteristica3.equalsIgnoreCase("onivoro")) {
					System.out.println("É um homem.");
				} else if (caracteristica3.equalsIgnoreCase("herbivoro")) {
					System.out.println("É uma vaca.");
				}			
			}		
		} else if (caracteristica1.equalsIgnoreCase("invertebrado")) {
			if (caracteristica2.equalsIgnoreCase("inseto")) {
				if (caracteristica3.equalsIgnoreCase("hematofago")) {
					System.out.println("É uma pulga.");
				} else if (caracteristica3.equalsIgnoreCase("herbivoro")) {
					System.out.println("É uma lagarta.");
				}
			} else if (caracteristica2.equalsIgnoreCase("anelideo")) {
				if(caracteristica3.equalsIgnoreCase("hematofago")) {
					System.out.println("É uma sanguessuga.");
				} else if (caracteristica3.equalsIgnoreCase("onivoro")) {
					System.out.println("É uma minhoca.");
				}
			}
		} else {
			System.out.println("Combinação inválida.");
		}	
	}
}
