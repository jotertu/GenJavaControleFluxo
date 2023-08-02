package ControleDeFluxoSwitch;

import java.util.Scanner;

/*
 * Com base na tabela abaixo, escreva um algoritmo em Java, que simule uma 
 * Calculadora simples. O programa deverá ler dois números float: numero1 e numero2, 
 * e na sequência ler o Código da operação matemática (número inteiro de 1 a 4). A  
 * seguir, mostre na tela o resultado da operação entre os 2 números. Caso a operação 
 * seja diferente do intervalo 1 a 4, mostre a mensagem Operação Inválida!
 * 
 *  Na construção do Algoritmo, utilize os seguintes conteúdos:
 *  	Entrada e Saída de dados
 * 		Operadores
 *  	Laço Condicional Switch
 */

public class Exercicio03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float numero1, numero2, valorFinal;
		int codigoOperacao;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("\n\t\t Selecione o tipo operação matemática que deseja realizar!!");
		System.out.println("\nDigite 1 para realizar soma ");
		System.out.println("\nDigite 2 para realizar subtração ");
		System.out.println("\nDigite 3 para realizar multiplicação ");
		System.out.println("\nDigite 4 para realizar divisão ");
		codigoOperacao = scanner.nextInt();
			
		System.out.print("Insira o primeiro número: ");
		numero1 = scanner.nextFloat();
		
		System.out.print("Insira o segundo número: ");
		numero2 = scanner.nextFloat();
		
		switch (codigoOperacao) {
		case 1: 
			valorFinal = numero1 + numero2;
			System.out.print("O resultado da soma dos números é de: "+valorFinal);
			break;
		case 2: 
			valorFinal = numero1 - numero2;
			System.out.print("O resultado da subtração dos números é de: "+valorFinal);
			break;
		case 3: 
			valorFinal = numero1 * numero2;
			System.out.print("O resultado da multiplicação dos números é de: "+valorFinal);
			break;
		case 4: 
			valorFinal = numero1 / numero2;
			System.out.print("O resultado da divisão dos números é de: "+valorFinal);
			break;
		 default:
	            System.out.println("Código de cargo inválido!");
	    }				
	}
}
