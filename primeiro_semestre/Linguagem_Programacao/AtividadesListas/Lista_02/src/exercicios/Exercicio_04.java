package exercicios;

/* 4. Imprima todos os múltiplos de 7 entre 1 e 1000. */

public class Exercicio_04 {

	public static void main(String[] args) {
		for (int i = 1; i <= 100; i++) {
			if (i % 7 == 0) {
				System.out.println("Multiplo de 3: " + i);
			}
		}

	}

}
