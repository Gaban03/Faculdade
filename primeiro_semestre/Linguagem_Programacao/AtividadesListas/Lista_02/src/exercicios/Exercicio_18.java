//Desenvolva um gerador de tabuada, capaz de gerar a tabuada de
//qualquer n�mero inteiro entre 0 e 10. O usu�rio deve informar de qual
//n�mero ele deseja ver a tabuada.


package exercicios;

import java.util.Scanner;

public class Exercicio_18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        //pede para o usuario digitar um numero de 0 a 10
        System.out.print("Digite um n�mero inteiro entre 0 e 10 para ver sua tabuada: ");
        int numero = scanner.nextInt();

        if (numero >= 0 && numero <= 10) {
            System.out.println("Tabuada do " + numero + ":");

            for (int i = 1; i <= 10; i++) {
                int resultado = numero * i;
                System.out.println(numero + " x " + i + " = " + resultado);
            }
        } else {
            System.out.println("N�mero inv�lido. Por favor, digite um n�mero inteiro entre 0 e 10.");
        }

        scanner.close();
    }
}
