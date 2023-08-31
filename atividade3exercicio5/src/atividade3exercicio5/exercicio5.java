package atividade3exercicio5;

import java.util.Scanner; 

public class exercicio5 {


	public static void main (String[] args) {
		Scanner scanner = new Scanner(System.in);
		String produto;
		int codigo, quantidade;
		double valorTotal;
	

		System.out.println("Qual o código do produto? ");
		codigo = scanner.nextInt();

		System.out.println("Qual a quantidade do produto? ");
		quantidade = scanner.nextInt();

		switch(codigo) {
		case 1:
			produto = "Cachorro-quente";
			valorTotal = quantidade * 10.0;
			System.out.println("Produto: " + produto);
			System.out.printf("Valor total: R$ %.2f", valorTotal);
			break;

		case 2:
			produto = "X-Salada";
			valorTotal = quantidade * 15.0;
			System.out.println("Produto: " + produto);
			System.out.printf("Valor total: R$ %.2f", valorTotal);
			break;

		case 3:
			produto = "X-Bacon";
			valorTotal = quantidade * 18.0;
			System.out.println("Produto: " + produto);
			System.out.printf("Valor total: R$ %.2f", valorTotal);
			break;

		case 4:
			produto = "Bauru";
			valorTotal = quantidade * 12.0;
			System.out.println("Produto: " + produto);
			System.out.printf("Valor total: R$ %.2f", valorTotal);
			break;

		case 5:
			produto = "Refrigerante";
			valorTotal = quantidade * 8.0;
			System.out.println("Produto: " + produto);
			System.out.printf("Valor total: R$ %.2f", valorTotal);
			break;

		case 6:
			produto = "Suco de Laranja";
			valorTotal = quantidade * 13.0;
			System.out.println("Produto: " + produto);
			System.out.printf("Valor total: R$ %.2f", valorTotal);
			break;

		default:
			System.out.println("Produto não encontrado.");
		}

	}

}
