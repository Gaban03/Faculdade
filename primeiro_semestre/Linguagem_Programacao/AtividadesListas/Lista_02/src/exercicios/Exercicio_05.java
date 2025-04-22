package exercicios;

/* 5. Imprima os fatoriais de 1 a 10. */

public class Exercicio_05 {

	public static void main(String[] args) {
		int fatorial = 1;
		
		for (int i = 1; i <= 10; i++) {
			fatorial = i * fatorial;
			System.out.println("O fatorial de (" + i + "!) é: " + fatorial);
		}
		
	}

}
