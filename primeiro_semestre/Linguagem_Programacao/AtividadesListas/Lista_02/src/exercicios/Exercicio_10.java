package exercicios;

public class Exercicio_10 {

	public static void main(String[] args) {
		int linha = 1;
		
		for(int numero = 1; numero <= 100; numero ++) {
			linha ++;
			if(numero % 2 == 0) {
				System.out.print(numero + " Par");
			} 
			if (numero % 2 >= 1) {
				System.out.print(numero + " Impar");
			} 
			if (numero % 3 == 0) {
				System.out.print(" Multiplo de 3");
			} 
			if (numero % 7 == 0) {
				System.out.print(" Multiplo de 7 ");
			} 
			System.out.println();
			if (linha > 10) {
				System.out.println();
				linha = 1;
			}
		}

	}

}
