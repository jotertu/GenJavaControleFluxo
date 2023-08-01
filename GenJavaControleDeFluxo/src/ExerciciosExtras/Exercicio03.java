package ExerciciosExtras;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		System.out.println("\t\tSaiba qual o seu salário total mensal!!");
		
		System.out.println("Informe o salário bruto: ");
		float salarioBruto = scan.nextFloat();
		
		System.out.println("Informe o adicional noturno: ");
		float adicionalNoturno = scan.nextFloat();
		
		System.out.println("Informe as horas extras: ");
		float horasExtras = scan.nextFloat();
		
		System.out.println("Informe os descontos: ");
		float descontos = scan.nextFloat();
		
		float salarioLiquido = salarioBruto + adicionalNoturno + (horasExtras * 5 ) - descontos;
		
		System.out.println("O Salário Líquido é: " + salarioLiquido);
		
	}

}
