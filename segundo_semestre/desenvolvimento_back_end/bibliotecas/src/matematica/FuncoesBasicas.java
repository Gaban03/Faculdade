package matematica;

import java.util.Scanner;

public class FuncoesBasicas {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

		System.out.print("Digite um número: ");
		int numero = scanner.nextInt();
		int modulo = Math.abs(numero);
		System.out.println("Esse é o modulo do número digitado: " + modulo);
		
		scanner.close();
	}

}
