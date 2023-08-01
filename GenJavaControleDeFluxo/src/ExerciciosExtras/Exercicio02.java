package ExerciciosExtras;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		System.out.println("\t\tSaiba sua média aritimética!!");
		
		System.out.printf("Digite a primeira nota: ");
		float n1 = scan.nextFloat();
		
		System.out.printf("Digite a segunda nota: ");
		float n2 = scan.nextFloat();
		
		System.out.printf("Digite a terceira nota: ");
		float n3 = scan.nextFloat();
		
		System.out.printf("Digite a quarta nota: ");
		float n4 = scan.nextFloat();
		
		float calcularMedia = (n1 + n2 + n3 + n4) / 4;		
		
		System.out.printf("\nMédia Aritmética foi de: %.2f",calcularMedia);
		
	}

}
