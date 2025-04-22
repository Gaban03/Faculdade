//Fa�a um programa que leia 5 n�meros e informe o maior n�mero, a soma
//e a m�dia dos n�meros.


package exercicios;

import java.util.Scanner;

public class Exercicio_15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int quantidadeNumeros = 5;
        int maiorNumero = 0;
        int soma = 0;

        System.out.println("Digite os 5 n�meros:");

        for (int i = 0; i < quantidadeNumeros; i++) {
            int numero = scanner.nextInt();
            soma += numero;

            if (numero > maiorNumero) {
                maiorNumero = numero;
            }
        }

        double media = (double) soma / quantidadeNumeros;

        System.out.println("O maior n�mero �: " + maiorNumero);
        System.out.println("A soma dos n�meros �: " + soma);
        System.out.println("A m�dia dos n�meros �: " + media);

        scanner.close();
    }
}
