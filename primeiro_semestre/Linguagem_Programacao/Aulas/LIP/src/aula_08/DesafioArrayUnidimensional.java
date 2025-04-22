package aula_08;

import java.util.Scanner;

public class DesafioArrayUnidimensional {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);

		System.out.print("Digite o número de pessoas: ");
		int pessoas = scan.nextInt();
		
		//Cria um vetor com número de posições igual ao número de pessoas
		double [] alturas = new double[pessoas];
		
		for (int i = 0; i < pessoas; i++) {
			System.out.print("Altura da " + (i + 1) + "° pessoa: ");
			alturas[i] = scan.nextDouble();
		}
		
		double somatoria = 0;
		
		for(int i = 0; i < pessoas; i++) {
			somatoria = somatoria + alturas[i];
		}
		
		double media = somatoria / pessoas;
		
		System.out.printf("A média das alturas é: %.2f m \n", media);
		
	}

}
