//Fa�a um programa que pe�a dois n�meros, base e expoente, calcule e
//mostre o primeiro n�mero elevado ao segundo n�mero.


package exercicios;

import java.util.Scanner;

public class Exercicio_19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita ao usu�rio que insira a base e o expoente
        System.out.print("Digite a base: ");
        double base = scanner.nextDouble();

        System.out.print("Digite o expoente: ");
        int expoente = scanner.nextInt();

        // Calcula a pot�ncia e imprime o resultado
        double resultado = Math.pow(base, expoente);
        System.out.println(base + " elevado a " + expoente + " � igual a " + resultado);

        scanner.close();
    }
}
