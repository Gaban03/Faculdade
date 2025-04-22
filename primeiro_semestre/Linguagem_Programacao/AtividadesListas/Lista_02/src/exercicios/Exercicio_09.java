//Com base no exerc�cio anterior, fa�a um c�digo que calcule o somat�rio
//de todos os pesos das posi��es de 0 a 15. Utilize o comando for.


package exercicios;

public class Exercicio_09 {
    public static void main(String[] args) {
        System.out.println("Somat�rio dos pesos das posi��es de 0 a 15:");

        int somatorio = 0; // Inicializa o somat�rio

        // Loop para calcular o somat�rio dos pesos
        for (int posicao = 0; posicao < 16; posicao++) {
            int peso = (int) Math.pow(2, posicao); // Calcula o peso
            somatorio += peso; // Adiciona o peso ao somat�rio
        }

        System.out.println("O somat�rio �: " + somatorio); // Exibe o somat�rio
    }
}
