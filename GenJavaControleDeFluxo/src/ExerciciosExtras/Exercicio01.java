package ExerciciosExtras;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("\t\tSaiba qual o seu abono salárial!!");
		
		System.out.println("Digite o salário: ");
		float salario = scan.nextFloat();	
		
		System.out.println("Digite o abono");
		float abono = scan.nextFloat();
		
		float novoSalario = salario + abono;
		
		System.out.println("O seu novo salário é de: "+novoSalario);

	}

}
