package ExerciciosExtras;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		System.out.println("\t\tSaiba qual é a diferença nos valores dos produtos!!");
		
		System.out.println("Insira o primeiro valor: ");
		float n1 = scan.nextFloat();
		
		System.out.println("Insira o segundo valor: ");
		float n2 = scan.nextFloat();
		
		System.out.println("Insira o terceiro valor: ");
		float n3 = scan.nextFloat();
		
		System.out.println("Insira o quarto valor: ");
		float n4 = scan.nextFloat();
		
		float produtoN1N2 = n1 * n2;
		float produtoN3N4 = n3 * n4;
		float diferencaProduto = produtoN1N2 - produtoN3N4;
		
		System.out.printf("A diferença entre os valores é de: %.2f",diferencaProduto);
		
	}

}
