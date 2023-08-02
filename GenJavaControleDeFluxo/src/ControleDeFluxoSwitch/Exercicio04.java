package ControleDeFluxoSwitch;

import java.util.Scanner;

/*
 *Desenvolva um algoritmo em Java para uma conta bancária. O programa deverá ler o 
 *tipo de operação a ser realizada com base na tabela abaixo (número inteiro entre 1 e
 *3) e o valor a ser depositado ou sacado (somente nas opções 2 e 3). Considere que 
 *um saque só pode ser realizado caso haja saldo suficiente. Ao final de cada operação, 
 *exiba o novo Saldo na tela. A variável saldo (float), será inicializada com o valor de R$ 
 *1000.00. Caso a operação seja diferente do intervalo 1 a 3, mostre a mensagem Operação Inválida!
 * 
 * Na construção do Algoritmo, utilize os seguintes conteúdos:
 * 		Entrada e Saída de dados
 * 		Operadores
 * 		Laço Condicional Switch
 */

public class Exercicio04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double saldo = 1000.00, saque, deposito;
		int codigoOperacao;
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("\n\t\t Selecione o tipo operação bancária que deseja realizar!!");
		System.out.println("\nDigite 1 para saber o seu saldo");
		System.out.println("\nDigite 2 para realizar o saque");
		System.out.println("\nDigite 3 para realizar um depósito");
		codigoOperacao = scanner.nextInt();
		
		switch (codigoOperacao) {
		case 1:
			System.out.print("O saldo em sua conta é de: "+saldo);
			break;
		case 2:
			 System.out.println("Digite o valor a ser sacado: R$ ");
			 saque = scanner.nextDouble();
			 if (saldo >= saque) {
				 saldo -= saque;
				 System.out.println("Saque realizado com sucesso.");
                 System.out.println("Seu novo saldo é: R$" + saldo);
			 } else {
				 System.out.println("Saldo insuficiente para realizar o saque.");
			 }
			break;
		case 3:
			System.out.println("Digite o valor a ser sacado: R$ ");
			deposito = scanner.nextDouble();
			saldo += deposito;
			System.out.println("Depósito realizado com sucesso.");
            System.out.println("Seu novo saldo é: R$" + saldo);	
		break;
		default:
			System.out.println("Operação Inválida!");
		}
	}
}
