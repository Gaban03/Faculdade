package aula_12;

import java.util.Scanner;

public class MetodoComRetorno {

	public static void main(String[] args) {
		double massa, altura, imc;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite sua massa em quilograma: ");
		massa = scan.nextDouble();
		System.out.println("Digite sua altura em metros: ");
		altura = scan.nextDouble();
		imc = calculaImc(massa, altura);
		System.out.printf("Seu IMC é: %.2f", imc);
	}
	
	public static double calculaImc(double m, double a) {
		double aux;
		aux = m / Math.pow(a, 2);
		return aux;
	}

}
