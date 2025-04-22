//Sendo H = 1 + 1/2 + 1/3 + 1/4 + ... + 1/n, fa�a um programa que calcule o
//valor de H com n termos.


package exercicios;

import java.util.Scanner;

public class Exercicio_20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor de n: ");
        int n = scanner.nextInt();

        double soma = 0;

        // Loop para somar as fra��es de 1/i para i variando de 1 a n
        for (int i = 1; i <= n; i++) {
            soma += 1.0 / i;
        }

        System.out.println("O valor de H com " + n + " termos �: " + soma);

        scanner.close();
    }
}
