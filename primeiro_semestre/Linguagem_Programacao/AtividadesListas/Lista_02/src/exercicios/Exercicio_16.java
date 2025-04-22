//Fa�a um programa que imprima na tela apenas os n�meros �mpares entre
//1 e 50.


package exercicios;

public class Exercicio_16 {
    public static void main(String[] args) {
        System.out.println("N�meros �mpares entre 1 e 50:");

        // Loop de 1 a 50 para imprimir apenas os n�meros �mpares
        for (int i = 1; i <= 50; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
    }
}
