package lista_01;

/*  18.As maçãs custam R$ 0,30 cada se forem compradas menos do que uma
dúzia, e R$ 0,25 se forem compradas pelo menos doze. Escreva um
programa que leia o número de maçãs compradas, calcule e escreva o
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

		// Pede a quantidade de maçãs para o usúario
		System.out.print("Digite a quantidade de maçãs foram compradas: ");
		// Lê a quantidade de maçãs inserida pelo usúario
		int quantidade = scanner.nextInt();

		// Faz a condição para saber se a quantidade é menor que uma duzia
		if (quantidade < 12) {

			/*
			 * Cria uma váriavel maca de tipo double, e essa váriavel recebe quantidade de
			 * maçãs comprada pelo usúario e multiplica pelo valor que será caso seja a
			 * quantidade de maçãs seja menor que uma duzia.
			 */
			double maca = quantidade * 0.30;

			System.out.println("O preço total de maçãs foram R$ " + maca);

		} else {

			/*
			 * Cria uma váriavel maca de tipo double, e essa váriavel recebe quantidade de
			 * maçãs comprada pelo usúario e multiplica pelo valor que será caso seja a
			 * quantidade de maçãs seja maior ou igual que uma duzia.
			 */
			double maca = quantidade * 0.25;

			System.out.println("O preço total de maçãs foram R$ " + maca);

		}

	}

}
