//Supondo que a popula��o de um pa�s A seja da ordem de 80.000
//habitantes com uma taxa anual de crescimento de 3% e que a popula��o
//de B seja 200.000 habitantes com uma taxa de crescimento de 1.5%.
//Fa�a um programa que calcule e escreva o n�mero de anos necess�rios
//para que a popula��o do pa�s A ultrapasse ou iguale a popula��o do pa�s
//B, mantidas as taxas de crescimento.

package exercicios;

public class Exercicio_13 {
    public static void main(String[] args) {
        int populacaoA = 80000; // Popula��o do pa�s A
        double crescimentoA = 0.03; // Taxa de crescimento do pa�s A (3% ao ano)
        
        int populacaoB = 200000; // Popula��o do pa�s B
        double crescimentoB = 0.015; // Taxa de crescimento do pa�s B (1.5% ao ano)
        
        int anos = 0; // Contador de anos
        
        // Loop para calcular e verificar o n�mero de anos necess�rios para que a popula��o de A ultrapasse ou iguale a popula��o de B
        while (populacaoA < populacaoB) {
            populacaoA += (int) (populacaoA * crescimentoA); // Calcula a nova popula��o de A ap�s o crescimento
            populacaoB += (int) (populacaoB * crescimentoB); // Calcula a nova popula��o de B ap�s o crescimento
            anos++; // Incrementa o contador de anos
        }
        
        System.out.println("N�mero de anos necess�rios para que a popula��o do pa�s A ultrapasse ou iguale a popula��o do pa�s B: " + anos);
    }
}
