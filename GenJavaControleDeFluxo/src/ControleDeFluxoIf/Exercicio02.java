package ControleDeFluxoIf;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner leia = new Scanner(System.in);
		
		System.out.printf( "Para saber se o valor armazenado na váriavel é impar ou par e positivo ou negativo \n\t\t\tdigite um número inteiro : ");
		
		int valor = leia.nextInt();
		
		if(valor > 0) {
			
			if(valor % 2 == 0) {
				System.out.println("O valor: "+valor+" é par e positivo.");
			} else if (valor % 1 == 0) {
				System.out.println("O valor: "+valor+" é impar e positivo.");
			}
			
		} else if(valor < 0) {
			
			if(valor % 2 == 0) {
				System.out.println("O valor: "+valor+" é par e negativo.");
			} else if (valor % 1 == 0) {
				System.out.println("O valor: "+valor+" é impar e negativo.");
			}
			
		}
		
	}

}
