package exercicios;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Digite um valor para base: ");
		double base = scan.nextDouble();
		System.out.print("Digite um valor para o expoente: ");
		double expoente = scan.nextDouble();
		double resultado = Math.pow(base, expoente);
		System.out.println("Resultado: " + resultado);
		
		scan.close();
	}

}
