package exercicios;

public class Exercicio_02 {

	/* 2. Imprima a soma de 1 até 1000. */

	public static void main(String[] args) {

		int numero = 0;

		for (int i = 1; i <= 1000; i++) {

			numero = i + numero;
		}
		System.out.println("Contador: " + numero);
	}

}
