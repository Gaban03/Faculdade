package lista_01;

import java.util.Scanner;

/*Integrantes:
 * 
 * Vinicius Brolezzi Gaban
 * 
 * Murilo Herrick Riva de Camargo
 * 
 * */

/* 14.Você deve fazer um programa que leia um valor qualquer e apresente
uma mensagem dizendo em qual dos seguintes intervalos ([0,25], (25,50],
(50,75], (75,100]) este valor se encontra. Obviamente se o valor não
estiver em nenhum destes intervalos, deverá ser impressa a mensagem
“Fora de intervalo”. */

public class Exercicio_14 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		// Mada o usúarioescrever um número entre os intervalos de 0 e 100
		System.out.print("Digite um número de 0 a 100: ");
		// Lê o número digitado pelo usúario
		int numero = scanner.nextInt();
		
		// Válida se o número está atendendo a condição do intervalo [0,25]
		if(numero >= 0 && numero <= 25) {
			
			System.out.println("Número dentro do intervalo de [0,25]");
			
		// Válida se o número está atendendo a condição do intervalo [26,50]
		} else if(numero > 25 && numero <= 50) {
			
			System.out.println("Número dentro do intervalo de [26,50]");
			
		// Válida se o número está atendendo a condição do intervalo [51,75]
		} else if (numero > 50 && numero <= 75) {
			
			System.out.println("Número dentro do intervalo de [51,75]");
			
		// Válida se o número está atendendo a condição do intervalo [76,100]
		} else if (numero > 75 && numero <= 100) {
			
			System.out.println("Número dentro do intervalo de [76,100]");
			
		} else {
			
			System.out.println("Número fora do intervalo!");
			
		}

	}

}
