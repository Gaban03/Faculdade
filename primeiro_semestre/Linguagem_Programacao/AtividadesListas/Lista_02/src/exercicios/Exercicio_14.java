//Fa�a um programa que imprima na tela os n�meros de 1 a 20, um abaixo
//do outro e logo em seguida mostre os n�meros um ao lado do outro.


package exercicios;

public class Exercicio_14 {
    public static void main(String[] args) {
        // Imprime os n�meros de 1 a 20 um abaixo do outro
        System.out.println("N�meros de 1 a 20 um abaixo do outro:");
        for (int i = 1; i <= 20; i++) {
            System.out.println(i);
        }

        // Imprime os n�meros de 1 a 20 um ao lado do outro
        System.out.println("\nN�meros de 1 a 20 um ao lado do outro:");
        for (int i = 1; i <= 20; i++) {
            System.out.print(i + " ");
        }
    }
}
