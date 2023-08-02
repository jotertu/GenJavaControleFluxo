package ControleDeFluxoSwitch;

import java.util.Scanner;
/*
 * Com base na tabela abaixo, escreva um algoritmo em Java que leia o Nome do Colaborador 
 * (String), o Código do Cargo do Colaborador (número inteiro de 1 a 6) e o Salário 
 * (número float). A seguir, mostre na tela o Nome do Colaborador, o Cargo e o novo 
 * Salário reajustado.
 * 
 * 	- Solicite ao usuário seu nome [String], o código do seu cargo [int] e o seu salário [double]
 * 	- Realizar calculo utilizando o controle de fluxo switch
 * 	- Retornar o novo sálario reajustado, 
 *  - Caso não exista o código do cargo, retornar respota negativa
 */

public class Exercicio02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double novoSalario;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("\n\t\tVamos realizar a verificação do seu novo salário!!");
		
		System.out.print("Insira o nome do colaborador: ");
        String nomeColaborador = scan.nextLine();

        System.out.print("Insira o código do cargo do colaborador: ");
        int codigoCargo = scan.nextInt();

        System.out.print("Insira o salário do colaborador: R$");
        double salario = scan.nextDouble();

        
        switch (codigoCargo) {
        case 1:
            novoSalario = salario + (0.10 * salario);
            System.out.println("\nDados do colaborador:");
            System.out.println("Nome: " + nomeColaborador);
            System.out.println("Cargo: Gerente");
            System.out.println("Salário atual: R$" + salario);
            System.out.println("Novo salário reajustado: R$" + novoSalario);
            break;
        case 2:
            novoSalario = salario + (0.07 * salario);
            System.out.println("\nDados do colaborador:");
            System.out.println("Nome: " + nomeColaborador);
            System.out.println("Cargo: Vendedor");
            System.out.println("Salário atual: R$" + salario);
            System.out.println("Novo salário reajustado: R$" + novoSalario);
            break;
        case 3:
            novoSalario = salario + (0.09 * salario);
            System.out.println("\nDados do colaborador:");
            System.out.println("Nome: " + nomeColaborador);
            System.out.println("Cargo: Supervisor");
            System.out.println("Salário atual: R$" + salario);
            System.out.println("Novo salário reajustado: R$" + novoSalario);
            break;
        case 4:
            novoSalario = salario + (0.06 * salario);
            System.out.println("\nDados do colaborador:");
            System.out.println("Nome: " + nomeColaborador);
            System.out.println("Cargo: Motorista");
            System.out.println("Salário atual: R$" + salario);
            System.out.println("Novo salário reajustado: R$" + novoSalario);
            break;
        case 5:
            novoSalario = salario + (0.05 * salario);
            System.out.println("\nDados do colaborador:");
            System.out.println("Nome: " + nomeColaborador);
            System.out.println("Cargo: Estoquista");
            System.out.println("Salário atual: R$" + salario);
            System.out.println("Novo salário reajustado: R$" + novoSalario);
            break;
        case 6:
            novoSalario = salario + (0.08 * salario);
            System.out.println("\nDados do colaborador:");
            System.out.println("Nome: " + nomeColaborador);
            System.out.println("Cargo: Técnico de TI");
            System.out.println("Salário atual: R$" + salario);
            System.out.println("Novo salário reajustado: R$" + novoSalario);
            break;
        default:
            System.out.println("Código de cargo inválido!");
        }     
	}
}
