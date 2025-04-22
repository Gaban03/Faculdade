package exercicios;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Digite o valor do primeiro cateto: ");
		double cateto1 = scan.nextDouble();
		System.out.print("Digite o valor do segundo cateto: ");
		double cateto2 = scan.nextDouble();
		double hipotenusa = Math.hypot(cateto1, cateto2);
		System.out.printf("Resultado da hipotenusa: %.2f", hipotenusa);
		
		scan.close();
	}
}
