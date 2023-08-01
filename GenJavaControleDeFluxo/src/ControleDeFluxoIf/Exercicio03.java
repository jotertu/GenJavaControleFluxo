package ControleDeFluxoIf;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\tPara realizar a doação de sangue insira os dados");
		System.out.println("\nInsira o seu nome: ");
		String nome = leia.nextLine();
		System.out.println("Insira a sua idade: ");
		int idade = leia.nextInt();
		System.out.print("É a primeira doação?");
        boolean Doacao = leia.nextBoolean();
        
        if (idade >= 16 && idade <= 69) {
        	if(idade >= 18 || Doacao) {
        		System.out.println(nome +" Pode realizar normalmente a doação de sangue");
        	} else {
        		System.out.println(nome +" Não pode doar sangue.");
        	}
        	
        } else {
            System.out.println(nome+" está Não Apto para doar sangue.");
        }

	}

}
