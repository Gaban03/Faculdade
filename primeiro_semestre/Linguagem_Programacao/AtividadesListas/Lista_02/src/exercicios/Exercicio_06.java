package exercicios;

//No código do exercício anterior, aumente a quantidade de números que
//terão os fatoriais impressos até 20, 30 e 40. Em um determinado
//momento, além desse cálculo demorar, começará a mostrar respostas
//completamente erradas. Por quê?
//Mude de int para long a fim de ver alguma mudança.
//As respostas que não são códigos deverão aparecer no formato de
//comentário no cabeçalho do código fonte.


//Reposta: O motivo de os cálculos estarem errados ou simplesmente não aparecerem
//		se dá pelo fato do tipo (int, double e long etc.) que eu estou usando na minha variável como exemplo o int.
//		Depois de algumas pesquisas consegui descobrir o motivo. Esse motivo se dá pelo fato da variável int tem um certo
//		limite de armazenamento desse tipo de dado. O tipo int é uma variável de 32 bits, e isso significa que ela
//		armazena dados como valoes de aproximadamente  -2.147.483.648 a 2.147.483.647.
//		Por isso quando executamos o código para calcular fatorias de números grandes o resultado ultrapassa
//		os limites do tipo int, causando um overflow.

public class Exercicio_06 {

	public static void main(String[] args) {
		int fatorialTrinta = 1;
		
		long fatorialVinte = 1;
		
		int fatorialQuarenta = 1;
		
		for(int i = 1; i <= 20; i++) {
			fatorialVinte = i * fatorialVinte;
			System.out.println("O fatorial de (" + i + "!) é:" + fatorialVinte);
		}
		
		System.out.println();
		
		for(int i = 1; i <= 30; i++) {
			fatorialTrinta = i * fatorialTrinta;
			System.out.println("O fatorial de (" + i + "!) é:" + fatorialTrinta);
		}
		
		System.out.println();
		
		for(int i = 1; i <= 40; i++) {
			fatorialQuarenta = i * fatorialQuarenta;
			System.out.println("O fatorial de (" + i + "!) é:" + fatorialQuarenta);
		}

	}

}
