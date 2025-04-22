//Fa�a um c�digo que exiba os pesos das 16 primeiras posi��es dos d�gitos
//bin�rios. O peso � calculado por 2posi��o, onde a posi��o ser� contada de
//0 a 15. Cada valor dever� ser apresentado em uma linha no seguinte
//formato 2 ^ 0 = 1. A cada quatro linhas dever� ser inserida uma linha em
//branco. Utilize o comando for.


package exercicios;

public class Exercicio_08 {
    public static void main(String[] args) {
        System.out.println("Pesos das 16 primeiras posi��es dos d�gitos bin�rios:");

        // Loop para calcular e exibir os pesos
        for (int posicao = 0; posicao < 16; posicao++) {
            int peso = (int) Math.pow(2, posicao); // Calcula o peso

            System.out.println("2 ^ " + posicao + " = " + peso); // Exibe o peso

            // Insere uma linha em branco a cada quatro linhas
            if ((posicao + 1) % 4 == 0) {
                System.out.println(); // Linha em branco
            }
        }
    }
}
