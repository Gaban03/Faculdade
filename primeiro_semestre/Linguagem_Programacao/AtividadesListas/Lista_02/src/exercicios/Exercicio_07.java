//Utilize o comando for para imprimir os 30 primeiros n�meros da s�rie de
//Fibonacci. A s�rie de Fibonacci � a seguinte: 0, 1, 1, 2, 3, 5, 8, 13, 21, etc.
//Para calcul�-la, o primeiro elemento vale 0, o segundo vale 1, e da� por
//diante. O n-�simo elemento vale o (n-1)-�simo elemento somado ao (n-
//2)-�simo elemento (ex: 8 = 3 + 5).


package exercicios;

public class Exercicio_07 {
    public static void main(String[] args) {
        System.out.println("Os 30 primeiros n�meros da s�rie de Fibonacci:");

        // Inicializa��o dos dois primeiros n�meros da s�rie
        int fibonacciAnterior = 0;
        int fibonacciAtual = 1;

        // Loop para calcular e imprimir os 30 primeiros n�meros da s�rie de Fibonacci
        for (int i = 0; i < 30; i++) {
            System.out.print(fibonacciAnterior + " "); 
            // Imprime o n�mero atual da s�rie
            
            int proximoFibonacci = fibonacciAnterior + fibonacciAtual; 
            // Calcula o pr�ximo n�mero da s�rie
            
            fibonacciAnterior = fibonacciAtual; 
            // Atualiza o n�mero anterior
            
            fibonacciAtual = proximoFibonacci; 
            // Atualiza o n�mero atual
        }
    }
}
