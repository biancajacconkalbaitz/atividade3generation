package atividadegeneration2;

import java.util.Scanner;

public class exercicio2 
{

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int numero;
		

		{
				System.out.print("Digite um número inteiro: ");
				numero = leia.nextInt();


				if(numero%2==0){
					System.out.print("O número é par.\n");
				}else{
					System.out.print("O número não é par\n");
				}
				if(numero<0){
					System.out.print("O número é negativo\n");
				}else{
					System.out.print("O número é positivo\n");
				}

		}	

}}