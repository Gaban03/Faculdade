//Fa�a um programa que receba dois n�meros inteiros e imprima os
//n�meros inteiros que est�o no intervalo compreendido por eles.


package exercicios;

import java.util.Scanner;

public class Exercicio_17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita ao usu�rio para inserir os dois n�meros inteiros
        System.out.print("Digite o primeiro n�mero inteiro: ");
        int numero1 = scanner.nextInt();

        System.out.print("Digite o segundo n�mero inteiro: ");
        int numero2 = scanner.nextInt();

        // Determina o menor e o maior n�mero
        int menorNumero = Math.min(numero1, numero2);
        int maiorNumero = Math.max(numero1, numero2);

        // Imprime os n�meros inteiros no intervalo compreendido por eles
        System.out.println("N�meros inteiros no intervalo entre " + menorNumero + " e " + maiorNumero + ":");
        for (int i = menorNumero; i <= maiorNumero; i++) {
            System.out.println(i);
        }

        scanner.close();
    }
}
