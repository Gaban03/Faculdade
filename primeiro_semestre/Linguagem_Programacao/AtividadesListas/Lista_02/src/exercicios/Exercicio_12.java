//Fa�a um programa que leia um nome de usu�rio e a sua senha e n�o
//aceite a senha igual ao nome do usu�rio, mostrando uma mensagem de
//erro e voltando a pedir as informa��es.


package exercicios;

import java.util.Scanner;

public class Exercicio_12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nomeUsuario;
        String senha;

        do {
            System.out.print("Digite nome de usu�rio: ");
            nomeUsuario = scanner.nextLine();

            System.out.print("Digite uma senha: ");
            senha = scanner.nextLine();

            if (senha.equals(nomeUsuario)) {
                System.out.println("Erro: A senha n�o pode ser igual ao nome de usu�rio!");
            }
        } while (senha.equals(nomeUsuario));

        System.out.println("Nome de usu�rio e senha cadastrados com sucesso ;)");
        scanner.close();
    }
}
