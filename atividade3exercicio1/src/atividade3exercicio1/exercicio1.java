package atividade3exercicio1;

import java.util.Scanner;

public class exercicio1 {

	public static void main (String[] args) {

		Scanner scanner = new Scanner(System.in);

		int A, B, C, soma;

		System.out.println("Digite o 1º número: ");
		A = scanner.nextInt();

		System.out.println("Digite o 2º número: ");
		B = scanner.nextInt();

		System.out.println("Digite o 3º número: ");
		C = scanner.nextInt();

		soma = A + B;

		if(soma > C) 
			System.out.println("A soma de A + B é maior que C");
		else if (soma == C)
			System.out.println("A soma de A + B é igual a C");
		else
			System.out.println("A soma de A + B é menor que C");

	}

}