package ControleDeFluxoIf;

import java.util.Scanner;
/*
 * Faça um algoritmo em Java que leia 3 valores inteiros A, B e C e imprima na tela se a 
 * soma de A + B é maior, menor ou igual a C.
 * 
 *  Na construção do Algoritmo, utilize os seguintes conteúdos:
 *  	Entrada e Saída de dados
 *		Operadores
 *		Laço Condicional IF
 */
public class Exercicio01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\n\t\tVamos realizar a verificação!!");
		
		System.out.println("\nInsira o 1ª valor: ");
		int valor1 = leia.nextInt();
		
		System.out.println("Insira o 2ª valor: ");
		int valor2 = leia.nextInt();
		
		System.out.println("Insira o 3ª valor: ");
		int valor3 = leia.nextInt();
		
		int soma = valor1 + valor2;
		
		if (soma > valor3) {
			System.out.println("O 1ª e o 2ª valor somados é maior que o 3ª valor");
		} else if (soma < valor3) {
			System.out.println("O 1ª e o 2ª valor somados é menor que o 3ª valor");
		} else {
			System.out.println("O 1ª e o 2ª valor somados é igual ao 3ª valor");
		}	
	}
}
