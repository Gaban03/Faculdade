package exercicios;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Digite um número: ");
		double numero = scan.nextDouble();
		double raiz = Math.sqrt(numero);
		System.out.printf("Raiz quadrada do número digitado: %.2f", raiz);
		
		scan.close();

	}

}
