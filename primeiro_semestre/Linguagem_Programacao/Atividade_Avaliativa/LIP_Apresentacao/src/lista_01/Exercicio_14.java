package lista_01;

import java.util.Scanner;

/*Integrantes:
 * 
 * Vinicius Brolezzi Gaban
 * 
 * Murilo Herrick Riva de Camargo
 * 
 * */

/* 14.Voc� deve fazer um programa que leia um valor qualquer e apresente
uma mensagem dizendo em qual dos seguintes intervalos ([0,25], (25,50],
(50,75], (75,100]) este valor se encontra. Obviamente se o valor n�o
estiver em nenhum destes intervalos, dever� ser impressa a mensagem
�Fora de intervalo�. */

public class Exercicio_14 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		// Mada o us�arioescrever um n�mero entre os intervalos de 0 e 100
		System.out.print("Digite um n�mero de 0 a 100: ");
		// L� o n�mero digitado pelo us�ario
		int numero = scanner.nextInt();
		
		// V�lida se o n�mero est� atendendo a condi��o do intervalo [0,25]
		if(numero >= 0 && numero <= 25) {
			
			System.out.println("N�mero dentro do intervalo de [0,25]");
			
		// V�lida se o n�mero est� atendendo a condi��o do intervalo [26,50]
		} else if(numero > 25 && numero <= 50) {
			
			System.out.println("N�mero dentro do intervalo de [26,50]");
			
		// V�lida se o n�mero est� atendendo a condi��o do intervalo [51,75]
		} else if (numero > 50 && numero <= 75) {
			
			System.out.println("N�mero dentro do intervalo de [51,75]");
			
		// V�lida se o n�mero est� atendendo a condi��o do intervalo [76,100]
		} else if (numero > 75 && numero <= 100) {
			
			System.out.println("N�mero dentro do intervalo de [76,100]");
			
		} else {
			
			System.out.println("N�mero fora do intervalo!");
			
		}

	}

}
