package lista_01;

/*  18.As ma��s custam R$ 0,30 cada se forem compradas menos do que uma
d�zia, e R$ 0,25 se forem compradas pelo menos doze. Escreva um
programa que leia o n�mero de ma��s compradas, calcule e escreva o
valor total da compra.	*/

import java.util.Scanner;

/*Integrantes:
 * 
 * Vinicius Brolezzi Gaban
 * 
 * Murilo Herrick Riva de Camargo
 * 
 * */

public class Exercicio_18 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// Pede a quantidade de ma��s para o us�ario
		System.out.print("Digite a quantidade de ma��s foram compradas: ");
		// L� a quantidade de ma��s inserida pelo us�ario
		int quantidade = scanner.nextInt();

		// Faz a condi��o para saber se a quantidade � menor que uma duzia
		if (quantidade < 12) {

			/*
			 * Cria uma v�riavel maca de tipo double, e essa v�riavel recebe quantidade de
			 * ma��s comprada pelo us�ario e multiplica pelo valor que ser� caso seja a
			 * quantidade de ma��s seja menor que uma duzia.
			 */
			double maca = quantidade * 0.30;

			System.out.println("O pre�o total de ma��s foram R$ " + maca);

		} else {

			/*
			 * Cria uma v�riavel maca de tipo double, e essa v�riavel recebe quantidade de
			 * ma��s comprada pelo us�ario e multiplica pelo valor que ser� caso seja a
			 * quantidade de ma��s seja maior ou igual que uma duzia.
			 */
			double maca = quantidade * 0.25;

			System.out.println("O pre�o total de ma��s foram R$ " + maca);

		}

	}

}
