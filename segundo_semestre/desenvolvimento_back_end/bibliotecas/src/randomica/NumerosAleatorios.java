package randomica;

import java.util.Random;
import java.util.Scanner;

public class NumerosAleatorios {

	public static void main(String[] args) {
		Random random = new Random();
		Scanner scan =  new Scanner(System.in);
		
		byte[] meuArray = {0,0,0,0,0};
		
		System.out.println("Valor inteiro aleatório: " + random.nextInt());
		System.out.println("Valor double aleatório: " + random.nextDouble());
		System.out.println("Valor boolean aleatório: " + random.nextBoolean());
		System.out.print("Bytes aleatório: ");
		random.nextBytes(meuArray);
		for (byte x : meuArray) {
			System.out.print(x + "  ");
		}
		System.out.println();
		
		System.out.print("Digite o limite superior: ");
		int limite = scan.nextInt();
		int resultado = random.nextInt(limite);
		System.out.println("Número inteiro aleatório com limite: " + resultado);	
				
		System.out.print("Digite um valor para semente: ");
		int semente = scan.nextInt();
		
		System.out.print("Numeros aleatórios com mesma semente: ");
		
		for(int i = 0; i <= 10; i++) {
			Random randomSeed = new Random(semente);
			System.out.print(randomSeed.nextInt(30) + " | ");
		}
		
		scan.close();
	}

}
