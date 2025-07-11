package aula_12;

import java.util.Scanner;

public class Conversor {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Digite um valor inteiro de 0 a 65535: ");
		int valor = scan.nextInt();
		
		for(int i = 15; i >= 0; i--) {
			int mascara = (int)Math.pow(2, i);
			int resultado = mascara & valor;
			
			if (resultado == 0) {
				System.out.print("0");
			} else {
				System.out.print("1");
			}
			
			if (i % 4 == 0) {
				System.out.print(" ");
			}
		}
	}

}
